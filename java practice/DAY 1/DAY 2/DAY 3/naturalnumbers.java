import java.util.Scanner;
public class naturalnumbers{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the positive integer:");
        int num=n.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("sum of first"+num+"natural number is: "+sum);
    }
}