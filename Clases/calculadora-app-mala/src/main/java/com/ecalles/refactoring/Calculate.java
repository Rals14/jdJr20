package com.ecalles.refactoring;

public class Calculate {
    private double a; // This is the first operator
    private double b; // This is the second operator
    private String o; // This is the last operation executed
    private double r; // This is the last obtained result

    public Calculate(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Getters and Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // This method realice an addition, return th result,
    //... store the operation name (o) and the result (r)
    public double aOp() {
        double res;
        res = this.a + this.b;
        this.r = res;
        this.o = "Addition";
        return res;
    }

    // This method realice a subtraction, return the result,
    //... store the operation name (o) and the result (r)
    public double sOp() {
        double res;
        res = this.a - this.b;
        this.r = res;
        this.o = "Subtraction";
        return res;
    }
}
