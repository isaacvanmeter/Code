/*
 * Isaac Van Meter
 * 2/16/23
 * E-1
 * This is my own original work.
 */
package Java.SchoolFolder;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Ed Rooney", "US");
        School s1 = new School("Glenbrook North High School", "Illinois", p1);
        s1.toString();
        Student stud = new Student("Ferris Bueller", "US", s1);
        stud.toString();

        Person p2 = new Person("Mr. Nobody", "US");
        School s2 = new School("Westfield High School", "Illinois", p2);
        s2.toString();
        Student stud2 = new Student("Andie Walsh", "US", s2);
        stud2.toString();
    }
    
}
