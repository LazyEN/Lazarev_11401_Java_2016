package Classes;

import interfances.Aim;
import interfances.Ammo;

/**
 * Created by engen_000 on 12.02.2016.
 */
public class AUG_A3 implements Aim, Ammo {
    @Override
    public String getAimType() {
        System.out.println("Standart");
        return null;
    }

    @Override
    public int howManyAimTypes() {
        return 3;
    }

    @Override
    public String otBedra() {
        System.out.println("Hard");
        return null;
    }

    @Override
    public double calibr() {
        return 5.56;
    }

    @Override
    public int oneMagazin() {
        return 30;
    }

    @Override
    public String canBeAnotherCal() {
        System.out.println("Yes");
        return null;
    }
}
