import java.util.Scanner;
public class ternarypass{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the student mark:");
        int mark=s.nextInt();
        String a=(mark>=50)?"Pass":"Fail";
        System.out.println(a);
    }
}