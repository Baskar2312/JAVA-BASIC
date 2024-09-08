import java.util.Scanner;
public class eligiblevote{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the age of the person:");
        int vote=n.nextInt();
        if(vote>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Ypu are not eligible to vote");
        }
    }
}