package homeworks.homework01;

import java.util.Random;

public class Array {
    private int[] numbers;
    Random random = new Random();

    public Array(int[] numbers) {
        this.numbers = numbers;
    }

    public void fillOutArray(){
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(numbers.length) + 1;
        }
    }

    public boolean divisibleBy21(int number){
        return number % 21 == 0;
    }

    public boolean containsTheNumber3(int number){
        return String.valueOf(number).contains("3");
    }

    public int quantityResult(){
        int count = 0;
        for (int number : numbers){
            if (divisibleBy21(number) && containsTheNumber3(number)){
                count++;
            }
        }
        return count;
    }

}
