import java.util.Scanner;

public class CalcView {
    Scanner scan = new Scanner(System.in);

    public String inputNumber(NumberDTO number) {
        System.out.print("두 수와 연산자를 입력하세요.(ex:6 7 +) : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String op = scan.next();

        number.setNum1(num1);
        number.setNum2(num2);
        return op;
    }

    public void printResult(NumberDTO number, String op) {
        System.out.printf("두 수 %d와 %d의 ", number.getNum1(), number.getNum2());
        switch (op) {
            case "+":
                System.out.printf("add의 결과는 %.2f 입니다.\n", number.getResult());
                break;
            case "-":
                System.out.printf("sub의 결과는 %.2f 입니다.\n", number.getResult());
                break;
            case "*":
                System.out.printf("mul의 결과는 %.2f 입니다.\n", number.getResult());
                break;
            case "/":
                System.out.printf("div의 결과는 %.2f 입니다.\n", number.getResult());
                break;
            case "%":
                System.out.printf("rem의 결과는 %.2f 입니다.\n", number.getResult());
                break;
            case "^":
                System.out.printf("squ의 결과는 %.2f 입니다.\n", number.getResult());
                break;
        }
    }
}
