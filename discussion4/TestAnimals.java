public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 6);
        Dog d = new Dog("Fido", 4);

        a.greet();          // (A) "Animal Pluto says: Huh?
        c.greet();          // (B) Cat Garfield says: Meow!______________________
        // c = Cat@54387593
        d.greet();          // (C) Dog Fido says: WOOF!

        a = c;
        // a = Cat@54387593
        ((Cat) a).greet();  // (D) Cat Garfield says: Meow!
        // a's static type: Animal
        // a's dynamic type: Cat
        a.greet();          // (E) Cat Garfield says: Meow!

        a = new Dog("Hieronymus", 10);
        d = (Dog) a;

        a = new Dog("Spot", 10);
        d = a;
    }
}