package domaci25_05_zadatak1;

public class Pas extends Zivotinja{

    private boolean goodBoy;
    public Pas() {
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public String isGoogOrBad(){
        if (goodBoy == false){
            return "I am a bad boy";
        }
        return "I am a good boy";
    }

    public String zvukZivotinje() {
        return "woof";
    }

    @Override
    public String toString() {
        return "Pas{" + super.toString()
                 + "goodBoy=" + goodBoy + " pas laje : " + zvukZivotinje() +
                "} " ;
    }
}
