import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        System.out.println("welcome to calculator");
        System.out.println("enter the 1st number");
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextFloat();
        System.out.println("enter the operator 1)+  2)-  3)/ 4)* 5)%");
        int op=sc.nextInt();
        System.out.println("enter the 2nd number");
        float num2=sc.nextFloat();
        switch (op) {
            case 1:
                System.out.println(num1+num2);
                break;
            
                case 2:
                System.out.println(num1-num2);
                break;
                case 3:
                System.out.println(num1/num2);
                break;
                case 4:
                System.out.println(num1*num2);
                break;
                case 5:
                System.out.println(num1%num2);
                break;
            default:
            System.out.println("invalid operator");
                break;
        }

        

        sc.close();
    }
}
