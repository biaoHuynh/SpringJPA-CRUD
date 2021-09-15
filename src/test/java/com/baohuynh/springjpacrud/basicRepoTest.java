package com.baohuynh.springjpacrud;


import com.baohuynh.springjpacrud.entity.basic;
import com.baohuynh.springjpacrud.reponsitory.basicrepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class basicRepoTest {

    @Autowired
    private basicrepo basicrepo;

    @Test
    void saveStudent(){
        basic student = basic.builder()
                .firstName("Huynh")
                .lastName("Bao")
                .email("hnquocbao22@gmail.com")
                .build();

        basicrepo.save(student);
    }

    @Test
    void printAllStudent(){
        List<basic> basicList=basic.findAll();
        System.out.println("list-student" + basicList);
    }

    @Test
    void deleteStudentById(){
        basicrepo.deleteById(2L);
    }

    @Test
    void updateStudentById(){
        Student student=studentRepository.getById(1L);
        Student studentUp = studentRepository.save(
                new Student(
                        student.getId(),
                        "hnquocbao22@gmail.com",
                        student.getFirstName(),
                        student.getLastName()
                )
        );
    }
    @Test
    void getStudentByEmailJPQL(){
        Student student = studentRepository.getStudentByEmail("huynhbao@gmail.com");
        System.out.println("student get by email JPQL:" + student);
    }

    @Test
    void getStudentByFLNameJPQL(){
        Student student = studentRepository.getStudentByFLName("A", "B");
        System.out.println("student get by FirstName and LastName JPQL:" + student);
//        System.out.println("student get by FirstName and LastName JPQLtest:" + student);
    }
}
