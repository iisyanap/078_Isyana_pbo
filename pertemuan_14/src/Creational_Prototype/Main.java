package Creational_Prototype;

public class Main {
    public static void main(String[] args) {
        // Membuat objek prototype pertama
        ConcretePrototypeA prototypeA1 = new ConcretePrototypeA(10, "Hello");
        ConcretePrototypeA prototypeA2 = (ConcretePrototypeA) prototypeA1.clone(); // Mendapatkan salinan

        // Membuat objek prototype kedua
        ConcretePrototypeB prototypeB1 = new ConcretePrototypeB(true);
        ConcretePrototypeB prototypeB2 = (ConcretePrototypeB) prototypeB1.clone(); // Mendapatkan salinan

        // Menampilkan hasil
        System.out.println("Original A: " + prototypeA1);
        System.out.println("Cloned A: " + prototypeA2);

        System.out.println("Original B: " + prototypeB1);
        System.out.println("Cloned B: " + prototypeB2);
    }
}
