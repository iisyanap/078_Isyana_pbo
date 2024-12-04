package Creational_Prototype;

public class ConcretePrototypeA implements Prototype {
    private int field1;
    private String field2;

    public ConcretePrototypeA(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    // Getter dan Setter
    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    // Implementasi metode clone
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this.field1, this.field2);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{field1=" + field1 + ", field2='" + field2 + "'}";
    }
}
