public class Telephone {
    String markaTel;
    double rozdzielczoscEkranu;
    int numer;

    public Telephone(String markaTel, double rozdzielczoscEkranu, int numer) {
        this.markaTel = markaTel;
        this.rozdzielczoscEkranu = rozdzielczoscEkranu;
        this.numer = numer;
    }

    String wyslijWiadomosc(String sms, int numerTel){
        return "Wysylam wiadomosc "+sms+" na numer"+numerTel;

    }

    public String toString(){
        return "Telephone{"+
                "marka='"+ markaTel + '\'' +
                ", rozdzielczosc " + rozdzielczoscEkranu +
                ", numer=" + numer +
                '}';
    }

}
