package com.arhaminst.SpringBootDemoApplication.Controller;

import com.arhaminst.SpringBootDemoApplication.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*

         /student/new
         /student/view
         /student/update

       unofficial data
         /student/1/vimal/34
         1) Pathvariable
         /student/{rollno}/{name}/{age}
         2) QueryParameter or QueryParam
         /student?rollno=1&name="amit"&age=34
    official data
         /student            Method = POST ,put,delete
         /Request Body

    http methods
    get      get or retrive all records
    post    save new record
    put     update new record
    delete  delete new record


    Rest API

    /student?age=34           method : get       : get all the records            QueryParameter
    /student                  method : post       / save the record              RequestBody
    /student                  method : put         / update the record            RequestBody
    /student                 method  : delete      / delete the record.           RequestBody





 */



@RestController
@RequestMapping("/student")
public class StudentController
{

    @RequestMapping("/new")    // /student/new
     public String addNewStudent()
    {
        return "Add New Student has been called";
    }

    @RequestMapping("/view")
    public Student viwStudent()
    {
        Student student = new Student(1,"vimal",34,23000);
        //return "View Student has been called";
        return student;
    }

    @RequestMapping("/update")
    public String updateStudent()
    {
        return "Update Student has been called";
    }

    @RequestMapping("/view/all")
    public List<Student> viewAllStudent()
    {
         List<Student> students = new ArrayList<Student>();
         students.add(new Student(1,"vimal",34,23000));
         students.add(new Student(2,"viren",34,45000));
         students.add(new Student(3,"vijay",34,65000));
         students.add(new Student(4,"amit",34,75000));
         students.add(new Student(5,"jay",34,85000));
         return students;
    }



}
