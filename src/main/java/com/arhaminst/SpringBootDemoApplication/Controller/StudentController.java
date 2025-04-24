package com.arhaminst.SpringBootDemoApplication.Controller;

import com.arhaminst.SpringBootDemoApplication.Student;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

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
//@RequestMapping("/student")
public class StudentController
{

    List<Student> students = new ArrayList<Student>();


     @RequestMapping(value = "/student", method = RequestMethod.POST)// /student/new
     //@PostMapping("/student")
     public String addNewStudent(@RequestBody Student student)
    {
        students.add(student);
        return "Add New Student has been called";
    }

    @RequestMapping("/view")
    public Student viwStudent()
    {
        Student student = new Student(1,"vimal",34,23000);
        //return "View Student has been called";
        return student;
    }

    @RequestMapping(value = "/student",method = RequestMethod.PUT)
    public String updateStudent(@RequestBody Student student)
    {
        for(Student s : students)
        {
            if(s.getRollno()==student.getRollno())
            {
                s.setName(student.getName());
                s.setAge(student.getAge());
                s.setFees(student.getFees());
                break;
            }
        }

        return "Student Record has been updated";
    }


    @RequestMapping(value = "/student",method = RequestMethod.DELETE)
     public String deleteStudent(@RequestBody Student student){

         int deleteindex=0;
         int index=0;
         for(Student s : students)
         {
              if(s.getRollno()== student.getRollno())
              {
                  deleteindex=index;
                  break;
              }
              index++;
         }
         students.remove(deleteindex);

        return "Student Record has been deleted";
     }


    @RequestMapping(value = "/student",method = RequestMethod.GET)
    //@GetMapping
    public List<Student> viewAllStudent()
    {
         return students;
    }

  /*   @RequestMapping("/error")
     public String errormsg()
     {
         return "Website is under maintenance come back later";
     }*/

}
