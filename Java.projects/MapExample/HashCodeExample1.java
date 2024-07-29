package MapExample;
import java.util.*;
public class HashCodeExample1 {
public static void main(String[] args) {
    Map<Student, Double> grade = new HashMap();
    Student st1 = new Student("Mirbek", "Idiris uulu", 3);
    Student st2 = new Student("Mira", "Ashyrova", 3);
    Student st3 = new Student("Ilim", "Idirisov", 2);
    Student st4 = new Student("Asim", "Idirisov", 1);
    Student st5 = new Student("Asim", "Idirisov", 1);
    grade.put(st1, 15.9);
    grade.put(st2, 18.3);
    grade.put(st3, 13.99);
    grade.put(st4, 19.0);
    System.out.println(grade.containsKey(st5));
}
}

class Student {
    String name, surname;
    int course;
    
    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", course=" + course + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + course;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        if (course != other.course)
            return false;
        return true;
    }
    
}
