package Exam;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UserPermissionTest {

    @Test
    public void testDataLoad() {
        Runner runner = new Runner();
        assertThat(runner.getEmployeeCount(), equalTo(16));
        assertThat(runner.getUserCount(), equalTo(4));
    }

    @Test
    public void addEmployeeTest() {
        Runner runner = new Runner();
        Employee newEmployee = new Employee();
        runner.addNewEmployee(newEmployee);
        assertThat(runner.getEmployeeCount(), equalTo(17));
    }

    @Test
    public void getEmployeeByIdTest() {
        Runner runner = new Runner();
        Employee emp = runner.getEmployeeById(4);
        assertThat(emp.getName(), equalTo("Cherly"));
    }

    @Test
    public void updateEmployeeTest() {
        Runner runner = new Runner();
        Employee emp = runner.getEmployeeById(7);
        emp.setName("New Name");
        emp.setDempartment("New Department");
        emp.setOffice("New Office");
        assertThat(emp.getName(), equalTo("New Name"));
        assertThat(emp.getDepartment(), equalTo("New Department"));
        assertThat(emp.getOffice(), equalTo("New Office"));
    }

    @Test
    public void testForUserJohn() {
        Runner runner = new Runner();
        List<Employee> employees = runner.getEmployeesByUserId(1);
        assertThat(employees.size(), equalTo(9));
    }

    @Test
    public void testForUserTom() {
        Runner runner = new Runner();
        List<Employee> employees = runner.getEmployeesByUserId(2);
        assertThat(employees.size(), equalTo(7));
    }

    @Test
    public void testForUserAdam() {
        Runner runner = new Runner();
        List<Employee> employees = runner.getEmployeesByUserId(3);
        assertThat(employees.size(), equalTo(7));
    }

    @Test
    public void testForUserLina() {
        Runner runner = new Runner();
        List<Employee> employees = runner.getEmployeesByUserId(4);
        assertThat(employees.size(), equalTo(8));
    }

    @Test
    public void addEmployeeTestUserAccess() {
        Runner runner = new Runner();
        Employee newEmployee = new Employee(17, "New Employee", "Pune", "IT", "Team B");
        runner.addNewEmployee(newEmployee);
        assertThat(runner.getEmployeeCount(), equalTo(17));
        assertThat(runner.getEmployeesByUserId(1).size(), equalTo(10));
        assertThat(runner.getEmployeesByUserId(2).size(), equalTo(7));
        assertThat(runner.getEmployeesByUserId(3).size(), equalTo(8));
        assertThat(runner.getEmployeesByUserId(4).size(), equalTo(8));
    }

    @Test
    public void addEmployeeTestUserAccess2() {
        Runner runner = new Runner();
        Employee newEmployee = new Employee(17, "New Employee", "Delhi", "HR", "Team C");
        runner.addNewEmployee(newEmployee);
        assertThat(17, equalTo(runner.getEmployeeCount()));
        assertThat(runner.getEmployeesByUserId(1).size(), equalTo(9));
        assertThat(runner.getEmployeesByUserId(2).size(), equalTo(8));
        assertThat(runner.getEmployeesByUserId(3).size(), equalTo(7));
        assertThat(runner.getEmployeesByUserId(4).size(), equalTo(9));
    }

    @Test
    public void updateEmployeeTestUserAccess() {
        Runner runner = new Runner();
        Employee employee = runner.getEmployeeById(9);
        employee.setDempartment("IT");
        employee.setOffice("Mumbai");
        employee.setTeam("Team C");
        assertThat(runner.getEmployeesByUserId(1).size(), equalTo(10));
        assertThat(runner.getEmployeesByUserId(2).size(), equalTo(8));
        assertThat(runner.getEmployeesByUserId(3).size(), equalTo(6));
        assertThat(runner.getEmployeesByUserId(4).size(), equalTo(8));
    }

    @Test
    public void newUserTest() {
        Runner runner = new Runner();
        ArrayList<String> rules = new ArrayList<>();
        rules.add("Team B");
        rules.add("Finance");
        User user = new User(5, "Siva", rules);
        runner.addNewUser(user);

        assertThat(runner.getEmployeesByUserId(5).size(), equalTo(6));
    }
}
