import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("Nhap chieu dai hinh chu nhat: ");
            double Length = Double.parseDouble(sc.nextLine());
            System.out.printf("Nhap chieu rong hinh chu nhat: ");
            double Width = Double.parseDouble(sc.nextLine());
            System.out.printf("Nhap canh hinh vuong: ");
            double Side = Double.parseDouble(sc.nextLine());
            double Ssquare = Math.pow(Side, 2);
            double Psquare = Side * 4;
            double Srectangle = Length * Width;
            double Prectangle = (Length + Width)*2;

            if (Length <= 0 || Width <= 0 || Side <= 0) {
                System.out.println("Vui long nhap nhap cac canh lon hon 0");
            }
            else {
                Square square = new Square(Side, Psquare, Ssquare);
                Rectangle rectangle = new Rectangle(Width, Length, Prectangle, Srectangle);
                System.out.println(square);
                System.out.println(rectangle);
                System.exit(0);
            }
        }
    }
}
