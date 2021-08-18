package creacional.Prototype;

public class Dog implements Animal {

    String name;

    public Dog(String name) {
        System.out.println("Dog is made.");
        this.name = name;
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Dog is being made");
        Dog dogObject = null;
        try {
            dogObject = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dogObject;
    }

    public String ladrar() {
        return "Guauuu guauuu";
    }

    public String morder() {
        return "grrrrrrr!!!!";
    }

    public String dormir() {
        return "Zzzz!!!";
    }

    public String toString() {
        return "I'm a super dog, my name is " + name;
    }

}
