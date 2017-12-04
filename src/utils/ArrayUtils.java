package utils;

public class ArrayUtils {
    public static int[] reverse(int[] numbers) {
        int m = numbers.length;
        for (int i = 0; i < m / 2; i++) {
            int k = numbers[i];
            numbers[i] = numbers[m - i - 1];
            numbers[m - i - 1] = k;
        }
        return numbers;
    }

    public static String stringifyArray(int[] number)
    {
        String numbers=number[0]+"";
        for(int i=1;i<number.length;i++)
        {
            numbers+=","+number[i];
        }
        return numbers;
    }


}
