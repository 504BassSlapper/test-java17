import java.util.Comparator;
import java.util.function.BiPredicate;

public class test8 {
    public static void main(String... args) {
        Runnable runnable = () -> System.out.println("new");
        runnable.run();
        BiPredicate<Object, Object> r = null;
        //r.negate();
        Comparator<Integer> c = (a, b) -> a - b;
        System.out.println(c);


    }

}
