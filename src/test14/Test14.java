package test14;

import java.io.*;

public class Test14 {
    // if you want it to compile
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        try(var is = new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("file")))){
//            Bird b = (Bird) is.readObject();
//        }
//    }
    public static void main(String[] args) {
        try(var is = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("file")))){
            Bird b =  is.readObject();
        }
    }

    private static class Bird {
        private String name;
        private int age;
        private

    }
}
