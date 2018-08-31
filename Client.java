package now.homework.hw1;

public class Client {
    private String name;
    private String surnam;
    private String dateOfBirth;
    private Application application;
    private Passport passport;

    public Client() {
    }

    public Client(String name, String surnam,
                  String dateOfBirth, Application application,
                  Passport passport) {
        this.name = name;
        this.surnam = surnam;
        this.dateOfBirth = dateOfBirth;
        this.application = application;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnam() {
        return surnam;
    }

    public void setSurnam(String surnam) {
        this.surnam = surnam;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surnam='" + surnam + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", application=" + application +
                ", passport=" + passport +
                '}';
    }
}
