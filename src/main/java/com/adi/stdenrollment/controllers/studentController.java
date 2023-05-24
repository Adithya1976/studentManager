package com.adi.stdenrollment.controllers;

import com.adi.stdenrollment.entities.student;
import com.adi.stdenrollment.requests.CreateStudentInput;
import com.adi.stdenrollment.requests.UpdateStudentInput;
import com.adi.stdenrollment.services.studentServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class studentController {

  public studentServices studentService;

  public studentController(studentServices studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/studentDetails")
  public ResponseEntity<student> createStudent(@RequestBody CreateStudentInput createStudentInput) {
    student studentCreated = studentService.create(createStudentInput.toStudent());

    return new ResponseEntity<>(studentCreated, HttpStatus.CREATED);
  }

  @GetMapping("/studentDetails")
  public ResponseEntity<List<student>> allStudents() {
    List<student> students = studentServices.findAll();

    return new ResponseEntity<>(students, HttpStatus.OK);
  }

  @GetMapping("/studentDetails/{id}")
  public ResponseEntity<student> oneStudent(@PathVariable int id) {
    Optional<student> optionalTask = studentServices.findById(id);

    return optionalTask.map(student -> new ResponseEntity<>(student, HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

  }

  @PutMapping("/studentDetails/{id}")
  public ResponseEntity<student> updateTask(@PathVariable int id,
      @RequestBody UpdateStudentInput updateStudentInput) {
    Optional<student> optionalStudent = studentServices.findById(id);

    if (optionalStudent.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    student studentToUpdate = optionalStudent.get();

    studentToUpdate.setFirstName(updateStudentInput.firstName());
    studentToUpdate.setLastName(updateStudentInput.lastName());
    studentToUpdate.setFatherFirstName(updateStudentInput.fatherFirstName());
    studentToUpdate.setFatherLastName(updateStudentInput.fatherLastName());
    studentToUpdate.setMotherFirstName(updateStudentInput.motherFirstName());
    studentToUpdate.setMotherLastName(updateStudentInput.motherLastName());
    studentToUpdate.setClassNo(updateStudentInput.classNo());
    studentToUpdate.setHomeAddress(updateStudentInput.homeAddress());

    student taskUpdated = studentServices.update(studentToUpdate);

    return new ResponseEntity<>(taskUpdated, HttpStatus.OK);
  }

  @DeleteMapping("/studentDetails/{id}")
  public ResponseEntity<Void> deleteStudent(@PathVariable int id) {
    studentServices.delete(id);

    return ResponseEntity.noContent().build();
  }
}
