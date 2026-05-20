import java.util.List;
import java.util.ArrayList;

public class seventeen {
    public static void main(String[] args) {
        Dept it = new Dept("INFORMATION TECHNOLOGY", 2001, 0);
        Employee e1 = new Employee("A", 0, 10000);
        Employee e2 = new Employee("B", 1, 10);
        Employee e3 = new Employee("C", 2, 200000);
        Employee e4 = new Employee("D", 0, 100);
        Employee e5 = new Employee("E", 3, 50000);
        it.addEmployee(e1);
        it.addEmployee(e2);
        it.addEmployee(e3);
        it.addEmployee(e4);
        it.addEmployee(e5);
        System.out.println("The annual salary to be paid is: "+it.getAnnualSalary());
    }
}

class Employee{
    private String name;
    private int id, address;
    static int genid = 1000;
    private float salary;
    Employee(String name, int address, float salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.id = genid++;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAddress(){
        return this.address;
    }
    public float getSalary(){
        return this.salary;
    }
}

class Dept{
    String name;
    int year, location;
    List<Employee> list;
    Dept(String name, int year, int location){
        this.name = name;
        this.year = year;
        this.location = location;
        list = new ArrayList<>();
    }
    public void addEmployee(Employee e){
        list.add(e);
    }
    public void deleteEmployee(int id){
        Employee edel = null;
        for(Employee e:list){
            if(e.getId()==id) {
                edel = e;
                break;
            }
        }
        if(edel==null) System.out.println("Employee not found");
        else{
            System.out.println("Employee deleted. ");
            list.remove(edel);
        }
    }
    public void display(){
        for(Employee e:list){
            System.out.println("Employee name: "+e.getName()+" ID: "+e.getId());
        }
    }
    public float getAnnualSalary(){
        float sum=0;
        for(Employee e:list){
            sum+=e.getSalary();
        }
        return sum;
    }
}
