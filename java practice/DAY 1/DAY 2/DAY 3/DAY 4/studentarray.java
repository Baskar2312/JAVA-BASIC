import java.util.Scanner;
public class studentarray{
    public static void main(String args[]){
        int[] student=new int[5];
        Scanner n=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter the array elements");
            student[i]=n.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=student[i]; 
        }
        int max=student[0];
        for(int i=1;i<student.length;i++){
            if(student[i]>max){
                max=student[i];
            }
        }
        int min=student[0];
        for(int i=1;i<5;i++){
            if(student[i]<min){
                min=student[i];
            }
        }
        System.out.println("The sum of the number is: "+ sum);
        float avg=sum/5;
        System.out.println("The average score is: "+ avg);
        System.out.println("The maximum number is: "+ max);
        System.out.println("The minimum number is: "+ min);


    }
}