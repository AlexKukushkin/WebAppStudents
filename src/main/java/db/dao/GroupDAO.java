//package db.dao;
//
//import db.ConnectionManagerPostgreSQL;
//import db.IConnectionManager;
//import pojo.Group;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class GroupDAO implements IAbstractDAO<Group> {
//
//    public static class GroupDAOException extends Exception {
//
//    }
//
//    private static IConnectionManager manager;
//
//    static {
//        manager = ConnectionManagerPostgreSQL.getInstance();
//    }
//
//    @Override
//    public List<Group> getAll() throws GroupDAO.GroupDAOException {
//        List<Group> groupList = new ArrayList<>();
//        Statement statement = null;
//        try {
//            statement = manager.getConnection().createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.\"group\"");
//            while (resultSet.next()) {
//                Group Group = new Group(
//                        resultSet.getInt("id"),
//                        resultSet.getString("name"));
//                groupList.add(Group);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//        return groupList;
//    }
//
//    @Override
//    public Group getByID(int id) throws GroupDAO.GroupDAOException {
//        PreparedStatement statement = null;
//        try {
//            statement = manager.getConnection().prepareStatement("SELECT * FROM public.\"group\" WHERE id = ? ");
//            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//            resultSet.next();
//            return new Group(
//                    resultSet.getInt("id"),
//                    resultSet.getString("name"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//    }
//
//    private PreparedStatement getUpdateStatement() throws SQLException {
//        return manager.getConnection().prepareStatement(
//                "UPDATE public.\"group\" " +
//                        "SET name = ? WHERE id = ? ");
//    }
//    @Override
//    public void update(Group group) throws GroupDAO.GroupDAOException {
//        PreparedStatement statement = null;
//        try {
//            statement = getUpdateStatement();
//            statement.setInt(1, group.getGroupNum());
//            statement.setString(2, group.getGroupName());
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//    }
//
//    @Override
//    public void updateAll(List<Group> groupList) throws GroupDAO.GroupDAOException {
//        PreparedStatement statement = null;
//        try {
//            statement = getUpdateStatement();
//            for (Group group : groupList) {
//                statement.setInt(1, group.getGroupNum());
//                statement.setString(2, group.getGroupName());
//                statement.addBatch();
//            }
//            statement.executeBatch();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//    }
//
//    @Override
//    public void deleteByID(int id) throws GroupDAO.GroupDAOException {
//        PreparedStatement statement = null;
//        try {
//            statement = manager.getConnection().prepareStatement(
//                    "DELETE public.\"group\" WHERE id = ? ");
//            statement.setInt(1, id);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//    }
//
//    private PreparedStatement getInsertStatement() throws SQLException {
//        return manager.getConnection().prepareStatement(
//                "INSERT INTO public.\"group\"(id, name) VALUES (?, ?)");
//    }
//
//    @Override
//    public void insertOne(Group group) throws GroupDAO.GroupDAOException {
//        PreparedStatement statement = null;
//        try {
//            statement = getInsertStatement();
//            statement.setInt(1, group.getGroupNum());
//            statement.setString(2, group.getGroupName());
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//
//    }
//
//    @Override
//    public void insertAll(List<Group> groupList) throws GroupDAO.GroupDAOException {
//        PreparedStatement statement = null;
//        try {
//            statement = getInsertStatement();
//            for (Group group : groupList) {
//                statement.setInt(1, group.getGroupNum());
//                statement.setString(2, group.getGroupName());
//                statement.addBatch();
//            }
//            statement.executeBatch();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new GroupDAO.GroupDAOException();
//        }
//    }
//
//}
