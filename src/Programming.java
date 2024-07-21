import java.time.LocalDate;
import java.util.Objects;

public class Programming {

    private String name;
    private String company;
    private LocalDate firstDate;

    public Programming(String name, String company, LocalDate firstDate) {
        this.name = name;
        this.company = company;
        this.firstDate = firstDate;
    }

    @Override
    public String toString() {
        return "Programming{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", firstDate=" + firstDate +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(LocalDate firstDate) {
        this.firstDate = firstDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programming that = (Programming) o;
        return Objects.equals(name, that.name) && Objects.equals(company, that.company) && Objects.equals(firstDate, that.firstDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, firstDate);
    }
}


//1. Создайте класс "Язык программирования"
//1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
//1.2 Создайте несколько языков программирования
//1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)