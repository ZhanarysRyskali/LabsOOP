public class Course {
    String name;
    String description;
    int noc;
    String prerequisite;

    public Course(String name, String description, int noc, String prerequisite) {
        this.name = name;
        this.description = description;
        this.noc = noc;
        this.prerequisite = prerequisite;
    }


    public String toString() {
        return name + ": " + description + " (" + noc + " credits, Prerequisite: " + prerequisite + ")";
    }
}
