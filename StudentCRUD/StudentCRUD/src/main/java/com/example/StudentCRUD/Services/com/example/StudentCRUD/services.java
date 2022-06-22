package com.example.StudentCRUD.Services.com.example.StudentCRUD;

import com.example.StudentCRUD.entities.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class services {

    List<Employees> list;
    public services() {
        list = new ArrayList<>();
        list.add(new Employees(4343, "book", "Its java"));
    }

    public List<Employees> getemployee() {
        return list;
    }

    public Employees getemployee(Long empid) {

        Employees c = null;
        for (Employees emp : list)
            if (emp.getId() == empid) {
                c = emp;
                break;
            }

        return c;
    }

    public Employees addemployee( Employees emp){
        list.add(emp);
        return emp;
    }

    public Employees updateemployee( Employees emp){

        list.forEach(e ->{
            if( e.getId()==emp.getId()){
                e.setName(emp.getName());
                e.setDepartment(emp.getDepartment());
            }
        });
                return emp;
    }
    }

