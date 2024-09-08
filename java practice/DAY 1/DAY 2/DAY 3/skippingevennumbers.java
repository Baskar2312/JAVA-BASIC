import java.util.Scanner;
public class skippingevennumbers{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int even=n.nextInt();
        System.out.println("odd numbers from 1 to "+ even+": ");
        for(int i=1;i<=even;i++){
            if(i%2==0){
                continue;
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}