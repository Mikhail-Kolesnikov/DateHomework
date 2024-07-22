import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainMeeting {

    public static void main(String[] args) {
        Meeting ivanAlisa = new Meeting("Ivan", "Alisa", LocalDateTime.of(2024, 7, 14, 14, 0));
        Meeting pavelElena = new Meeting("Pavel", "Elena", LocalDateTime.of(2024, 8, 6, 10, 15));
        Meeting olegIrina = new Meeting("Oleg", "Irina", LocalDateTime.of(2024, 7, 7, 9, 54));

        List<Meeting> person = new ArrayList<>();

        person.add(ivanAlisa);
        person.add(pavelElena);
        person.add(olegIrina);

        Optional<Meeting> res = person.stream()
                .


    }
}


//3. Создать класс Meeting (встреча), в класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
////Создайте несколько встреч
////Найдите среднее время всех встреч.
////Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00. Тогда среднее время начала встречи - 15-00
