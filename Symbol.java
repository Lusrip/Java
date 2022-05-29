import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean symboll_1 = false;
        String sym_1 = "";
        Scanner input = new Scanner(System.in);

        while (!symboll_1) {
            System.out.print("Enter your symbol: ");
            sym_1 = input.nextLine();

            if (sym_1.length() !="{[({[()]})]}")
            {
                System.out.println("Bad input");
            }
            else
                symboll_1 = true;
        }

        System.out.println("Symbol is:" + sym_1);
    }
}
