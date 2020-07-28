package utils;

public class Matrix {

    private double [][] Mat;

    public Matrix (){

    }

    public Matrix (int n){

    }

    public Matrix (int n, int m){
        this.Mat = new double[n][m];
    }

    /*
        print matrix
     */
    public void print(){

        System.out.println();
        for (int i = 0; i < this.getNLenght(); i++) {
            System.out.println();
            for (int j = 0; j < this.getMLenght(); j++) {
                System.out.print(this.get(i, j) + ", ");
            }
        }
    }

    /*
        N dimenzio hosz viszaadja
     */
    public int getNLenght(){
        return this.Mat.length;
    };

    /*
            M dimenzio hosz viszaadja
    */
    public int getMLenght(){
        try {
            return this.Mat[0].length;
        }catch (Exception e){
            return -1;
        }
    }

    /*
        hozáad n, m hez egy doublte
     */
    public void add(double doub, int n, int m){
        this.Mat[n][m] = doub;
    }

    /*
        lekér n, m röl egy doublte
     */
    public double get(int n, int m){
        double doub = this.Mat[n][m];
        return doub;
    }

    /*
        A + B => C (Mátrix)
     */
    public static Matrix Sum (Matrix A, Matrix B){
        Matrix C = new Matrix(A.getNLenght(), A.getMLenght());

        for (int i = 0; i < A.getNLenght(); i++) {
            for (int j = 0; j < A.getMLenght(); j++) {
                C.add((A.get(i, j) + B.get(i, j)), i, j);
            }
        }

        return C;
    }

    /*
        A - B => C (Mátrix)
     */
    public static Matrix Sub (Matrix A, Matrix B){
        Matrix C = new Matrix(A.getNLenght(), A.getMLenght());

        for (int i = 0; i < A.getNLenght(); i++) {
            for (int j = 0; j < A.getMLenght(); j++) {
                C.add((A.get(i, j) - B.get(i, j)), i, j);
            }
        }

        return C;
    }

    /*
        A * B => C (Mátrix)
     */
    public static Matrix Multiplication (Matrix A, Matrix B){
        Matrix C = new Matrix(A.getNLenght(), A.getMLenght());

        for (int i = 0; i < A.getNLenght(); i++) {
            for (int j = 0; j < A.getMLenght(); j++) {
                C.add((A.get(i, j) * B.get(j, i)), i, j);
            }
        }

        return C;
    }

    /*
        A : B => C (Mátrix)
     */
    public static Matrix Division (Matrix A, Matrix B){
        Matrix C = new Matrix(A.getNLenght(), A.getMLenght());

        //to do

        return C;
    }

    /*
        A' => C (Mátrix)
     */
    public static Matrix Determ (Matrix A){
        Matrix C = new Matrix(A.getNLenght(), A.getMLenght());

        for (int i = 0; i < A.getNLenght(); i++) {
            for (int j = 0; j < A.getMLenght(); j++) {
                C.add(A.get(i, j), j, i);
            }
        }

        return C;
    }

}
