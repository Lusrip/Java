import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean symbol = false;
        String sym = "";
        Scanner input = new Scanner(System.in);

        while (!symbol) {
            System.out.print("Enter your symbol: ");
            sym = input.nextLine();

            if (sym.length() !="{[({[()]})]}")
            {
                System.out.println("Bad input");
            }
            else
                symbol = true;
        }

        System.out.println("Symbol is:" + sym);
    }
}
