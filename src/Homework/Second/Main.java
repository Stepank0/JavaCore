package Homework.Second;



public class Main {
    private static final int ARRAY_SIZE = 4;
    private static final String WRONG_SIZE_ARRAY = "Wrong array size!\nExpected size: 4x4.";
    private static final String WRONG_DATA_ARRAY = "Wrong data type.";
    private static final String RESULT_CAPTION = "Сумма эелементов:";


    public static void main(String[] args) {

        String[][] validArray =  {{"1","2","2","1"},
                {"2","3","1","1"},
                {"3","2","1","2"},
                {"4","1","3","2"}};

        String[][] wrongDataArray =  {{"Q","2","2","1"},
                {"2","3","1","1"},
                {"3","2","1","2"},
                {"4","1","3","2"}};

        String[][] wrongSizeArray =  {{"1","2","2","1","3"},
                {"2","3","1","1"},
                {"3","2","1","2"},
                {"4","1","3","2"}};

        try{
            System.out.println(sum(validArray));
            System.out.println(sum(wrongSizeArray));

        } catch (MyArrayExceptions myArrayExceptions) {
            myArrayExceptions.printStackTrace();
        }
        try{
            System.out.println(sum(wrongDataArray));
        } catch (MyArrayDataException | MyArrayExceptions myArrayDataException){
            myArrayDataException.printStackTrace();
        }




    }

    public static void checkSizeArray (String [][] array) throws MyArraySizeException {
        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException(WRONG_SIZE_ARRAY);
        }
        for (String[] strings : array) {
            if (strings.length != ARRAY_SIZE) {
                throw new MyArraySizeException(WRONG_SIZE_ARRAY);
            }
        }
    }

    public static void checkIntArray (String[][] array) throws MyArrayDataException {
        int row;
        int column;
        for (row = 0; row < array.length; row++){
            for (column = 0; column< array[row].length; column++) {
                try{
                    Integer.parseInt(array[row][column]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(WRONG_DATA_ARRAY +
                            "\n In row: " + (1 + row) + ", column: " + (1 + column));
                }
            }
        }
    }

    private static String sum(String[][] _array) throws MyArrayExceptions {
        checkSizeArray(_array);
        checkIntArray(_array);
        return RESULT_CAPTION + "\n" + _sum(_array);
    }

    private static long _sum(String[][] _array) {
        long result = 0;
        for (String[] strings : _array) {
            for (String string : strings) {
                result += (long) Long.parseLong(string);
            }
        }
        return result;
    }
}