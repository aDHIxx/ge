package com.bridgelabz.functionalpgms;
public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(root1 +", "+root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println(+ root);
        } else {
            System.out.println("No real roots exists");
        }
    }
}
