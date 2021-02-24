public class main {
    public static void main(String[] args) {

        GiaiHePhuonTrinh pt1 = new GiaiHePhuonTrinh();
        pt1.Input();
        if (!ThuatToan.checkPTVN(pt1))   {
            System.out.println("__TB: PT VÔ NGHIÊM__");
        } else {
            System.out.println("-----NGHIEM THEO PP THẾ-------");
            pt1.PpThe();
            Double D[] = ThuatToan.DinhThuc(pt1);
            System.out.println("----NGHIEM THEO ĐỊNH THỨC-----");
            System.out.println("Phuong trinh co nghiem la:");
            System.out.println("y= " + D[2] / D[0]);
            System.out.println("x= " + D[1] / D[0]);

        }
    }

}
