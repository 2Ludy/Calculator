public class Java2CalcMain {
    public static void main(String[] args) {
        ICalcService service = new CalcServiceBiz();
        CalcController controller = new CalcController(service);
        controller.applicationStart();
    }
}
