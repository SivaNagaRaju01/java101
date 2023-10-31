package Exam;

public class UserPermissionsDemo {
    public static void main(String args[]) {
        Runner runner = new Runner();
        //System.out.println(runner.emp);
        System.out.println(runner.getEmployeeCount());
        System.out.println(runner.getUserCount());
        System.out.println(runner.users.get(3).getName());
        System.out.println(runner.users.get(3).getId());
        System.out.println(runner.users.get(3).getRules());
        System.out.println(runner.getEmployeesByUserId(4));
    }
}
