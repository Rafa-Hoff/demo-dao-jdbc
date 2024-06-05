package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/**
 * DAO Factory is responsible to instantiate the DAOs (Data Access Object).
 */
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConection());
    }
    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConection());
    }
}
