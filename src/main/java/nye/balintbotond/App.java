package nye.balintbotond;

import java.util.Scanner; //required to read user inputs

//Suppress false warning of PMD for println
@SuppressWarnings({"PMD.SystemPrintln"})
public class App {
    public static void main(String[] args) {
        //Create the object for the scanner input
        Scanner input = new Scanner(System.in);

        //We create a datatype just like we would create an int:
        CalculatorDroid droid = new CalculatorDroid();

        //From now on we can use this datatype:
        droid.setFirstNumber(input.nextInt());
        droid.setSecondNumber(input.nextInt());

        //Closing the scanner input session:
        input.close();

        System.out.println(droid.getFirstNumber());
        System.out.println(droid.getSecondNumber());

        //We adress the methods
        droid.addNumbers();
        droid.subtractNumbers();
        droid.divideNumbers();
        droid.multiplyNumbers();
        droid.modNumbers();
    }
}