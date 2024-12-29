import java.util.ArrayList;
import java.util.List;
public class Student extends Person {
    private int studentID;
    private static int id=1;
    public List<Integer> grades;
    public List<Integer> getGrades() {
        return grades;
    }
    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
    public int createId() {
        studentID=id++;
        return studentID;
    }
    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.grades = new ArrayList<Integer>();
    }

    public int addGrade() {
        for (Integer grade : grades) {
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
                return grade;
            }
        }
        return 0;
    }
    public double calculateGPA (int[] grades) {
        double total = 0; int num=0;
        for (int grade : grades) {
            total += grade;
            num++;
        }
        return total /(double)num;
    }
    @Override
    public String toString () {
        String genderName = gender ? "male" : "female";
        return "\nHi, I am" + " " + name + " " + surname + ", a" + " " + age + "-year-old" + " " + "gender" + " " + genderName + " " + "I am a student with ID" + " " + createId();
    }
}
