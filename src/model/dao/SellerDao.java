package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

/**
 * Interface that defines which operations will be used to interact with the class "Seller".
 */
public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}