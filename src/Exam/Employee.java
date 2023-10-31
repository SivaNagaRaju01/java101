package Exam;

public class Employee {
    private int id;
    private String name;
    private String office;
    private String department;
    private String team;

    public Employee() {

    }

    public Employee(int id, String name, String office, String dep, String team) {
        this.id = id;
        this.name = name;
        this.office = office;
        department = dep;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public void setDempartment(String department) {
        this.department = department;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return String.format("%d\t\t%s\t\t%s\t\t%s\t\t%s", id, name, office, department, team);
    }
}
