package com.student;

import javax.jws.WebService;

@WebService(endpointInterface = "com.student.StudentDetails")
public class StudentDetailsImpl implements StudentDetails {
    public Student changeName(Student student) {
      student.setName("Hello "+student.getName());
      return student;
    }
}