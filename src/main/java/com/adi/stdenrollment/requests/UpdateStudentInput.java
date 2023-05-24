package com.adi.stdenrollment.requests;

public record UpdateStudentInput(
        String firstName,
        String lastName,
        String fatherFirstName,
        String fatherLastName,
        String motherFirstName,
        String motherLastName,
        Integer classNo,
        String homeAddress
)  {

}
