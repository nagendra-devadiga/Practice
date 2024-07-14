package immutable;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"), new Date());
        Address address = emp.getAddress();
        System.out.println(address);
        address.setAddress("Hi-tech City");
        address.setAddressType("Office");
        address.setCity("Hyderabad");
        System.out.println(emp.getAddress());
        Date d = emp.getDate();
        System.out.println(d);
        d.setTime(20);
        System.out.println(d);
        System.out.println(emp.getDate());
    }
}