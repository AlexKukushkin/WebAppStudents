package db.dao;

import db.ConnectionManagerPostgreSQL;
import db.IConnectionManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO implements IAbstractDAO<Student> {

    public static class StudentDAOException extends Exception {

    }

    private static IConnectionManager manager;
    private static final Logger logger = Logger.getLogger(StudentDAO.class);

    static {
        manager = ConnectionManagerPostgreSQL.getInstance();
        //PropertyConfigurator.configure("log4j.properties");
    }

    @Override
    public List<Student> getAll() throws StudentDAOException {
        List<Student> studentList = new ArrayList<>();
        logger.debug("log for getAll Students");
        Statement statement = null;
        try {
            statement = manager.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT st.*, gr.name\n" +
                    "FROM public.\"student\" st LEFT JOIN public.\"group\" gr ON st.\"group_id\" = gr.id;");
            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("second_name"),
                        resultSet.getString("family_name"),
                        resultSet.getString("birth_date"),
                        resultSet.getInt("group_id"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
        return studentList;
    }

    @Override
    public Student getByID(int id) throws StudentDAOException {
        PreparedStatement statement = null;
        try {
            statement = manager.getConnection().prepareStatement("SELECT * FROM public.\"student\" WHERE id = ? ");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            return new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("second_name"),
                    resultSet.getString("family_name"),
                    resultSet.getString("birth_date"),
                    resultSet.getInt("group_id"));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
    }

    private PreparedStatement getUpdateStatement() throws SQLException {
        return manager.getConnection().prepareStatement(
                "UPDATE public.\"student\" " +
                        "SET first_name = ?, second_name = ?, family_name = ?, birth_date = ?, group_id = ?" +
                        "WHERE id = ? ");
    }
    @Override
    public void update(Student student) throws StudentDAOException {
        PreparedStatement statement = null;
        try {
            statement = getUpdateStatement();
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getSecondName());
            statement.setString(3, student.getFamilyName());
            statement.setDate(4, Date.valueOf(student.getBirthDay()));
            statement.setInt(5, student.getGroup_id());
            statement.setInt(6, student.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
    }

    @Override
    public void updateAll(List<Student> objList) throws StudentDAOException {
        PreparedStatement statement = null;
        try {
            statement = getUpdateStatement();
            for (Student student : objList) {
                statement.setString(1, student.getFirstName());
                statement.setString(2, student.getSecondName());
                statement.setString(3, student.getFamilyName());
                statement.setDate(4, Date.valueOf(student.getBirthDay()));
                statement.setInt(5, student.getGroup_id());
                statement.setInt(6, student.getId());
                statement.addBatch();

            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
    }

    @Override
    public void deleteByID(int id) throws StudentDAOException {
        PreparedStatement statement = null;
        try {
            statement = manager.getConnection().prepareStatement(
                    "DELETE FROM public.\"student\" WHERE id = ? ");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
    }

    private PreparedStatement getInsertStatement() throws SQLException {
        return manager.getConnection().prepareStatement(
                "INSERT INTO public.\"student\" " +
                        "(id, first_name, second_name, family_name, birth_date, group_id) VALUES(?, ?, ?, ?, ?, ?)");
    }

    @Override
    public void insertOne(Student student) throws StudentDAOException {
        PreparedStatement statement = null;
        try {
            statement = getInsertStatement();
            statement.setInt(1, student.getId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getSecondName());
            statement.setString(4, student.getFamilyName());
            statement.setDate(5, Date.valueOf(student.getBirthDay()));
            statement.setInt(6, student.getGroup_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
    }

    @Override
    public void insertAll(List<Student> studentList) throws StudentDAOException {
        PreparedStatement statement = null;
        try {
            statement = getInsertStatement();
            for (Student student : studentList) {
                statement.setInt(1, student.getId());
                statement.setString(2, student.getFirstName());
                statement.setString(3, student.getSecondName());
                statement.setString(4, student.getFamilyName());
                statement.setDate(5, Date.valueOf(student.getBirthDay()));
                statement.setInt(6, student.getGroup_id());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new StudentDAOException();
        }
    }
}
