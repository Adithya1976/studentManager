package com.adi.stdenrollment.entities;

import jakarta.persistence.*;

@Table(name = "studentDetails")
@Entity
public class student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "roll_no", nullable = false)
  private Integer rollNo;

  @Column(name = "first_name", nullable = false, length = 50)
  private String firstName;

  @Column(name = "last_name", nullable = false, length = 50)
  private String lastName;

  @Column(name = "father_first_name", nullable = false, length = 50)
  private String fatherFirstName;

  @Column(name = "father_last_name", nullable = false, length = 50)
  private String fatherLastName;

  @Column(name = "mother_first_name", nullable = false, length = 50)
  private String motherFirstName;

  @Column(name = "mother_last_name", nullable = false, length = 50)
  private String motherLastName;

  @Column(name = "class_no", nullable = false, columnDefinition = "INT CHECK (class_no >= 1 AND class_no <= 12)")
  private Integer classNo;

  @Column(name = "home_address", nullable = false, length = 1000)
  private String homeAddress;

  public Integer getRollNo() {
    return rollNo;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFatherFirstName(String fatherFirstName) {
    this.fatherFirstName = fatherFirstName;
  }

  public String getFatherFirstName() {
    return fatherFirstName;
  }

  public void setFatherLastName(String fatherLastName) {
    this.fatherLastName = fatherLastName;
  }

  public String getFatherLastName() {
    return fatherLastName;
  }

  public void setMotherFirstName(String motherFirstName) {
    this.motherFirstName = motherFirstName;
  }

  public String getMotherFirstName() {
    return motherFirstName;
  }

  public void setMotherLastName(String motherLastName) {
    this.motherLastName = motherLastName;
  }

  public String getMotherLastName() {
    return motherLastName;
  }

  public void setClassNo(Integer classNo) {
    this.classNo = classNo;
  }

  public Integer getClassNo() {
    return classNo;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }

  public String getHomeAddress() {
    return homeAddress;
  }
}