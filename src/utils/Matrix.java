package utils;

public class Matrix {

    private double [][] Mat;

    public Matrix (){

    }

    public Matrix (Matrix A){
        this.Mat = new double[A.getNLenght()][A.getMLenght()];

        for (int i = 0; i < A.getNLenght(); i++) {
            for (int j = 0; j < A.getMLenght(); j++) {
                this.add(A.get(i, j), i, j);
            }
        }
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
    public static Matrix Trans (Matrix A){
        Matrix C = new Matrix(A.getNLenght(), A.getMLenght());

        for (int i = 0; i < A.getNLenght(); i++) {
            for (int j = 0; j < A.getMLenght(); j++) {
                C.add(A.get(i, j), j, i);
            }
        }

        return C;
    }

    /*
        this matrix add B matrix
     */
    public void sum (Matrix B){
        for (int i = 0; i < this.getNLenght(); i++) {
            for (int j = 0; j < this.getMLenght(); j++) {
                this.add((this.get(i, j) + B.get(i, j)), i, j);
            }
        }
    }

    /*
        this matrix sub B matrix
     */
    public void sub (Matrix B){
        for (int i = 0; i < this.getNLenght(); i++) {
            for (int j = 0; j < this.getMLenght(); j++) {
                this.add((this.get(i, j) - B.get(i, j)), i, j);
            }
        }
    }

    /*
        this matrix * B matrix
     */
    public void multi (Matrix B){
        for (int i = 0; i < this.getNLenght(); i++) {
            for (int j = 0; j < this.getMLenght(); j++) {
                this.add((this.get(i, j) * B.get(j, i)), i, j);
            }
        }
    }

    /*
        this matrix trans
     */
    public void trans (Matrix B){
        for (int i = 0; i < this.getNLenght(); i++) {
            for (int j = 0; j < this.getMLenght(); j++) {
                this.add(this.get(i, j), j, i);
            }
        }
    }

    public void fillRan(){
        for (int i = 0; i < this.getNLenght(); i++) {
            for (int j = 0; j < this.getMLenght(); j++) {
                this.add(Math.random(), i, j);
            }
        }
    }

}
