package Task3_Case2_Solusi1;

public class ManagerTest {
    public static void main (String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);  // Objek Manager
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        Sortable.shell_sort(staff);  // Mengurutkan array berdasarkan salary

        for (int i = 0; i < staff.length; i++) {
            staff[i].print();  // Cetak hasil setelah pengurutan
        }
    }
}

