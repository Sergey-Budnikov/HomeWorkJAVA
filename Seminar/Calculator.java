package Seminar;

public class Calculator {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 10;
            op = '/';
            b = 10;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator1 calculator = new Calculator1();
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
class Calculator1 {
    public int calculate(char op, int a, int b) {
      // Введите свое решение ниже
     /* Scanner scanner = new Scanner(System.in);
      System.out.println("Введите первое число: ");
      int a = scanner.nextInt();
      System.out.println("Введите второе число: ");
      int b = scanner.nextInt();
      System.out.println("Введите первое число: ");
      char op = scanner.next().charAt(0);*/
      if (b == 0 & op == '/') {
        System.out.println("На ноль делить нельзя!");
      }
      switch (op){
        case '+':
          int res = a + b;
          return res;
        case '-':
          int res1 = a - b;
          return res1;
        case '*':
          int res2 = a * b;
          return res2;
        case '/':
          int res3 = a / b;
          return res3; 
        default:
           System.out.println("Введен некорректный знак действия!");
      }
    return b;
    }
}
