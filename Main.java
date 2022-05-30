import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Объявление переменных
        boolean symbol = false;
        String sym = "";
        Scanner input = new Scanner(System.in);
        //Вывод сообщения о вводе символов
        while (!symbol) {
            System.out.print("Enter your symbol: ");
            sym = input.nextLine();
            //Условаие проверки корректности введенных символов
            if (sym() !="{[({[()]})]}")
            {
                System.out.println("Bad input");
            }
            else
                symbol = true;
        }
        //Вывод вводимых символов
        System.out.println("Symbol is:" + sym);
    }
}
