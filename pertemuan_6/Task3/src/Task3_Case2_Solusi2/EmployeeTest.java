package Task3_Case2_Solusi2;

public class EmployeeTest {
    public static void main(String[] args) {
        Sortable[] staff = new Sortable[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menggunakan shell_sort dari interface Sortable
        Sortable.shell_sort(staff);

        // Cetak hasil pengurutan
        for (Sortable e : staff) {
            ((Employee) e).print();  // Casting untuk memanggil metode print
        }
    }
}
