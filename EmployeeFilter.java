//Filter employees based on salary/department and display their info

import java.util.ArrayList;

class Employee{
    String name;
    int salary;
    String department;

    Employee(String name,int salary,String department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
}


public class EmployeeFilter {
    public static void main(String args[]){
        ArrayList<Employee> emplist=new ArrayList<Employee>();
        emplist.add(new Employee("Ruth", 40000,"CS"));
        emplist.add(new Employee("Maria", 20000,"EXTC"));
        emplist.add(new Employee("Sophie", 30000,"ES"));
        emplist.add(new Employee("Rani", 25000,"ME"));

        

    }
    
}
