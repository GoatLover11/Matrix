package utils;

public class Main {
    public static void main(String[] args) {
        Matrix x = new Matrix(2, 2);
        x.add(2.0, 0, 0);

        Matrix y = new Matrix(2, 2);
        y.add(7.0, 0, 0);

        Matrix c = Matrix.Multiplication(x, y);
        c.print();
    }
}
