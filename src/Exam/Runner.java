package Exam;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public Runner() {
        loadData();
    }

    List<Employee> emp = new ArrayList<>();
    List<User> users = new ArrayList<>();

    private void loadData() {
        emp.add(new Employee (1, "Albert", "Delhi", "IT", "Team A"));
        emp.add(new Employee (2, "Chris", "Pune", "IT", "Team B"));
        emp.add(new Employee (3, "Emily", "Mumbai", "Finance", "Team C"));
        emp.add(new Employee (4, "Cherly", "Hyderabad", "HR", "Team D"));
        emp.add(new Employee (5, "Jayden", "Delhi", "HR", "Team A"));
        emp.add(new Employee (6, "Mitchell", "Hyderabad", "IT", "Team B"));
        emp.add(new Employee (7, "Russel", "Mumbai", "IT", "Team C"));
        emp.add(new Employee (8, "Tyler", "Mumbai", "IT", "Team D"));
        emp.add(new Employee (9, "David", "Pune", "HR", "Team A"));
        emp.add(new Employee (10, "Henri", "Hyderabad", "IT", "Team B"));
        emp.add(new Employee (11, "Brady", "Delhi", "HR", "Team C"));
        emp.add(new Employee (12, "Rica", "Pune", "IT", "Team D"));
        emp.add(new Employee (13, "Eran", "Pune", "IT", "Team A"));
        emp.add(new Employee (14, "Ravi", "Mumbai", "Finance", "Team B"));
        emp.add(new Employee (15, "Kylie", "Chennai", "IT", "Team C"));
        emp.add(new Employee (16, "Sara", "Delhi", "Finance", "Team D"));

        ArrayList<String> rules = new ArrayList<>();
        
        rules.add("IT");
        User user1 = new User(1, "John", rules);
        users.add(user1);
        rules.clear();

        rules.add("Team C");
        rules.add("Delhi");
        User user2 = new User(2, "Tom", rules);
        users.add(user2);
        rules.clear();

        rules.add("Finance");
        rules.add("Pune");
        User user3 = new User(3, "Adam", rules);
        users.add(user3);
        rules.clear();

        rules.add("HR");
        rules.add("Mumbai");
        User user4 = new User(4, "Lina", rules);
        users.add(user4);
    }

    public int getEmployeeCount() {
        return emp.size();
    }

    public int getUserCount() {
        return users.size();
    }

    public void addNewEmployee(Employee e) {
        emp.add(e);
    }

    public void addNewUser(User user) {
        users.add(user);
    }

    private boolean checkRule(String rule, Employee e) {
        switch(rule) {
            case "Delhi", "Pune", "Mumbai", "Hyderabad", "Chennai": if(e.getOffice() == rule) return true;
            break;
            case "IT", "Finance", "HR" : if(e.getDepartment() == rule) return true;
            break;
            case "Team A", "Team B", "Team C", "Team D" : if(e.getTeam() == rule) return true;
            break;
            default: System.out.println("Rule Must be Within Office, Department or Team.");
        }
        return false;
    }

    public List<Employee> getEmployeesByUserId(int userId){
        List<Employee> subList = new ArrayList<>();
        int n = users.get(userId-1).getRules().size();
        String rule;
        int t;

        for(int i=0; i<n; i++) {
            rule = users.get(userId-1).getRules().get(i);
            for(Employee e: emp) {
                if(checkRule(rule, e)){
                    t = -1;
                    for(Employee e1: subList) {
                        if(e == e1) {
                            t = 1;
                            break;
                        }
                    }
                    if(t == -1) subList.add(e);
                }
            }
        }
        return subList;
    }

    public Employee getEmployeeById(int id) {
        return emp.get(id-1);
    }
}
