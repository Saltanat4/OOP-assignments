public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;
    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = this.subject;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public double giveRaise(double persentage) {
        double raise=0;
        if (yearsOfExperience > 10) {
            raise += salary * (persentage / 100);
        }
        return raise+salary;
    }
    @Override
    public String toString() {
        String genderName= gender? "male":"female";
        return "\nHi, I am"+" "+name+" "+surname+", a"+" "+age+"-year-old"+" "+"gender"+" "+genderName+" "+"I teach [" + " " + subject+" ]";

    }

}
