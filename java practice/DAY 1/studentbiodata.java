import java.util.Scanner;
public class studentbiodata{
    public static void main(String args[]){
        Scanner data=new Scanner(System.in);
        System.out.print("Entername");
        String st=data.nextLine();
        System.out.print("Age");
        int at=data.nextInt();
        System.out.print("Department");
        String dt=data.next();
        System.out.print("Register no");
        int rt=data.nextInt();
        System.out.println("STUDENT NAME:"+st);
        System.out.println("STUDENT AGE:"+at);
        System.out.println("STUDENT DEPARTMENT:"+dt);
        System.out.println("STUDENT REGISTER NO:"+rt);

    }
}
