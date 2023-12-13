import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) ? "Leap year" : "Not a leap year";
        System.out.println(result);
        System.out.println("The program is finished");
    }

}
