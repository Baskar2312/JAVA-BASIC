 import java.util.Scanner;
 import java.util.Random;
 public class guessing{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        Random random=new Random();
        int toguess=random.nextInt(100);
        int userguess=0;
        System.out.println("Welcome to the guessing game:");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can u guess what it is?");
        while(toguess!=userguess){
            System.out.print("Enter your guess:");
            userguess=n.nextInt();
            if(userguess>toguess){
                System.out.println("To high");
            }
            else if(userguess<toguess){
                System.out.println("To low");
            }
            else{
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

    }

 }