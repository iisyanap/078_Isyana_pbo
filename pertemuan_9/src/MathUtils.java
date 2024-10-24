public class MathUtils {

    // Mengembalikan faktorial dari argumen yang diberikan
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Bilangan negatif tidak diperbolehkan untuk faktorial.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Faktorial hanya didefinisikan untuk bilangan <= 16.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
