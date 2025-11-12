import java.util.HashMap;
public class Hashing {
    public static void main(String[] args) {
        HashMap<Student, B> map = new HashMap<>();
        map.put(new Student("Eric", 123, 19), new B());
        System.out.println(map.size());

        Student bob = new Student("Bob", 124, 4);
        System.out.println(bob.hashCode());
    }

    public static class Student {
        String name;
        int studentNumber;
        int year;

        public Student(String name, int studentNumber, int year) {
            this.name = name;
            this.studentNumber = studentNumber;
            this.year = year;
        }

        @Override public boolean equals (Object o) {
            if (this == o) { return true; }
            if (!(o instanceof Student)) { return false; }
            Student s = (Student) o;
            return this.name.equals(s.name) && this.studentNumber == s.studentNumber && this.year == s.year;
        }

        @Override public int hashCode() { return this.name.length() * studentNumber * year; }
    }

    public static class B {
        String str;

        public B() { str = "random, but wait, this isn't random, its fixed"; }
    }
}
