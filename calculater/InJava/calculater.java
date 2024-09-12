import java.util.Scanner;

public class calculater{
    public static void main(String[] args){
        Scanner muthu = new Scanner(System.in);

        while(1<2){
            System.out.println("Enter your select:");
            System.out.println("1.Addition");
            System.out.println("2.Subtract");
            System.out.println("3.Multiple");
            System.out.println("4.Devition");
            System.out.println("5.Exit");
            int a = muthu.nextInt();

            String h = "";
            String s = "";

            switch(a){
                case 1:
                    h = "***ADDITION***";
                    s = "+";
                    break;
                case 2:
                    h = "***SUBTRATION***";
                    s = "-";
                    break;
                case 3:
                    h = "***MULTIPLE***";
                    s = "*";
                    break;
                case 4:
                    h = "***DIVITION***";
                    s = "/";
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

            calculater ans = new calculater();

            double resf = 0;

            switch(a){
                case 1:
                    resf = ans.add(x,y);
                    break;
                case 2:
                    resf = ans.sub(x,y);
                    break;
                case 3:
                    resf = ans.mul(x,y);
                    break;
                case 4:
                    resf = ans.dev(x,y);
                    break;
            default:
                System.out.println("Enter the correct value:");
                break;
            }    

            System.out.println("***ANSWER***");
            System.out.print(x);
            System.out.print(" "+s);
            System.out.print(" "+y);
            System.out.println(" = "+resf);
        }
    }

    double add(double x,double y){
        double res = 0;
        res = x+y;
        return res;
    }
    double sub(double x,double y){
        double res = 0;
        res = x-y;
        return res;
    }
    double mul(double x,double y){
        double res = 0;
        res = x*y;
        return res;
    }
    double dev(double x,double y){
        double res = 0;
        if(y!=0){
            res = x/y;
            return res;
        }
        else{
            System.out.println("THE SECOND VALUE IS 0!");
            System.out.println("***ANSWER***");
            System.out.print(x);
            System.out.print(" / "+y);
            System.out.println(" = INFINITY");
            System.exit(0);
            return res;
        }
    }
}