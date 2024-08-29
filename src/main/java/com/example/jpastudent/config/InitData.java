package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
    Student s1 = new Student();
    s1.setName("hans");

    }
}
