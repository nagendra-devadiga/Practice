package java8.empoyeesort;

import java.util.Date;

class Employee implements Comparable {
    private final String empName;
    private final int age;
    public Employee(String name, int age) {
        super();
        this.empName = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public boolean equals(Object obj) {
        return this.empName.equalsIgnoreCase(((Employee) obj).empName) && this.age == ((Employee) obj).age;
    }

    @Override
    public int hashCode() {
        return this.empName.length();
    }

    @Override
    public String toString() {
        return "My name: "+ empName + " , My age: "+ age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((Employee) o).age;
    }
}