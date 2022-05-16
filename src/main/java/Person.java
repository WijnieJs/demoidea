 import java.util.ArrayList;
 import java.util.List;

 public class Person {
        private String name;
        private String lastName;
        private int age;
        private String gender;
        private String middleName;
        private Person father;
        private Person mother;
        private Person grandChild;
        private List<Person> siblings = new ArrayList<>();
        private List<Pet> pets = new ArrayList<Pet>();

        private List<Person> parents = new ArrayList<>();
     private List<Person> children = new ArrayList<>();
    private List <Person> grandChildren = new ArrayList<>();
    public Person(String name, String lastName, int Age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;

    }
    public Person(String name, String middleName ,String lastName, int Age, String gender) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    // METHODS


    public void addParents(Person dad, Person mom) {
            this.father = dad;
            dad.addChild(this);
            this.mother = mom;
           mother.addChild(this);
    }

public void addChild(Person baby) {
        if(this.getGender().equals("Male")) {
            baby.father = this;
        } else {
            baby.mother = this;
        }
            this.children.add(baby);
}

public void addSibling(Person sibling) {

        sibling.father = this.father;
        sibling.mother = this.mother;

        siblings.add(sibling);
    }
public void addGrandChilder(Person grandChild) {

            this.grandChild = grandChild;
            if (this.getGender().equals("Male")) {
                grandChild.father = this.father;

            } else {
                grandChild.mother = this.mother;

            }
}
public void addPet(Pet pet) {
        pet.addOwner(this);
        this.pets.add(pet);
}

public void getGrandChildren() {

}
    // SETTERS


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /// GETTERS


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMiddleName() {
        return middleName;
    }


}
