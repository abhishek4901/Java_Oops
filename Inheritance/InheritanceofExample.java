
class Animal {

    void eat() {
        System.err.println("Animal eats");
    }
}
class Dog extends Animal {

    void bark() {
        System.err.println("Dog barks (this single inheritances)");
        
    }
}
class puppy extends Dog{
    void  small (){
        super.eat();//when call small method then automatically call super (parents class)
        System.err.println(" Puppies are small( this multilevel inheritances)");

    }
}
class Cat extends Animal{
    void mews(){
        System.err.println("Cat mews (this is hirarchiacal inheritance)");

    }
}
public class InheritanceofExample {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        puppy p1 = new puppy();
        p1.small();
        Cat c1 = new Cat();
        c1.mews();

    }
}
