package com.arhaminst.SpringBootDemoApplication.Controller;

import com.arhaminst.SpringBootDemoApplication.Student;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.random.RandomGenerator;

@RestController
public class GenralController
{

    @RequestMapping("/hi")
    public String sayHi()
    {
        return "Hi";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/aboutus")
    public String aboutus(){
        return "aboutus";
    }

    @RequestMapping("/contactus")
    public String contactus(){
        return "contactus";
    }

    @RequestMapping("/home/{name}")
    public String Welcome(@PathVariable("name") String name,@RequestParam("age") int age){
        return "Welcome "+name +" age is  "+age;
    }

    @RequestMapping("/student")
    public Student getRandomStudent(){

        Student student = new Student(1,"Vimal",34);
        return student;

    }

}
