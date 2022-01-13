import java.util.Scanner;

public class exception3 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            System.out.print("Masukkan x: ");
            x = input.nextInt();
            System.out.print("Masukkan y: ");
            y = input.nextInt();
            
            input.close();

            System.out.println("Hasil: " + x / y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

