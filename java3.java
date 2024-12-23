import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringStorage {
    private ArrayList<String> strings;

    public StringStorage() {
        strings = new ArrayList<>();
    }

    public void addString(String str) {
        strings.add(str);
        strings.sort(Comparator.comparingInt(String::length));
    }

    public String getMaxString() {
        if (strings.isEmpty()) {
            return null;
        }
        return Collections.max(strings, Comparator.comparingInt(String::length));
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0;
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }


    public void printStrings() {
        System.out.println(strings);
    }

    public static void main(String[] args) {
        StringStorage storage = new StringStorage();

        storage.addString("Java");
        storage.addString("Programming");
        storage.addString("is");
        storage.addString("fun");

        System.out.println("Строки в порядке возрастания длины: ");
        storage.printStrings();

        System.out.println("Самая длинная строка: " + storage.getMaxString());
        System.out.println("Средняя длина строк: " + storage.getAverageLength());
    }
}
