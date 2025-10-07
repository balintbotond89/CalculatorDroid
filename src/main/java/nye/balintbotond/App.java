package nye.balintbotond;

//Surpress false warning of PMD for println
@SuppressWarnings({"PMD.SystemPrintln"})
public class App {
    public static void main(String[] args) {
        int firstNumber = 119;
        int secondNumber = 301;
        //Addition (Összeadás):
        System.out.println(firstNumber + secondNumber);
        //Substraction (Kivonás):
        System.out.println(firstNumber - secondNumber);
        //Multiplication (Szorzás):
        System.out.println(firstNumber * secondNumber);
        //Distribution (Egész számos osztás):
        System.out.println(secondNumber / firstNumber);
        //Residual distribution (Maradékos osztás):
        System.out.println(secondNumber % firstNumber);
    }
}