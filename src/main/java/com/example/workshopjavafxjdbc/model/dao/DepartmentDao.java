package com.example.workshopjavafxjdbc.model.dao;

import com.example.workshopjavafxjdbc.model.entities.Department;

import java.util.List;
import java.sql.Statement;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
