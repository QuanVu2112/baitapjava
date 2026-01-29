import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nam: ");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Nam nhuan");
        }else {
            System.out.println("Ko phai nam nhuan");
        }
    }
}
