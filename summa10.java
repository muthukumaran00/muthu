import java.util.Scanner;

public class summa10{
    public static void main(String[] args){
        Scanner muthu = new Scanner(System.in);

        System.out.println("Enter the value for array");
        int a = muthu.nextInt();
        int i;
        int[] ant = new int[a];

        for(i=0;i<a;i++){
            int n=i+1;
            System.out.print("Enter the value for array "+n);
            System.out.println(":");
            ant[i] = muthu.nextInt();
        }
        int m=a/2;
        System.out.print("The value of middle array of your input is:");
        System.out.println(ant[m]);
    }
}



