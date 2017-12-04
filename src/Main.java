import java.util.Arrays;
import java.util.Scanner;
import utils.Math;
import utils.ArrayUtils;
public class Main {

    public static void main(String[] RTL){
        System.out.print(Math.factorial(new Scanner(System.in).nextInt())+"\n");
        System.out.print(Math.factorialLoop(new Scanner(System.in).nextInt())+"\n");
        System.out.print(Arrays.toString(ArrayUtils.reverse(new int[]{1, 2, 3}))+"\n");
        System.out.println(ArrayUtils.stringifyArray(new int[]{1,2,3,4,5,6,7}));
    }
}