package address;

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setIndex(61001);
        myAddress.setCountry("Україна");
        myAddress.setCity("Харків");
        myAddress.setStreet("пл. Вокзальна");
        myAddress.setHouse("1");
        myAddress.setApartment("2");
        System.out.println("Нова адреса: " + myAddress.getIndex() + ", " +
                myAddress.getCountry() + ", " +
                myAddress.getCity() + ", " +
                myAddress.getStreet() + ", " +
                myAddress.getHouse() + ", " +
                myAddress.getApartment());
    }
}
