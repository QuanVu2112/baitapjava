import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao(cm): " );
        double cao = sc.nextDouble();
        System.out.print("Nhap can nang(kg): ");
        double kg = sc.nextDouble();
        double BMI = kg / (cao * cao);
        if (BMI < 15) {
            System.out.println("Than hinh qua gay");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Than hinh gay");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Than hinh hoi gay");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Than hinh binh thuong");
        } else if (BMI >= 25 && BMI < 30){
            System.out.println("Than hinh hoi beo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Than hinh beo");
        } else {
            System.out.println("Than hinh qua beo");
        }
    }
}