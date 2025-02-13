import java.util.Scanner;

public class Chefandchocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int a=x*5;
            int b=y*10;
            int c=a+b;
            int d=c/z;
            System.out.println(d);
        }
    }
}
