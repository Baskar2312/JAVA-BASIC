import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int num=n.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ num +" is: "+fact);
    }
}