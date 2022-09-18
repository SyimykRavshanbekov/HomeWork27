import org.w3c.dom.ls.LSOutput;

import java.security.KeyStore;
import java.util.*;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%.2f" , sqrt().apply(4.5));
        
    }

    public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double> operator = x -> Math.sqrt(x);
        return operator;
    }
}