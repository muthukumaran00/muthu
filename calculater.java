import java.util.Scanner;

public class calculater{
    public static void main(String[] args){
        Scanner muthu = new Scanner(System.in);

        int i;
        for(i=1;i<1000;i++)
        {
        System.out.println("Enter your choice:");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mult");
        System.out.println("4.dev");
        System.out.println("5.Exit");
        int a = muthu.nextInt();
            if(a==1){
                System.out.println("Enter the value for a:");
                double b = muthu.nextDouble();
                System.out.println("Enter the value for b:");
                double c = muthu.nextDouble();
                System.out.println("The answer is:");
                System.out.println(b+c);
            }
            if(a==2){
                System.out.println("Enter the value for a:");
                double b = muthu.nextDouble();
                System.out.println("Enter the value for b:");
                double c = muthu.nextDouble();
                System.out.println("The answer is:");
                System.out.println(b-c);
            }
            if(a==3){
                System.out.println("Enter the value for a:");
                double b = muthu.nextDouble();
                System.out.println("Enter the value for b:");
                double c = muthu.nextDouble();
                System.out.println("The answer is:");
                System.out.println(b*c);
            }
            if(a==4){
                System.out.println("Enter the value for a:");
                double b = muthu.nextDouble();
                System.out.println("Enter the value for b:");
                double c = muthu.nextDouble();
                System.out.println("The answer is:");
                System.out.println(b/c);
            }
            if(a==5){
                i=1000;
            }
        }
    }
} 