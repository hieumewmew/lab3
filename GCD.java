import java.util.Scanner;
import java.lang.Math;
    public class GCD {
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);
            int Number1, Number2;
            while(Number1==0||Number2==0) {
                System.out.print("hay nhap vao so thu nhat : ");
                Number1 = Input.nextInt();
                System.out.print("hay nhap vao so thu hai : ");
                Number2 = Input.nextInt();
            }
      findGCD(Number1,Number2);

        }

        public static int findGCD(int a, int b) {

            if ((a > 0) && (b > 0)) {
                while (a != b) {
                    if (a > b)
                        a = a - b;
                    else
                        b = b - a;
                }
            } else {
                a = Math.abs(a);
                b = Math.abs(b);
                while (a != b) {
                    if (a > b)
                        a = a - b;
                    else
                        b = b - a;
                }
            }
            return a;
        }
    }

