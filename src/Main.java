
import java.util.Scanner;

public class Main {
    static void design () {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = input.nextInt();

        int firstNum = n;
        System.out.print("Çıktı: " + n + " ");

        for (int i = n; i>0; i -= 5) {
            firstNum-=5;
            System.out.print(firstNum+" ");
        }

        int lastNum = firstNum;
        for (int i = lastNum; i < n; i += 5) {
            lastNum += 5;
            System.out.print(lastNum + " ");

        }

    }
    public static void main(String[] args) {

        design();
    }
}