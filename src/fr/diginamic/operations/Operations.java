package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char c) {
        double res = 0;
        if (c == '+') {
            res = a + b;
        } else if (c == '-') {
            res = a - b;
        }else if (c == '*') {
            res = a * b;
        }else if (c == '/') {
            res = a / b;
        }
        
        // Imprimez la valeur de res
        
        return res;
    }
}
