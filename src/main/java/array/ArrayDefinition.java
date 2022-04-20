package array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        names[0] = "Egor";
        names[1] = "Ivan";
        names[2] = "Maria";
        names[3] = "Julia";
        System.out.println("Список имён: " + names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
    }
}
