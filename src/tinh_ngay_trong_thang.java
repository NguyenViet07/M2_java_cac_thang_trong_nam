import java.util.Scanner;

public class tinh_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("chon mot thang trong nam : ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("thang: " + month + " la thang co 31 ngay");
                break;
            case 2:
                System.out.print("thang 2 co 28 hoac 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("thang: " +month + " la thang co 30 ngay");
                break;
        }
    }
}
