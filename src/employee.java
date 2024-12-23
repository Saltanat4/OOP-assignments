public class employee {
    public static int id=1;
    private int id_gen;
    private String name;
    private int age;
    private String surname;
    private boolean gender;
    private int salary;
    private String position;
public employee() {
    id_gen = id++;
}
public employee(int id, String name, int age, String surname, boolean gender, int salary, String position) {
this.id=id;
this.name=name;
this.age=age;
this.surname=surname;
this.gender=gender;
this.salary=salary;
this.position=position;
    }
    public int getId(){
    return id;
    }
    public String getName(){
    return name;
    }
    public int getAge(){
    return age;}
    public String getSurname(){
    return surname;
    }
    public boolean getGender(){
    return gender;
    }
    public int getSalary(){
    return salary;
    }
    public String getPosition(){
    return position;
    }
    public void setId(int id){
    this.id=id;
    }
    public void setName(String name){
    this.name=name;
    }
    public void setAge(int age){
    this.age=age;
    }
    public void setSurname(String surname){
    this.surname=surname;
    }
    public void setGender(boolean gender){
    this.gender=gender;
    }
    public void setSalary(int salary){
    this.salary=salary;
    }
    public void setPosition(String position){
    this.position=position;
    }
    public String toString(){
    return "id"+id_gen+" "+"Full name"+name+" "+surname+" "+gender+" "+salary+" "+position;
    }
}