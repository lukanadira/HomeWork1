public class SmallestString {
    public static String smallest(String Smallest[]) {
        String first = Smallest[0];
        for (int i = 1 ; i < Smallest.length ; i++) {
            if (Smallest[i].length()<first.length()) {
                first = Smallest[i];
            }
        }
        return first;
    }
}

