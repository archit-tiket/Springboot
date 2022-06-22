 package com.example.StudentCRUD.controller;


 import com.example.StudentCRUD.Services.com.example.StudentCRUD.services;
 import com.example.StudentCRUD.entities.Employees;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

 @RestController
public class Mycontroller {

     @Autowired
     private services employeeservice;
     @GetMapping("/home")
     public String home(){
         return "this is home page!";
     }

     @GetMapping("/")
     public String h(){
         return "Invalid!!";
     }
     //get courses
     @GetMapping("/employee")
     public List<Employees> getemployee(){
//         return "courses!";
         return this.employeeservice.getemployee();
     }

     //get course by ID
     @GetMapping("/employee/{empid}")
     public Employees getcourses(@PathVariable String empid){

         return this.employeeservice.getemployee(Long.parseLong(empid));
     }

     //add course
     @PostMapping("/employee")
     public Employees addemployee(@RequestBody Employees emp){

         return this.employeeservice.addemployee(emp);
     }

     //update course(title & desc)
     @PutMapping("/employee")
     public Employees updateemployee(@RequestBody Employees emp){

         return this.employeeservice.updateemployee(emp);
     }
}
