import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thang trong 1 nam(1-12): ");
        int quy = sc.nextInt();
        if (quy == 1 || quy == 2 || quy == 3){
            System.out.println("Quy 1");
        } else if (quy == 4 || quy == 5 || quy == 6) {
            System.out.println("Quy 2");
        } else if (quy == 7 || quy == 8 || quy == 9) {
            System.out.println("Quy 3");
        } else if (quy == 10 || quy == 11 || quy == 12) {
            System.out.println("Quy 4");
        } else {
            System.out.println("Nhap sai, nhap lai");
        }
    }
}
