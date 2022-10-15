public class Fraction {

    private int numerator;
    private int denominator;
    private int k;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void multiply(int n){

        if (n == 0){
            return;
        }

        this.numerator *= n;
        this.denominator *= n;

    }

    public void printFraction(){
        System.out.println(this.numerator + "/" + this.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction){
            Fraction f2 = (Fraction) obj;

            if (numerator * f2.denominator == denominator * f2.numerator) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public void truncated(){
        k = denominator % numerator;
        if(k == 0){
            System.out.println((1) + " / " + (denominator / numerator));
        }
        System.out.println(numerator / k + " / " + denominator / k);
    }

}
