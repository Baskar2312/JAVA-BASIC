import java.util.Scanner;
public class listnames{
    public static void main(String args[]){
        String[] names={"Alice","Bob","Charlotte","David","Eve"};
        for(int i=0;i<5;i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        String longest=names[0];
        for(int i=1;i<names.length;i++){
            if(names[i].length()>longest.length()){
                longest=names[i];
            }
        }
        String shortest=names[0];
        for(int i=1;i<names.length;i++){
            if(names[i].length()<shortest.length()){
                shortest=names[i];
            }
        }
        System.out.println("Longest name:"+longest);
        System.out.println("Shortest name:"+shortest);
        System.out.print("The reversed names are: ");
        for(int i=names.length-1;i>=0;i--){
            System.out.print(names[i]+" ");
        }
    }
}