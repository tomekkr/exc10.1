class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) {
        if (firstName.length() < 2)
            throw new NameUndefinedException("Imię musi składać się przynajmniej z dwóch znaków");
        if (lastName.length() < 2)
            throw new NameUndefinedException("Nazwisko musi składać się przynajmniej z dwóch znaków");
        if (age < 1)
            throw new IncorrectAgeException("Wiek nie może być mniejszy niż 1");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
