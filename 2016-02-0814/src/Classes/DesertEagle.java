package Classes;

import interfances.Aim;
import interfances.Ammo;

import javax.sound.midi.Soundbank;

/**
 * Created by engen_000 on 12.02.2016.
 */
public class DesertEagle implements Aim, Ammo{
    @Override
    public String getAimType() {
        System.out.println("Standart");
        return null;
    }

    @Override
    public int howManyAimTypes() {
        return 4;
    }

    @Override
    public String otBedra() {
        System.out.println("Easy");
        return null;
    }

    @Override
    public double calibr() {
        return 0.50;
    }

    @Override
    public int oneMagazin() {
        return 7;
    }

    @Override
    public String canBeAnotherCal() {
        System.out.println("Yes ");
        return null;
    }
}
