package Classes;

import com.sun.org.apache.xpath.internal.SourceTree;
import interfances.Accessories;
import interfances.PiwPiw;

/**
 * Created by engen_000 on 12.02.2016.
 */
public class Ak47 implements PiwPiw, Accessories{

    @Override
    public String getSound() {
        System.out.println("Tra-ta-ta");
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
    public int howManyAcc() {
        return 1;
    }

    @Override
    public String Soshki() {
        System.out.println("NO");
        return null;
    }

    @Override
    public String Remen() {
        System.out.println("Yes");
        return null;
    }
}
