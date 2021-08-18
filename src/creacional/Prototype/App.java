package creacional.Prototype;

public class App {
    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        System.out.println(sally);
        System.out.println("Sally Hashcode: " + System.identityHashCode(sally));

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        System.out.println(clonedSheep);
        System.out.println("clonedSheep Hashcode: " + System.identityHashCode(clonedSheep));

        Dog Cachuchin = new Dog("Cachuchin");
        System.out.println(Cachuchin);
        System.out.println("Cachuchin Hashcode: " + System.identityHashCode(Cachuchin));
        System.out.println(Cachuchin.ladrar());

        Dog clonedCachuchin = (Dog) animalMaker.getClone(Cachuchin);
        System.out.println(clonedCachuchin);
        System.out.println("clonedCachuchin Hashcode: " + System.identityHashCode(clonedCachuchin));
        System.out.println(clonedCachuchin.morder());

    }
}
