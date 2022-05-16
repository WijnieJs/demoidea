



public class Pet {
    private String name;
    private int age;
    private String species;
    private Person owner;
    public Pet(String name, int age, String species) {

        this.name = name;
        this.age = age;
        this.species = species;
    }
    // SETTERSS


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void addOwner(Person owner) {
        this.owner = owner;
    }
}
