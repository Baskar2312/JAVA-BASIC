import java.util.Scanner;
public class weekday{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number to find the week");
        int num=n.nextInt();
        switch(num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input.Please enter a valid number between 1 and 7");

        }

    }
}