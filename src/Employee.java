/**
 * Created by WTG on 18.07.2017.
 */
public class Employee {
    private String name;
    private String id;
    private int salary;


    public Employee(String name, String id, int salar) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void getVoice() {
        System.out.println("Głoss szarego pracownika ... ");
    }
}

