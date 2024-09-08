import java.util.Scanner;
public class password{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        String password="secret123";
        String pass;
        while(true){
            System.out.print("Enter password");
            pass=n.nextLine();
            if(password.equals(pass)){
                System.out.println("Password accepted.");
                break;
            }
            else{
                System.out.println("Incorrect password.Try again.");
            }
        }
    }
}