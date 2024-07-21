import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainProgramming {
    public static void main(String[] args) {
        Programming cPlusPlus = new Programming("C++", "Bell Labs", LocalDate.of(1969, 12, 20));
        Programming python = new Programming("Python", "Guido Van Rossum", LocalDate.of(1989, 9, 21));
        Programming java = new Programming("Java", "James Gosling", LocalDate.of(1955, 5, 19));

        List<Programming> programmings = new ArrayList<>();
        programmings.add(cPlusPlus);
        programmings.add(python);
        programmings.add(java);
        Optional<Programming> res = programmings.stream()
                .min((x, y) -> x.getFirstDate().compareTo(y.getFirstDate()));
        System.out.println(res.get());


    }
}


//1. Создайте класс "Язык программирования"
//1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
//1.2 Создайте несколько языков программирования
//1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)