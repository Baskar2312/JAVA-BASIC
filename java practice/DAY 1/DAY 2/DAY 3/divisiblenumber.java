import java.util.Scanner;
public class divisiblenumber{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n=num.nextInt();
        System.out.print("Enter the divisor: ");
        int d=num.nextInt();
        int firstdivisibleno=0;
        for(int i=1;i<=n;i++){
            if(i%d==0){
                firstdivisibleno=i;
                break;
            }
        }
        if(firstdivisibleno!=0){
            System.out.println("The divisible number is: "+ firstdivisibleno);
        }
        else{
            System.out.println("Number is not in the range"+n);
        }
    }
}