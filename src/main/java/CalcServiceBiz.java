public class CalcServiceBiz implements ICalcService {

    @Override
    public NumberDTO add(NumberDTO number) {
        double result = number.getNum1() + number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO sub(NumberDTO number) {
        double result = number.getNum1() - number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO mul(NumberDTO number) {
        double result = number.getNum1() * number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO div(NumberDTO number) {
        try {
            if (number.getNum2() == 0) {
                throw new ArithmeticException("나누는 수가 0 이므로 오류가 발생하였습니다. 다시 입력 해주세요.");
            }
            double result = number.getNum1() % number.getNum2();
            number.setResult(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return number;
    }

    @Override
    public NumberDTO rem(NumberDTO number) {
        try {
            if (number.getNum2() == 0) {
                throw new ArithmeticException("나누는 수가 0 이므로 오류가 발생하였습니다. 다시 입력 해주세요.");
            }
            double result = number.getNum1() % number.getNum2();
            number.setResult(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return number;
    }

    @Override
    public NumberDTO squ(NumberDTO number) {
        double result = Math.pow(number.getNum1(), number.getNum2());
        number.setResult(result);
        return number;
    }


}
