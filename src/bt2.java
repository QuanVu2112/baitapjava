import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang (1-12): ");
        int month = sc.nextInt();
        if (month == 1) {
            System.out.println("Co 31 ngay");
        } else if (month == 2) {
            System.out.println("Nhap nam: ");
            double year = sc.nextDouble();
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Nam nhuan, 29 ngay");
            } else {
                System.out.println("Ko phai nam nhuan, 28 ngay");
            }
        } else if (month == 3) {
            System.out.println("Co 31 ngay");
        } else if (month == 4) {
            System.out.println("Co 30 ngay");
        } else if (month == 5) {
            System.out.println("Co 31 ngay");
        } else if (month == 6) {
            System.out.println("Co 30 ngay");
        } else if (month == 7) {
            System.out.println("Co 31 ngay");
        } else if (month == 8) {
            System.out.println("Co 31 ngay");
        } else if (month == 9) {
            System.out.println("Co 30 ngay");
        } else if (month == 10) {
            System.out.println("Co 31 ngay");
        } else if (month == 11) {
            System.out.println("Co 30 ngay");
        } else if (month == 12) {
            System.out.println("Co 31 ngay");
        }
    }
}

