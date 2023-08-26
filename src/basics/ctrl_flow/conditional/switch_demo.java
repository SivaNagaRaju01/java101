package basics.ctrl_flow.conditional;

public class switch_demo {
    public static void main(String args[]) {
        short x = 9;
        switch(x){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("MOnday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thursday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
            default : System.out.println("There are Only 7 days in a week and they start from DAY-1!.. Moran.");
        }
    }
}
