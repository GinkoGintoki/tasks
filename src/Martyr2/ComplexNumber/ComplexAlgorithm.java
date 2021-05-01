package Martyr2.ComplexNumber;

public class ComplexAlgorithm {
    private final double first;
    private final double second;

    public ComplexAlgorithm(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public static ComplexAlgorithm addition(ComplexAlgorithm firstN, ComplexAlgorithm secondN) {
        return new ComplexAlgorithm(firstN.getFirst() + secondN.getFirst(), firstN.getSecond() + secondN.getSecond());
    }

    public static ComplexAlgorithm subtraction(ComplexAlgorithm firstN, ComplexAlgorithm secondN) {
        return new ComplexAlgorithm(firstN.getFirst() - secondN.getFirst(), firstN.getSecond() - secondN.getSecond());
    }

    public static ComplexAlgorithm multiplication(ComplexAlgorithm firstN, ComplexAlgorithm secondN) {
        return new ComplexAlgorithm((firstN.getFirst() * secondN.getFirst()) - (firstN.getSecond() * secondN.getSecond()),
                (firstN.getFirst() * secondN.getSecond()) + (secondN.getFirst() * firstN.getSecond()));
    }

    public static ComplexAlgorithm division(ComplexAlgorithm firstN, ComplexAlgorithm secondN) {
        double cf = 1 / (Math.pow(secondN.getFirst(), 2) - (Math.pow(secondN.getSecond(), 2)));
        double anti = secondN.getFirst() - secondN.getSecond();
        ComplexAlgorithm f = multiplication(firstN, new ComplexAlgorithm(secondN.getFirst(), -(secondN.getSecond())));
        return new ComplexAlgorithm(f.getFirst() * cf, f.getSecond() * cf);
    }

    public static ComplexAlgorithm negation(ComplexAlgorithm firstN) {
        return new ComplexAlgorithm(firstN.getFirst() * (-1), firstN.getSecond() * (-1));
    }

    public static ComplexAlgorithm inversion(ComplexAlgorithm firstN) {
        double sum = Math.pow(firstN.getFirst(), 2) + Math.pow(firstN.getSecond(), 2);
        return new ComplexAlgorithm(firstN.getFirst() / sum, -(firstN.getSecond() / sum));
    }

    public String toString() {
        String result = "";
        if (getFirst() < 0) {
            result += "(" + getFirst() + ")";
        } else {
            result += getFirst();
        }
        result += " + ";
        if (getSecond() < 0) {
            result += "(" + getSecond() + ")";
        } else {
            result += getSecond();
        }
        
        result+= "i";

        return result;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }
}
