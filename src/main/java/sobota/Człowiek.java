package sobota;

public class Człowiek {

    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Człowiek(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Człowiek człowiek = (Człowiek) o;

        if (wiek != człowiek.wiek) return false;
        return imie.equals(człowiek.imie);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + wiek;
        return result;
    }
}
