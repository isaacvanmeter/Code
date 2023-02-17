package Java.SchoolFolder;

public class School {
    private String name = "absent";
    private String state = "MD";
    private Person principal = new Person("Mr.", "US");

    public School(String name, String state, Person principal){
        this.name = name;
        this.state = state;
        this.principal = principal;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public Person getPrincipal(){
        return principal;
    }

    public void setPrincipal(Person principal){
        this.principal = principal;
    }

    @Override
    public String toString() {
        String s = "School: " +
        "name='" + name + '\'' +
        ", state='" + state + '\'' +
        ", principal=" + principal;
        System.out.println(s);
        return s;
    }

}
