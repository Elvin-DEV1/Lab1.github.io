import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            float x = (float) -b / a;
            System.out.println("Phuong trinh co nghiem duy nhat: " +x);

        }

    }
}
