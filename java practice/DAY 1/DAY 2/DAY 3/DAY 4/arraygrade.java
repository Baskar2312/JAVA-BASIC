public class arraygrade{
    public static void main(String args[]){
        int[][] grade={{85,92},{78,85},{90,88},{95,94},{80,87}};
        for(int i=0;i<=5;i++){
            for(int j=0;j<=2;j++){
                System.out.print("Math"+grade[i][j]+"Science"+grade[i][j]);
            }
            System.out.println();
        }
    }
}