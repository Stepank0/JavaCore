package Homework.Third.task1;

import java.util.Arrays;

public class PlayMain {
    static String [] firstArray = {"1","2","3","4"};
    static Integer [] secondArray = {5,6,7,8};
    public static void main(String[] args) {
//        1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

        SwapArray<Object> swapArray = new SwapArray<>();
        try {
            System.out.println(Arrays.toString(swapArray.swapElement(firstArray, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArray.swapElement(secondArray, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

//        System.out.println(Arrays.toString(swapArray.swapElement(firstArray, 0, 3)));
//        System.out.println(Arrays.toString(swapArray.swapElement(secondArray, 0, 3)));
    }
}
