import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true; // еще немножко оптимизации: логично, что если ссылки на объекты равны, то и объекты равны
//        }
//        if (hashCode() != obj.hashCode()) {
//            return false; // проверка хэш кодов
//        }
//        if (!(obj instanceof Address)) {
//            return false; // проверка, что obj типа Address
//        }
//
//        Address address = (Address) obj;
//        // сравниваем поля
//        return this.city.equals(address.city)
//                && this.street.equals(address.street)
//                && this.numberOfHouse == address.numberOfHouse; // заметим, что у класса String метод equals() уже правильно переопределен
//    }
//
//    @Override
//    public int hashCode() {
//        return city.hashCode() + street.hashCode() + numberOfHouse;
//        // что вообще произошло? hashCode() у строк уже переопределен, а у int он совпадает с самим числом,
//        // то есть одинаковые поля дадут нам одинаковый хэш код, что в общем то и требовалось
//
//        /* стоит кстати заметить, что это не лучшая реализация, ведь можно выйти за пределы int, или, например,
//           город Москва и улица Зеленая и город Зеленая и улица Москва имеют одинаковый хэш код */
//    }


    // автоматически сгенерированные переопределения методов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return numberOfHouse == address.numberOfHouse && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, numberOfHouse);
    }
}