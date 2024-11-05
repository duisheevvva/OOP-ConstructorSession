import java.time.LocalDate;

public class Company {
    String name;
    String country;
    LocalDate foundationDate;
    String founder;
    Group[] groups;

    public Company(){

    }

    public Company(String  name,String  country,LocalDate foundationDate,String founder,Group[] groups){
        this.name = name;
        this.country = country;
        this.foundationDate = foundationDate;
        this.founder = founder;
        this.groups = groups;
    }
}
