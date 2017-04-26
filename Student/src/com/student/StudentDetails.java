package com.student;

import javax.jws.WebService;

@WebService
public interface StudentDetails {
  Student changeName(Student student);
}
