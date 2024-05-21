
public class ICE3 {

    public static void main(String[] args) {
        String expr = ""
                + "{}";

        if (GFG.areBracketsBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static class GFG {

        public static boolean areBracketsBalanced(String s) {
            int round = 0;
            int curly = 0;
            int square = 0;

            for (char ch : s.toCharArray()) {
                switch (ch) {
                    case '(':
                        round++;
                        break;
                    case ')':
                        round--;
                        if (round < 0) {
                            return false;
                        }
                        break;
                    case '{':
                        curly++;
                        break;
                    case '}':
                        curly--;
                        if (curly < 0) {
                            return false;
                        }
                        break;
                    case '[':
                        square++;
                        break;
                    case ']':
                        square--;
                        if (square < 0) {
                            return false;
                        }
                        break;
                }
            }
            return round == 0 && curly == 0 && square == 0;
        }

        static int squareSum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (2 * i - 1) * (2 * i - 1);
            }
            return sum;
        }

        public static void main(String args[]) {
            int limit = 5;
            int result = 0;
            for (int i = 1; i <= limit; i++) {
                result += squareSum(i);
            }
            System.out.println("Sum of squares of odd numbers up to " + limit + ": " + result);
        }
    }

}
