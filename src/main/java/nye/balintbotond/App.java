package nye.balintbotond;

//Suppress false warning of PMD for println
@SuppressWarnings({"PMD.SystemPrintln"})
public class App {
    public static void main(String[] args) {
        //We create a datatype just like we would create an int
        CalculatorDroid droid = new CalculatorDroid();
        //From now on we can use this datatype
        droid.setFirstNumber(34);
        droid.setSecondNumber(56);
        System.out.println(droid.getFirstNumber());
        System.out.println(droid.getSecondNumber());
    }
}