package Creational_Prototype;

public class ConcretePrototypeB implements Prototype {
    private boolean fieldX;

    public ConcretePrototypeB(boolean fieldX) {
        this.fieldX = fieldX;
    }

    // Getter dan Setter
    public boolean isFieldX() {
        return fieldX;
    }

    public void setFieldX(boolean fieldX) {
        this.fieldX = fieldX;
    }

    // Implementasi metode clone
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this.fieldX);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{fieldX=" + fieldX + "}";
    }
}
