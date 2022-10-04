import java.util.Scanner;

public class Cal_radius_Area {
    public static void main(String[] args) {
        System.out.println("Enter the Radius of the circle");
        Scanner sc= new Scanner(System.in);
        float Radius=sc.nextFloat();
        
        float area=(float) ((3.14)*Radius*Radius);
        System.out.println(area);

        sc.close();
    }
}
