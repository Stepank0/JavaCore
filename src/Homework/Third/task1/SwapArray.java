package Homework.Third.task1;

public class SwapArray <T>{
    T tmp;

    public T[] swapElement (T[] array, int a, int b) {
        tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        return array;
    }
}
