public class Main {
    public static void main(String[]args){
        Telephone telephone1=new Telephone("Samsung", 4.5, 123456785);
        Telephone telephone2=new Telephone("Apple", 3, 987654321);
        Telephone telephone3=new Telephone("Huawei", 3.3, 657384652);

        System.out.println(telephone3.wyslijWiadomosc("Hej hej", telephone1.numer));

        Car car1=new Car("Czerwony", "Mercedes", 2.0);
        Car car2=new Car("Szary", "Audi", 3.0);
        Car car3=new Car("Czarny", "Suzuki", 1.2);


    }
}
