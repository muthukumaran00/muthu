import java.util.Scanner;

public class calculater{
    static void result(double res,double x,double y,String s){
        System.out.println("***ANSWER***");
        System.out.print(x);
        System.out.print(" "+s);
        System.out.print(" "+y);
        System.out.println(" = "+res);
    }
    static void add(double x,double y){
        double res = 0;
        String s = "+";
        res = x+y;
        result(res,x,y,s);
    }
    static void sub(double x,double y){
        double res = 0;
        String s = "-";
        res = x-y;
        result(res,x,y,s);
    }
    static void mul(double x,double y){
        double res = 0;
        String s = "x";
        res = x*y;
        result(res,x,y,s);
    }
    static void dev(double x,double y){
        double res = 0;
        String s = "/";
        if(y!=0){
            res = x/y;
            result(res,x,y,s);
        }
        else{
            System.out.println("THE SECOND VALUE IS 0!");
            System.out.println("***ANSWER***");
            System.out.print(x);
            System.out.print(" / "+y);
            System.out.println(" = INFINITY");
        }
        }
    public static void main(String[] args){
        Scanner muthu = new Scanner(System.in);

        System.out.println("Enter your select:");
        System.out.println("1.Addition");
        System.out.println("2.Subtract");
        System.out.println("3.Multiple");
        System.out.println("4.Devition");
        System.out.println("5.Exit");
        int a = muthu.nextInt();

        String h = "";

        switch(a){
            case 1:
                h = "***ADDITION***";
                break;
            case 2:
                h = "***SUBTRATION***";
                break;
            case 3:
                h = "***MULTIPLE***";
                break;
            case 4:
                h = "***DIVITION***";
                break;
            case 5:
                System.out.println("Ending...");
                System.exit(0);
                break;

        }    

        System.out.println(h);
        System.out.println("Enter your first number");
        double x = muthu.nextDouble();
        System.out.println("Enter your second number");
        double y = muthu.nextDouble();

        switch(a){
            case 1:
                add(x,y);
                break;
            case 2:
                sub(x,y);
                break;
            case 3:
                mul(x,y);
                break;
            case 4:
                dev(x,y);
                break;
        default:
            System.out.println("Enter the correct value:");
            break;
        }    
    }
}