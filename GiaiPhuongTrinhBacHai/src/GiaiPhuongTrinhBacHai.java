import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        System.out.println("Nhap c:");
        c = sc.nextInt();
        if(a==0){
            if (b==0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                float x = (float) -c/b;
                System.out.println("Phuong trinh co nghiem:" +x);
            }
    }else{
            int delta = (b*b) - (4*a*c);
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
        }else if (delta==0){
            float x = (float) -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep:"+x);
            }else if (delta>0){
                float candelta = (float) Math.sqrt(delta);
                float x1 = (float) (-b + candelta)/(2*a);
                float x2 = (float) (b + candelta)/(2*a);
                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
        }
    }
}
