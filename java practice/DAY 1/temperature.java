import java.util.Scanner;
public class temperature{
    public static void main(String args[]){
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the fahrenheit value:");
        double F=data.nextDouble();
        double c=1.8*(F-32);
        System.out.println("The celcius value is:"+c);
    }
}