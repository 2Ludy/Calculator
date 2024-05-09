public class CalcController {
    ICalcService service;

    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart(){
        CalcView view = new CalcView();
        NumberDTO number = new NumberDTO(0,0,0);
        while(true){
            String op = view.inputNumber(number);
            if (op.equals("E")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch(op){
                case "+" :
                    number = service.add(number);
                    break;
                case "-" :
                    number = service.sub(number);
                    break;
                case "*" :
                    number = service.mul(number);
                    break;
                case "/" :
                    number = service.div(number);
                    break;
                case "%" :
                    number = service.rem(number);
                    break;
                case "^" :
                    number = service.squ(number);
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하여 주세요(+, -, *, /, %, ^)");
                    continue;
            }
            view.printResult(number, op);
        }
    }
}
