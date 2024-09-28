import java.util.Vector;

public class Dragonlaunch {
    public Vector<Gender.GenderType> people = new Vector<>();
    public void kidnap(Person p) {
        people.add(p.gender);
    }
    public String willDragonEat(){
        int i = 1;
        while(i < people.size()){
            if (people.get(i - 1) == Gender.GenderType.B && people.get(i) == Gender.GenderType.G) {
                people.remove(i - 1);
                people.remove(i - 1);
                i = 1;
            } else {
                i++;
            }
        }
        if (people.isEmpty()) {
            return "Dragon doesn't eat";
        }
        return "Dragon eats";
    }
    public static void main(String[] args) {
        Dragonlaunch dragonlaunch = new Dragonlaunch();
        Person p1 = new Person("Zhanarys", Gender.GenderType.B);
        dragonlaunch.kidnap(p1);
        Person p2 = new Person("Zhanarys", Gender.GenderType.B);
        dragonlaunch.kidnap(p2);
        Person p3 = new Person("Zhanarys", Gender.GenderType.B);
        dragonlaunch.kidnap(p3);
        Person p4 = new Person("Who", Gender.GenderType.G);
        dragonlaunch.kidnap(p4);
        Person p5 = new Person("Who", Gender.GenderType.G);
        dragonlaunch.kidnap(p5);
        Person p6 = new Person("Who", Gender.GenderType.G);
        dragonlaunch.kidnap(p6);
        System.out.println(dragonlaunch.willDragonEat());
    }
}
