package com.example.StudentCRUD.entities;

public class Employees {

    private long id;
    private String name;
    private String department;

    public Employees( long id, String name, String department){
        super();
        this.id= id;
        this.name= name;
        this.department= department;
    }

    public Employees(){
        super();
    }

    public void setName(String name){
        this.name= name;
    }
    public void setId(Long id){
        this.id= id;
    }
    public void setDepartment(String department){
        this.department= department;
    }

    public String getName(){
        return name;
    }
    public long getId(){
        return id;
    }
    public String getDepartment(){
        return department;
    }

    public String toString(){
        return "Employees [ID= "+id+", Department= "+department+", name ="+name+" " ;
    }
}
