package main.methods;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class MultipleParameters {

    public static void main(String[] args) {
        int result = adder(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        System.out.println(result);

        int result2 = adder();
        System.out.println(result2);

        int result3 = adder(null);
        System.out.println(result3);
    }

    public static int adder(@Nullable int... numbers) {
        int total = 0;

        if (numbers != null) {
            for (int number: numbers) {
                total += number;
            }
        }

        return total;
    }
}
