import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Saltanat", "Botabaeva", 17, false);

        System.out.println(person);
        List<Integer> grade = new ArrayList<>();
        Student s = new Student("Harry", "Potter", 21, true, grade);
        grade.add(78);
        grade.add(89);
        grade.add(99);
        grade.add(51);
        System.out.println(s);
        List<Integer> g1 = new ArrayList<>();
        Student s1 = new Student("Ron", "Qeasley", 20, true, g1);
        g1.add(78);
        g1.add(89);
        g1.add(75);
        g1.add(63);
        g1.add(82);
        System.out.println(s1);
        Teacher t = new Teacher("Severus", " Snape", 51, true, "math", 7, 80000);
        System.out.println(t);
        System.out.println(t.giveRaise(10));
        Teacher t1 = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 150000);
        System.out.println(t1);
        System.out.println(t1.giveRaise(10));
        Teacher t2 = new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000
        );
        System.out.println(t2);
        System.out.println(t2.giveRaise(10));
        School school = new School();
        school.addMember(s);
        school.addMember(s1);
        school.addMember(t);
        school.addMember(t1);
        school.addMember(t2);
        System.out.println(school);
    }
}
