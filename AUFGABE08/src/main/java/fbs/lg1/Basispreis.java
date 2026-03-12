package fbs.lg1;

public enum Basispreis {
    S(5),
    M(10),
    L(15);

    private final int basispreis;

    Basispreis(int basispreis) {
        this.basispreis = basispreis;
    }

    public int getBasispreis() {
        return this.basispreis;
    }
}
