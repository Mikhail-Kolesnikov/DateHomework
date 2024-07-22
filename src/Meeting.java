import java.time.LocalDateTime;
import java.util.Objects;

public class Meeting {

    private String firstPerson;
    private String secondPerson;
    private LocalDateTime dateTime;

    public Meeting(String firstPerson, String secondPerson, LocalDateTime dateTime) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "firstPerson='" + firstPerson + '\'' +
                ", secondPerson='" + secondPerson + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public String getFirstPerson() {
        return firstPerson;
    }

    public void setFirstPerson(String firstPerson) {
        this.firstPerson = firstPerson;
    }

    public String getSecondPerson() {
        return secondPerson;
    }

    public void setSecondPerson(String secondPerson) {
        this.secondPerson = secondPerson;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return Objects.equals(firstPerson, meeting.firstPerson) && Objects.equals(secondPerson, meeting.secondPerson) && Objects.equals(dateTime, meeting.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPerson, secondPerson, dateTime);
    }
}



////3. Создать класс Meeting (встреча), в класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
////Создайте несколько встреч
////Найдите среднее время всех встреч.
////Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00. Тогда среднее время начала встречи - 15-00
