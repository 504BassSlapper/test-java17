package testanimal.other;

import testanimal.animal.Frog;

public class Tradpole  extends Frog {
    public static void main(String[] args) {
        Tradpole tradpole = new Tradpole();
        tradpole.jump();
        tradpole.ribbit();
        Frog f = new Tradpole();
        f.ribbit();
        f.jump();


    }
}
