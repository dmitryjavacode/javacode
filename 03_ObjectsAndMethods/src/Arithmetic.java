public class Arithmetic {
    private int numOne;
    private int numTwo;

    public Arithmetic(int numOne, int numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public int sumNumber(){
        return this.numOne + this.numTwo;
    }

    public int multiplicationNumber(){
        return this.numOne * this.numTwo;
    }

    public int maxNumber(){
        return Math.max(this.numOne, this.numTwo);
    }

    public int minNumber(){
        return Math.min(this.numOne, this.numTwo);
    }
}