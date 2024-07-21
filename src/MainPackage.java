import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainPackage {
    public static void main(String[] args) {
        Parcel saintPetersburg = new Parcel("Berlin", "Saint Petersburg", 13, LocalDateTime.of(2024, 12, 23, 12, 54));
        Parcel tokio = new Parcel("Berlin", "Tokio", 11, LocalDateTime.of(2024, 12, 23, 11, 43));
        Parcel london = new Parcel("Moscow", "London", 17, LocalDateTime.of(2024, 12, 23, 17, 13));
        Parcel paris = new Parcel("Berlin", "Paris", 19, LocalDateTime.of(2024, 12, 23, 19, 4));
        Parcel newYork = new Parcel("New York", "Rome", 15, LocalDateTime.of(2024, 12, 23, 9, 38));
        List<Parcel> parcels = new ArrayList<>();


        parcels.add(saintPetersburg);
        parcels.add(tokio);
        parcels.add(london);
        parcels.add(paris);
        parcels.add(newYork);

        Optional<Parcel> res = parcels.stream()
                .filter(x -> x.getDepartureCity().equals("Berlin"))
                .min((x, y) -> x.getSendingPackage().compareTo(y.getSendingPackage()));
        System.out.println(res);


        ////. Создайте класс "посылка".
        ////2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
        //// (посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
        ////а лишь какая посылка была создана ранее, чем другая)
        ////2.2 Создать несколько посылок
        ////2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин


    }
}
