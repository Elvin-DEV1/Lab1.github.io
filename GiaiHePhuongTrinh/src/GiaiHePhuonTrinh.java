import java.util.Scanner;

public class GiaiHePhuonTrinh {
    double a1, b1, c1;
    double a2, b2, c2;

    public void Input() {
        Scanner s = new Scanner(System.in);
        System.out.println("------------SSG-----------");
        System.out.println("Vao he so: a1, b1, c1 = ");
        a1 = s.nextDouble();       b1 = s.nextDouble();  c1 = s.nextDouble();
        System.out.println("--Het PT1. Moi ban Nhap PT2--");
        System.out.println("a2, b2, c2 = ");
        a2 = s.nextDouble();   b2 = s.nextDouble();        c2 = s.nextDouble();
        System.out.println("-------Hoan thanh Nhap-------");
        System.out.println("");
    }

    public void PpThe(){
        double b11=b1*a2;
        double c11=c1*a2;
        double b22=b2*a1;
        double c22=c2*a1;

        double y = (c22-c11)/(b11-b22);
        System.out.println("y = "+y);
        double x = (-c11-b11*y)/(a1*a2);
        System.out.println("x = "+x);
    }
}
