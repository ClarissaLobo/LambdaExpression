//Filter employees based on hike,salary/department and display their info

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

        //Predicate
        Predicate<Integer> p=b->b>=30000;

        Consumer<Employee> c=emp->{
            System.out.println(emp.name);
            System.out.println(emp.salary);
            System.out.println(emp.department);
        	};
        for(Employee e:emplist){
        	if(p.test(e.salary)){      //Invoked Predicate
        		c.accept(e);        // Invoked consumer
        		System.out.println(e.name);
        	}
        }

        


    }
    
}
