package fbs.lg1;

public class Paketannahme {

    public EnumAbnahme annahmePruefen(boolean gefahrenstoff, boolean zuSchwer, boolean zuGroß, boolean zerbrechlich) {

        EnumAbnahme result = EnumAbnahme.ANNAHME;

        if (gefahrenstoff == true) {
            result = EnumAbnahme.ABLEHNEN;

        } else if (zuSchwer == true || zuGroß == true) {
            result = EnumAbnahme.SPERRGUT;

        }
        if ((result == EnumAbnahme.SPERRGUT && zerbrechlich == true)
                || (result != EnumAbnahme.ABLEHNEN && zerbrechlich == true)) {

            result = EnumAbnahme.ANNAHME_ZERBRECHLICH;
        }

        return result;
    }
}
