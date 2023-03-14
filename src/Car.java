public class Car {
    String colorSamochodu;
    String markaSamochodu;
    double pojemnoscSilnika;

    public Car(String colorSamochodu, String markaSamochodu, double pojemnoscSilnika) {
        this.colorSamochodu = colorSamochodu;
        this.markaSamochodu = markaSamochodu;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String CarInfo(){
        return "Marka samochodu to: " +this.markaSamochodu+ " kolor samochodu to: " +this.markaSamochodu;
    }

    public double pojemnosc(double pojemnoscNew){
        this.pojemnoscSilnika=pojemnoscNew;
        return this.pojemnoscSilnika;
    }

    public boolean czySilnikWysokoObrotowy(double poj){
        if(poj>=2){
            return true;
        }
        return false;
    }


   /* public String toString(){
        return "Car"+
                "kolor='"+ colorSamochodu + '\'' +
                ", marka " + markaSamochodu+
                ", pojemnosc=" + pojemnoscSilnika;
    }
    */

}

