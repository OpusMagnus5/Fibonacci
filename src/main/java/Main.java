import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczby:");
        Number[] numbers = new Number[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = new Number(in.nextLong());
        }
        findNumberInFibonacci(numbers);
        for (Number element : numbers){
            System.out.print(element.getNoFibonacci() + " ");
        }
    }

    public static Number[] findNumberInFibonacci(Number[] numbers){
        long num1 = 0;
        long num2 = 1;
        int no = 0;
        int match = 0;
        return findNumberInFibonacci(numbers, num1, num2, no, match);
    }

    private static Number[] findNumberInFibonacci(Number[] numbers, long num1, long num2, int no, int match){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i].getNumber() == num1){
                numbers[i].setNoFibonacci(no);
                match++;
            }
        }
        if (match < 5){
            long temp = num1;
            num1 = num2;
            num2 += temp;
            no++;
            findNumberInFibonacci(numbers, num1, num2, no, match);
        }
        return numbers;
    }
}
