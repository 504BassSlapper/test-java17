package test13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test13 {
    public static void main(String[] args) {
        // compiles
        Set<? extends RuntimeException> setRuntimeException = new HashSet<>();
        Set<? extends RuntimeException> setRuntimeException1 = new TreeSet<RuntimeException>();
        Set<? extends RuntimeException> setRuntimeException2 = new TreeSet<NullPointerException>();
    }
}
