package by.maksim.service;

public class CalcOperations implements CalcService {


    public double sum(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double calculate (String opType, double x, double y) {
        double result = 0;
        switch (opType) {
            case "sum" :
                result = sum (x, y);
                break;
            case "sub" :
                result = sub (x, y);
                break;
            case "mul" :
                result = mul(x, y);
                break;
            case "div" :
                result = div(x, y);
                break;
        }
        return result;
    }
}