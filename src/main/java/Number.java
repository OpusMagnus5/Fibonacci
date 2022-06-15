public class Number {
    private long number;
    private int noFibonacci;

    public Number(){

    }
    public Number(long number){
        this.number = number;
        this.noFibonacci = -1;
    }

    public long getNumber() {
        return number;
    }

    public int getNoFibonacci() {
        return noFibonacci;
    }

    public void setNoFibonacci(int noFibonacci) {
        this.noFibonacci = noFibonacci;
    }
}
