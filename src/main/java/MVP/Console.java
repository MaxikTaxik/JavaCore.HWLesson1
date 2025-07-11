package MVP;

import java.util.Scanner;

class Console {
    private Scanner scanner = new Scanner(System.in);
    private String input;
    private String firstMessage = "Меню для ввода параметров калькулятора;\n    Введите первое и второе число";
    private String secondMessage = "Ввеите цифру: ";
    private String thhirdMessage = "Вы ввели: ";
    private String fourthrdMessage = "Введите знак действия:\n 1 - сложение\n" +
        " 2 - вычитание\n 3 - умножение\n 4 - деление";



	/**
     * 1 - выводится сообщение в консоль для запроса параметров.
     * 2 - Вывод в консоль что было введено.
     */

    void outMenuText(String arg){
        switch (arg){
            case "меню":
                System.out.println(firstMessage);
                break;
            case "просьба":
                System.out.println(secondMessage);
                break;
            case "ввёл":
                System.out.println(thhirdMessage + input);
                break;
            case "действие":
                System.out.println(fourthrdMessage);
                break;
        }
    }

    void setInput() {
        this.input = scanner.nextLine();
    }

    String getInput() {
        return input;
    }


}
