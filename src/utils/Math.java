package utils;
public class Math {

    public static int factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num*factorial(num-1);
        }
    }

    public static int factorialLoop(int num)
    {
        int k=1;
        for(int i=1;i<=num;i++)
        {
            k*=i;
        }
        return k;
    }
}
