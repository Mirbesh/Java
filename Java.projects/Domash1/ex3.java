package Domash1;

class Calculator {
    public double calculate(char op, int a, int b) {
      // Введите свое решение ниже
        double result = 0;
        if (a == 0 || b == 0 && op == '/') {
            
            return result;
        }
        if (op == '+') {
            result = a + b;
        }
        if (op == '-') {
            result= a - b;
        }
        if (op == '*') {
            result = a * b;
        }
        if (op == '/') {
            result = a / b;
        }
        return result;
    }
}

public class ex3 {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 12;
            op = '/';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
       // Ниже добавить проверку оператора на корректность
       if (op != '+' || op != '-' ||op != '*' || op != '/'){
        System.out.print("Вы ввели не правльный оператор");

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
