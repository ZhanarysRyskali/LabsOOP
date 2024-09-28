public class Person {
    public String name;
    public Gender.GenderType gender;

    public Person(String name, Gender.GenderType gender) {
        this.name = name;
        this.gender = gender;
    }
    public String toString(){
        return name + "\n" + gender.toString();
    }
}