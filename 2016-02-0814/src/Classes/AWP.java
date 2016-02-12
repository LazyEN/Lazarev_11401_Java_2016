package Classes;

import interfances.Ammo;
import interfances.Dalnost;

/**
 * Created by engen_000 on 12.02.2016.
 */
public class AWP implements Dalnost, Ammo{
    @Override
    public double calibr() {
        return 8.6;
    }

    @Override
    public int oneMagazin() {
        return 5;
    }

    @Override
    public String canBeAnotherCal() {
        System.out.println("Yes");
        return null;
    }

    @Override
    public int min() {
        return 180;
    }

    @Override
    public int max() {
        return 1500;
    }

    @Override
    public int effect() {
        return 550;
    }
}
