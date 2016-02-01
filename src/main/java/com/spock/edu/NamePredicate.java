package com.spock.edu;

public class NamePredicate implements StudentPredicate {

  private String name;

  public NamePredicate(String name) {
    this.name = name;
  }

  @Override
  public boolean satisfy(Student student) {
    return name.equals(student.getName());
  }
}
