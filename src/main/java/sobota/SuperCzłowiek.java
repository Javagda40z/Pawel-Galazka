package sobota;

public class SuperCzłowiek extends Człowiek {

    int cokolwiek;

    public SuperCzłowiek(String imie, int wiek) {
        super(imie, wiek);
    }

    public int getCokolwiek() {
        return cokolwiek;
    }

    public void setCokolwiek(int cokolwiek) {
        this.cokolwiek = cokolwiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SuperCzłowiek that = (SuperCzłowiek) o;

        return cokolwiek == that.cokolwiek;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cokolwiek;
        return result;
    }
}
