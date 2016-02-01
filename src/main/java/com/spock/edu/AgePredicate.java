package com.spock.edu;

public class AgePredicate implements StudentPredicate {

  private int age;

  public AgePredicate(int age) {
    this.age = age;
  }

  @Override
  public boolean satisfy(Student student) {
    return student.getAge() == age;
  }
}
