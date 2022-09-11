package Test;

import Application.Employee;

public class test {

    public static void main(String[] args) {
        Employee.BuilderEmp employee = new Employee.BuilderEmp();
        employee.setEmailId("taha@atadev.com");
        employee.setFirstName("Taha");
        employee.setFullTime(true);
        employee.setMarried(false);
        employee.setLastName("Shorafa");
        employee.setSalary(1200);
        employee.setNumberOfHours(7);
        Employee result = employee.build();

        System.out.println(employee.getDetails());
    }
}
