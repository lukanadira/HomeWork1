public class Main {
    public static void main(String[] args) {
        Determinant determinant = new Determinant();
        determinant.a = 1;
        determinant.b = 2;
        determinant.c = 3;
        determinant.print();

        String smallest[] = {"Mercedes-benz", "Porsche", "BMW", "Maserati", "Ferrari"};
        SmallestString smallestString = new SmallestString();
        System.out.println("smallest string: " + smallestString.smallest(smallest));

        Fraction f1 = new Fraction(6,8);
        Fraction f2 = new Fraction(2,6);

        f1.printFraction();
        f1.truncated();
        f1.multiply(5);
        f1.printFraction();

        System.out.println(f1.toString());


    }
}