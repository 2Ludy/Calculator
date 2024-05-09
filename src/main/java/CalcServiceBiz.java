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
        double result = (double) number.getNum1() / number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO rem(NumberDTO number) {
        double result = number.getNum1() % number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO squ(NumberDTO number) {
        double result = Math.pow(number.getNum1(), number.getNum2());
        number.setResult(result);
        return number;
    }


}
