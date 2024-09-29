package Task3_Case2_Solusi2;

public interface Sortable {
    int compare(Sortable b);  // Metode untuk membandingkan dua objek

    // Metode statis untuk mengurutkan array dari objek Sortable
    static void shell_sort(Sortable[] a) {
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}

