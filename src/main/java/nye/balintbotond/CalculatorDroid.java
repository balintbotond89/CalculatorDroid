package nye.balintbotond;

public class CalculatorDroid {

    //Information we should keep hidden outside this the current class. Goal: Encapsulation.
    private int firstNumber;
    private int secondNumber;

    //New object constructor
    public CalculatorDroid() {
    }

    //Create addition method (every method that has no return value is void)
    public void addNumbers() {
        System.out.println("Két szám összege: " + (firstNumber + secondNumber));
    }

    //Create subtract method (every method that has no return value is void)
    public void subtractNumbers() {
        System.out.println("Két szám különbsége: " + (firstNumber - secondNumber));
    }

    //Create division method (every method that has no return value is void)
    public void divideNumbers() {
        System.out.println("Két szám különbsége: " + (firstNumber / secondNumber));
    }

    //Create multiply method (every method that has no return value is void)
    public void multiplyNumbers() {
        System.out.println("Két szám szorzata: " + (firstNumber * secondNumber));
    }

    //Create modulo method (every method that has no return value is void)
    public void modNumbers() {
        System.out.println("Két szám modulója: " + (firstNumber % secondNumber));
    }

    //Setter method to request information (void methódus, mert nincs visszatérési értéke)
    public void setFirstNumber(int number) {
        firstNumber = number;
    }

    //Getter method to change information (methódus, adat megváltoztatására)
    public int getFirstNumber() {
        return firstNumber;
    }

    //Setter method for secondNumber (ha ugyanolyan nevü a bejövő paraméter mint a változó neve):
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Getter method for secondNumber
    public int getSecondNumber() {
        return secondNumber;
    }
}
