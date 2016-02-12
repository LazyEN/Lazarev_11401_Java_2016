package Classes;

import interfances.Ammo;
import interfances.Silence;

/**
 * Created by engen_000 on 12.02.2016.
 */
public class USP_S implements Ammo, Silence {
    @Override
    public double calibr() {
        return 0.40;
    }

    @Override
    public int oneMagazin() {
        return 14;
    }

    @Override
    public String canBeAnotherCal() {
        System.out.println("Yes");
        return null;
    }

    @Override
    public boolean nalichie() {
        return true;
    }

    @Override
    public boolean VozmoznostSnyat() {
        return true;
    }

    @Override
    public boolean CanHelpInBattle() {
        return true;
    }
}
