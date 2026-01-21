package com.fsad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.fsad.model.Student;

public class Mainapp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Student student = context.getBean("student", Student.class);
        student.display();
    }
}
