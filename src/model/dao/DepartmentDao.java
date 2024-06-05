package model.dao;

import model.entities.Department;

import java.util.List;

/**
 * Interface that defines which operations will be used to interact with the class "Department".
 */
public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);

    List<Department> findAll();
}
