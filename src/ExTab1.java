public class ExTab1 {
    public static void main(String[] args) {
        int[] tab = {10, 33, 56, 89, 7, 11, 2, 16};
        System.out.println("la valeur minimale est : " + min(tab));
        System.out.println("la valeur maximale est : " + max(tab));
        System.out.println("la valeur moyenne est : " + moyenne(tab));
    }

    public static int min(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int max(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static double moyenne(int[] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        double result = sum / tab.length;
        return (double) Math.round(result * 100) / 100;
    }
}