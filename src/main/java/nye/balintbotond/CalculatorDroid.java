package nye.balintbotond;

public class CalculatorDroid {

    //Information we should keep hidden outside this the current class. Goal: Encapsulation.
    private int firstNumber;
    private int secondNumber;

    //New object constructor
    public CalculatorDroid() {

    }

    //Setter method to request information (void methódus, mert nincs visszatérési értéke)
    public void setFirstNumber(int number) {
        firstNumber=number;
    }

    //Getter method to change information (methódus, adat megváltoztatására)
    public int getFirstNumber() {
        return firstNumber;
    }

    //Setter method for secondNumber
    public void setSecondNumber(int number) {
        secondNumber=number;
    }

    //Getter method for secondNumber
    public int getSecondNumber() {
        return secondNumber;
    }
}
