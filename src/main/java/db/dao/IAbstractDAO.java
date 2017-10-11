package db.dao;

import java.util.Collection;
import java.util.List;

public interface IAbstractDAO <T>{

    Collection<T> getAll() throws Exception;

    T getByID(int id) throws Exception;

    void update(T obj) throws Exception;

    void updateAll(List<T> objColl) throws Exception;

    void deleteByID(int id) throws Exception;

    void insertOne(T obj) throws Exception;

    void insertAll(List<T> objColl) throws Exception;
}
