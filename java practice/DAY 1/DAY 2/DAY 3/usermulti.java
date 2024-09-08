 import java.util.Scanner;
 import java.util.Random;
 public class usermulti{
    public static void main(String args[]){
        System.out.println("Welcome to multiplication practice program.");
        Scanner n=new Scanner(System.in);
        Random random=new Random();
        while(true){
            int n1=random.nextInt(10);
            int n2=random.nextInt(10);
            int user;
            System.out.println("What is"+n1+"*"+n2+"?");
            int correctanswer=n1*n2;
            System.out.print("Enter your answer(or 0 to exit)");
            user=n.nextInt();
            if(user==correctanswer){
                System.out.println("Correct!");
                break;
            }
            else if(user==0){
                System.out.println("Thank you for practicing multiplication table.");
                break;
            }
            else{
                System.out.println("Incorrect.The correct answer is "+ correctanswer);
            }
        }
    }
}
