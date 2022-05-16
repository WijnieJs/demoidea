


public class Main {
        public static void main(String[] args) {

            Person dad = new Person("Nowny", "Link", 25, "Male");
            Person baby = new Person("Ayden" , "Link", 1, "Male");
            Person mom = new Person("Mind", "Inha", 23, "Female");
            Person newChild = new Person("From", "AnotherMArriga", 22, "Male");
            baby.addParents(mom , dad);
            dad.addChild(newChild);
            Person grandChild = new Person("Smaller", "Grand", 3, "Male");
            Pet micky = new Pet("Micky", 33, "ValerionCat");
            Person sisterOfBaby = new Person("Jessiva", "Valler", 33, "Female");


            baby.addPet(micky);
            baby.addGrandChilder(grandChild);
             baby.addSibling(sisterOfBaby);


//            System.out.println(baby.getName());

            System.out.println("Here we go");


        }
}
