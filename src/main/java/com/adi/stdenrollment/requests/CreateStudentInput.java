package com.adi.stdenrollment.requests;

import com.adi.stdenrollment.entities.student;

public record CreateStudentInput(
    String firstName,
    String lastName,
    String fatherFirstName,
    String fatherLastName,
    String motherFirstName,
    String motherLastName,
    Integer classNo,
    String homeAddress
) {

  public student toStudent() {
    student Student = new student();

    Student.setFirstName(firstName);
    Student.setLastName(lastName);
    Student.setFatherFirstName(fatherFirstName);
    Student.setFatherLastName(fatherLastName);
    Student.setMotherFirstName(motherFirstName);
    Student.setMotherLastName(motherLastName);
    Student.setClassNo(classNo);
    Student.setHomeAddress(homeAddress);

    return Student;
  }
}
