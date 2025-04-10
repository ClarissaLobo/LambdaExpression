import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;

class Employee{
    String ename;
    int salary;
    String gender;

    Employee(String ename,int salary,String gender)
    {
        this.ename=ename;
        this.salary=salary;
        this.gender=gender;
    }
}



public class Test{
    public static void main(String[] args){
        ArrayList <Employee> emplist=new ArrayList<Employee>();
        emplist.add(new Employee("David",50000,"Male"));
        emplist.add(new Employee("John",30000,"Male"));
        emplist.add(new Employee("Mary",20000,"Female"));
        emplist.add(new Employee("Scott",50000,"Male"));

        //Function
        Function<Employee,Integer> f=emp->(emp.salary*10)/100; //task1

        //Predicate
        Predicate<Integer> p=b->b>=5000;

        Consumer<Employee> c=emp->{
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        	};
        for(Employee e:emplist){
        	int bonus=f.apply(e);      // calculate bonus //Invoked Function

        	if(p.test(bonus)){      //Invoked Predicate
        		c.accept(e);        // Invoked consumer
        		System.out.println(bonus);
        	}
        }

    }
}