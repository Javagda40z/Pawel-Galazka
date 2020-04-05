package Application2;

public class SprawdzatorLiczbPierwszych {

    public SprawdzatorLiczbPierwszych(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    private int [] liczbyPierwsze;

    public boolean czyPierwsza(int a){
        for(int i : liczbyPierwsze){
            if (i == 0){
                return true;
            }
        }
        return false;
    }
}
