import java.util.Scanner;
public class multitable{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("enter the number for table: ");
        int num=n.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}