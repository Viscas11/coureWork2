// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] massive = {1, 2, 3};

        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
