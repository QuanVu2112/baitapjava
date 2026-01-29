import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tim theo ten");
        System.out.println("2.Tim theo tac gia");
        System.out.println("3.Tim theo nha xuat ban");
        System.out.println("4.Tim theo tieu de");
        System.out.print("Moi bam so de chon: ");
        int x = sc.nextInt();
        System.out.println(sc.nextLine());
        switch (x){
            case 1 :
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha san xuat");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam ko hop le");
                break;
        }

    }
}
