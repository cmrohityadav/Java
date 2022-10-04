
import java.util.*;

public class Conditional_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //if else
        
        //age checker
        // System.out.println("enter your age");
        // int a=sc.nextInt();
        // if (a>=18) {
        //     System.out.println("you are adult");
        // }
        // else{
        //     System.out.println("you are teen");
        // }


        



        //even and odd
        // System.out.println("enter number");
        // int a=sc.nextInt();
        // if (a%2==0) {
        //     System.out.println("even number");
            
        // } else {
        //     System.out.println("odd number");
            
        // }




        //check number 
        // System.out.println("enter A number");
        // int a=sc.nextInt();
        // System.out.println("enter B number");
        // int b=sc.nextInt();
        // if (a==b) {
        //     System.out.println("both are equal");
            
        // } else if(a>b) {
        //     System.out.println("a is greater than b");
        // }
        // else{
        //     System.out.println("b is greater than a");
        // }




        //greeting massage
        // System.out.println("enter 1 for hello,2 for namste,3 for bonjour");
        // int num=sc.nextInt();
        // if (num==1) {
        //     System.out.println("hello ");
        // } else if(num==2) {
        //     System.out.println("namste");
        // }
        // else if(num==3){
        //     System.out.println("bonjour");
        // }
        // else{
        //     System.out.println("invalid key");
        // }






         //greeting massage using switch
         System.out.println("enter 1 for hello,2 for namste,3 for bonjour");
         int button=sc.nextInt();
         switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
            System.out.println("namste");
            break;
            case 3:
            System.out.println("bonjour");
            break;
         
            default:
            System.out.println("invalide button");
                break;
         }

        sc.close();
    }
}
