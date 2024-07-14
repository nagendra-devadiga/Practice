package immutable;

import java.util.Date;

final class Employee {
    private final String empName;
    private final int age;
    private final Address address;
    private Date date;
    public Employee(String name, int age, Address address, Date date) {
        super();
        this.empName = name;
        this.age = age;
        this.address = address;
        this.date = date;
    }
    public String getEmpName() {
        return empName;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }
    public Date getDate() throws CloneNotSupportedException {
        return (Date) date.clone();
    }
}