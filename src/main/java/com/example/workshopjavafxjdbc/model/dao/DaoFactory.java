package com.example.workshopjavafxjdbc.model.dao;

import com.example.workshopjavafxjdbc.db.DB;
import com.example.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.example.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;
import java.sql.Statement;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());

    }
}
