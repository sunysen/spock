package com.spock.edu;


public final class Teachers {

    public static Teacher find(Iterable<Teacher> teachers, TeacherPredicate pred) {
        for (Teacher teacher : teachers) {
            if (pred.satisfy(teacher)) {
                return teacher;
            }
        }
        return null;
    }

    private Teachers() {
    }
}
