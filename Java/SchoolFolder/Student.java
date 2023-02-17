package Java.SchoolFolder;

public class Student extends Person {
    private Person principal = new Person("none", "none");
    private School school = new School("none", "none", principal);

    public Student(String name, String citizen, School school) {
        super(name, citizen);
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object obj) {

        Student other = (Student) obj;
        return (school.equals(other.school)) && super.equals(other);

    }

    @Override
    public String toString() {
        String s = "\nStudent [name  = " + super.getName() +
                " Citizen=" + super.getCitizen() + " school=" + school + "]";
        System.out.println(s);
        return s;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
