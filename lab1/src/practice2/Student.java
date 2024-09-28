package practice2;

public class Student {
    private String name;
    private int id;
    private int year_of_study;
    public String surname;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.year_of_study = 1;
    }
    public Student(String surname){
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int incrementYear(){
        return this.year_of_study += 1;
    }
    public String toString() {
        return "Student[name=" + name + ", id=" + id + ", year_of_study=" + year_of_study + ", surname=" + surname + "]";
    }
}
