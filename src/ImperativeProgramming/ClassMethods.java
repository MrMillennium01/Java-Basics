package ImperativeProgramming;

public class ClassMethods {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(sumOfIntegers(arr));
        System.out.println(sumVarargs(1,2,3,4,5,6));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3.0));
        System.out.println(sum(0x12,0b10)); // some fun things

        short num = 3;
        System.out.println(sum(1,2,num)); // double or int?
        float num2 = 3.1F;
        System.out.println(sum(1,2,num2));
        // floats are actually tricky because of rounding - just take double

        // now introduced float:
        System.out.println(sum2(1,2,3)); // float or double?
    }

    public static int sumOfIntegers(int[] Integers){
        int sum = 0;
        for (int num: Integers){
            sum+=num;
        }
        return sum;
    }

    public static int sumVarargs(int... arr){
        // varargs: keine array Eingabe notwendig, sondern direkt Zahlen
        int sum = 0;
        for (int num: arr){
            sum+=num;
        }
        return sum;
    }

    /*
    Method overloading: same Class name, but different input variable types:
    the Class is chosen, for which the input all can be implicitly typecasted
    if both are okay (e.g. int input for the both below) the Class is chosen,
    which takes a more specific input (short<int<long<float<double)
    Example:
    input: {int, short, int} => the int-Class is chosen, since it takes only its (or shorts)
    the double class is not chosen, since for this, more has to be implicitly
    typecasted
     */

    public static int sum(int... arr){
        System.out.println("int function");
        int sum = 0;
        for (int num: arr){
            sum+=num;
        }
        return sum;
    }

    public static double sum(double... arr){
        System.out.println("double function");
        double sum = 0;
        for (double num: arr){
            sum+=num;
        }
        return sum;
    }

    public static float sum2(float... arr){ // another float one
        System.out.println("float function");
        float sum = 0;
        for (float num: arr){
            sum+=num;
        }
        return sum;
    }

    public static double sum2(double... arr){
        System.out.println("double function");
        double sum = 0;
        for (double num: arr){
            sum+=num;
        }
        return sum;
    }
}
