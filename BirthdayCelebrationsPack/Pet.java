package BirthdayCelebrationsPack;

public class Pet implements Birthable, Identifiable {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }



    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.getId();
    }

    public String getName() {
        return this.name;
    }
}
