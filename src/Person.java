public class Person {
    public String name;
    public String surname;
    public int age;
    public boolean gender;
    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
   public String getName(){
        return name;
   }
   public String getSurname(){
        return surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean getGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderName= gender? "male":"female";
        return "Hi, I am"+" "+name+" "+surname+", a"+" "+age+"-year-old"+" "+" "+"gender"+" "+genderName+".";
    }
}

