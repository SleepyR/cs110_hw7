import animals.Puppy;
import utils.*;
import utils.Math;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class Driver {
    public static void main(String[] RTL) {

        Puppy puppy1=new Puppy("Joey");
        Puppy puppy2=new Puppy("Chandler");
        Puppy puppy3=new Puppy("Ross");
        System.out.println(puppy1.getName());
        System.out.println(puppy2.getName());
        System.out.println(puppy3.getName());

        System.out.println(ArrayUtils.stringifyArray(ArrayUtils.reverse(new int[]{9, 20, 3, 44, 88, 300})));
        System.out.print(Math.factorial(intValue(15.4)));
    }
}
