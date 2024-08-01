import java.util.Scanner;

public class calculater2{
    public static void main(String[] args){
        Scanner muthu = new Scanner(System.in);

        System.out.println("---ENTER THE DETAILS TO CALCULATE---");

        System.out.println("Enter the First number:");
        double a = muthu.nextDouble();

        System.out.println("Enter the operater(+,-,*,/):");
        char operater = muthu.next().charAt(0);

        System.out.println("Enter the Second number:");
        double b = muthu.nextDouble();

        int i;

        double r=0;

        for(i=0;i<=100;i++){
        switch(operater){
            case'+':
                r=a+b;
                break;
            case'-':
                r=a-b;
                break;
            case'*':
                r=a*b;
                break;
            case'/':
                if(b!=0){
                    r=a/b;
                }
                else{
                    System.out.println("ERROR! Divition by zero");
                }
            break;
        default:
            System.out.println("invalid operater!");
            return;
        }
        }
        System.out.print("the result is ");
        System.out.println(r);
    }
}