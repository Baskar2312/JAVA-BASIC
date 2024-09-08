import java.util.Scanner;
public class studentmark{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the student mark");
        int mark=n.nextInt();
        if(mark>=90){
            System.out.println("Grade A");
        }
        else if(mark>=75 && mark<90){
            System.out.println("Grade B");
        }
        else if(mark>=55 && mark<75){
            System.out.println("Grade c");
        }
        else{
            System.out.println("Fail");
        }
    }
}