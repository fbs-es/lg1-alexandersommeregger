package fbs.lg1;

public class PreisRechnerVersand {

    public int versandRechner(boolean inland, boolean normalVersand, int basispreis) {
        int endpreis = -1;

        if (inland == true && normalVersand == true) {
            endpreis = basispreis + ZuschlaegeZuBasispreis.INLANDNORMAL.getZuschlag();
        } else if (inland == true && normalVersand == false) {
            endpreis = basispreis + ZuschlaegeZuBasispreis.INDLANDEXPRESS.getZuschlag();
        } else if (inland == false && normalVersand == true) {
            endpreis = basispreis + ZuschlaegeZuBasispreis.AUSLANDNORMAL.getZuschlag();
        } else if (inland == false && normalVersand == false) {
            endpreis = basispreis + ZuschlaegeZuBasispreis.AUSLANDEXPRESS.getZuschlag();
        }

        return endpreis;
    }
}