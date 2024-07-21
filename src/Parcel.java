import java.time.LocalDateTime;
import java.util.Objects;

public class Parcel {
    private String departureCity;
    private String arrivalCity;
    private double packageWeight;
    private LocalDateTime sendingPackage;

    public Parcel(String departureCity, String arrivalCity, double packageWeight, LocalDateTime sendingPackage) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.packageWeight = packageWeight;
        this.sendingPackage = sendingPackage;
    }

    @Override
    public String toString() {
        return "Package{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", packageWeight=" + packageWeight +
                ", sendingPackage=" + sendingPackage +
                '}';
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public LocalDateTime getSendingPackage() {
        return sendingPackage;
    }

    public void setSendingPackage(LocalDateTime sendingPackage) {
        this.sendingPackage = sendingPackage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel aPackage = (Parcel) o;
        return Double.compare(packageWeight, aPackage.packageWeight) == 0 && Objects.equals(departureCity, aPackage.departureCity) && Objects.equals(arrivalCity, aPackage.arrivalCity) && Objects.equals(sendingPackage, aPackage.sendingPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity, packageWeight, sendingPackage);
    }
}


//. Создайте класс "посылка".
//2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
// (посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
//а лишь какая посылка была создана ранее, чем другая)
//2.2 Создать несколько посылок
//2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин
