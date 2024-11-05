import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Baiel", "Karabaev", LocalDate.of(2004, 12, 20));
        Person person2 = new Person("Amir", "Altymyshev", LocalDate.of(2006, 11, 6));
        Person person3 = new Person("Aibek", "Duisho uulu", LocalDate.of(2005, 1, 14));
        Person person4 = new Person("Kanchoro", "Maraimov", LocalDate.of(2003, 10, 7));

        Person[] peopleJava = {person1, person2};
        Person[] peopleJS = {person3, person4};

        Group java = new Group("Java16", LocalDate.of(2024, 10, 1), "Urmat", peopleJava);
        Group js = new Group("JS16", LocalDate.of(2024, 10, 1), "Rabiya", peopleJS);

        Group[] groups = {java, js};

        Company company = new Company("Peaksoft", "KG", LocalDate.of(2020, 11, 16), "Esen Niazov", groups);
        System.out.println("Name: " + company.name + "\n" +
                "Country: " + company.country + "\n" +
                "FoundationDate: " + company.foundationDate + "\n" +
                "Founder: " + company.founder + "\n" +
                "Groups: " + Arrays.toString(company.groups)
        );


    }
}