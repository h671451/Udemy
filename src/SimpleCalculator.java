public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    private double firstNumber;
    private double secondNumber;

    // region Properties
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // endregion

    // region Methods

    public double getAdditionResult(){
        double sum = 0.0;

        sum = getFirstNumber() + getSecondNumber();

        return sum;
    }

    public double getSubtractionResult(){
        double difference = 0.0;

        difference = getFirstNumber() - getSecondNumber();

        return difference;
    }

    public double getMultiplicationResult(){
        double product = 0.0;

        product = getFirstNumber() * getSecondNumber();

        return product;
    }

    public double getDivisionResult(){
        double quotient = 0.0;

        if(getSecondNumber() == 0) {
            quotient = 0.0;
            System.out.println("\n(NOTE: Dividing by 0 typically yields an invalid result.)");
        }
        else
            quotient = getFirstNumber() / getSecondNumber();

        return quotient;
    }

    // endregion
}

