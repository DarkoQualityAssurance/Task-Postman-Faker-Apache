package domaci25_05_zadatak1;

public class Macka extends Zivotinja{


    private double tezina;

    public Macka() {
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public String isHeavy(){
        if (tezina>5){
            return "I’m a chonk";
        }
        return "I’m not a chonk";
    }

    public String zvukZivotinje(){
        return "meow";
    }

    @Override
    public String toString() {
        return "Macka{" + super.toString() +
                " Are you Chonk= " + isHeavy() + " , macka mjauce= " + zvukZivotinje() +
               " " + "} ";
    }
}
