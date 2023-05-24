package com.adi.stdenrollment.services;

import com.adi.stdenrollment.entities.student;
import com.adi.stdenrollment.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class studentServices {

  private static StudentRepository studentRepository;

  public studentServices(StudentRepository studentRepository) {
    studentServices.studentRepository = studentRepository;
  }

  public student create(student Student) {
    return studentRepository.save(Student);
  }

  public static List<student> findAll() {
    List<student> students = new ArrayList<>();
    studentRepository.findAll().forEach(students::add);
    return students;
  }

  public static Optional<student> findById(int id) {
    return studentRepository.findById(id);
  }

  public static student update(student studentToUpdate) {
    return studentRepository.save(studentToUpdate);
  }

  public static void delete(int id) {
    studentRepository.deleteById(id);
  }

}
