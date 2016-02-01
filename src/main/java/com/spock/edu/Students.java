package com.spock.edu;

public final class Students {

  public static Student find(Student[] students, StudentPredicate pred) {
    for (Student student : students) {
      if (pred.satisfy(student)) {
        return student;
      }
    }
    return null;
  }

  private Students() {
  }
}
