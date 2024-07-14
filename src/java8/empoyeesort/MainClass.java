package java8.empoyeesort;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee("Nagnedra", 29);
        Employee emp1 = new Employee("Devadiga", 30);
        Employee emp3 = new Employee("An", 20);
        Employee emp2 = new Employee("Anu", 26);


        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        for(Employee e: empList){
            System.out.println(e);
        }

        List<Employee> newList = empList.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).toList();

        //List<Employee> newList = empList.stream().sorted().toList();

        Iterator<Employee> itr = newList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
