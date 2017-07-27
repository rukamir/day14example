package com.allstate.compozed.teacherspet.students;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by localadmin on 7/27/17.
 */

@RestController
@RequestMapping("/students")
final class StudentsController {

    @CrossOrigin
    @GetMapping("")
    List<StudentModel> getStudents() {
        final StudentModel studentModel1 = new StudentModel();
        final StudentModel studentModel2 = new StudentModel();
        final StudentModel studentModel3 = new StudentModel();

        studentModel1.setName("Dale Lotts");
        studentModel2.setName("John Smith");
        studentModel3.setName("Jane Doe");
        return Arrays.asList(studentModel1, studentModel2, studentModel3);

    }
}
