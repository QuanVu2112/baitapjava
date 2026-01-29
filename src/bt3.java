import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a= ");
        double a = sc.nextDouble();
        System.out.println("Nhap b= ");
        double b = sc.nextDouble();
        System.out.println("Nhap c= ");
        double c = sc.nextDouble();
        double delta = (b * b) - 4 * a * c;
        if (delta < 0){
            System.out.println("PT vo nghiem");
        } else if (delta == 0) {
            System.out.println("PT co nghiem kep: x1 = x2 = " + ( (-b) / (2 * a)) );
        } else  {
            System.out.println("PT co 2 nghiem pb");
            System.out.println("x1= " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2= " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
