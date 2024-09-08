import java.util.Scanner;
public class oddoreven{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=n.nextInt();
        if(num%2!=0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}