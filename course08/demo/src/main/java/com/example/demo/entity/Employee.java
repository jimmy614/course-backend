package com.example.demo.entity;
public class Employee{
    private Long id;
    private String name;
    private String department;
    private int pay;


  public Employee(Long id, String name, String department, int pay) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.pay = pay;
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getPay() {
    return this.pay;
  }

  public void setPay(int pay) {
    this.pay = pay;
  }

    
}