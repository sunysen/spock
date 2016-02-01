import com.spock.ServiceStudent
import com.spock.Student
import spock.lang.Specification

class ServiceStudentTest extends Specification {
    def serviceStudent = new ServiceStudent();

    def "find student by condition"() {
        expect:
        def students = [new Student(18),new Student("hongsen")] as Student[];
        serviceStudent.find(students, student -> student.getAge() == 18) != null
        serviceStudent.find(students, "hongsen".equals(student -> student.getName())) != null
    }
}
