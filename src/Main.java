import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //  quite challenging.
        //1. What is the result of executing the following code snippet?
        // line 8 and line 12
        final int score1 = 8, score2 = 3;
        char myScore = 7;
        var goal = switch (myScore) {
            default -> "unknown";
            case score1 -> "great";
            case 2, 4, 6 -> "good";
            case score2, 0 -> "bad";
        };
        // System.out.println(goal);
        //System.out.println("Hello world!");
        //2. What is the output of the following code snippet?
        int moon = 9, star = 2 + 2 * 3;
        float sun = star > 10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        // System.out.println(sun + ", " + jupiter + ", " + mars);
        // solution 3.0, 11.0, 2

        //4. output of code
        // code does not terminate
//        Predicate<String> empty = String::isEmpty;
//        Predicate<String> notempty = empty.negate();
//        var result = Stream.generate(()-> "").filter(notempty)
//                .collect(Collectors.groupingBy(k->k)).entrySet().stream()
//                .map(Map.Entry::getValue).flatMap(Collection::stream)
//                .collect(Collectors.partitioningBy(notempty));
//        System.out.println(result);

        //5. result ?
        var fr = new Locale("fr");
        Locale.setDefault(new Locale("en","US"));
        var b = ResourceBundle.getBundle("pinguin", fr);
        System.out.println(b.getString("name"));
        System.out.println(b.getString("age"));


    }
    private static class MathFunc{
        public static void addTOInt(int x, int amountToAdd) {
            x=x+amountToAdd;

        }

        public static void main(String[] args) {
            var a = 15;
            var b = 10;
            MathFunc.addTOInt(a,b);
            System.out.println(a);
        }
    }

}