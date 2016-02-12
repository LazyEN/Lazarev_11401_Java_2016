package Classes;

import interfances.PiwPiw;
import interfances.Silence;

/**
 * Created by engen_000 on 12.02.2016.
 */
public class M4A1_s implements Silence, PiwPiw {
    @Override
    public String getSound() {
        System.out.println("Psh-Psh-PSh");
        return null;
    }

    @Override
    public String getTypeShooting() {
        System.out.println("Auto");
        return null;
    }

    @Override
    public String kolichestvoVodinClick() {
        System.out.println("Many");
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
