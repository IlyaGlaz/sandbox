import java.util.List;

public class BinarySearch {

    static List<String> list = List.of("Брат",
            "Отец",
            "Сестра",
            "Мать",
            "Жучка",
            "Внучка",
            "Репка");

    public static void main(String[] args) {
        int search = binarySearch("Мать", 0, list.size() - 1);
        System.out.println(search);
    }

    private static int binarySearch(String query, int from, int to) {
        int middle = (from + to) / 2;
        int comparison = query.compareTo(list.get(middle));
        if (comparison == 0) {
            return middle;
        }
        if (comparison > 0) {
            return binarySearch(query, middle, to);
        }
        if (comparison < 0) {
            return binarySearch(query, from, middle);
        }
        return 0;
    }
}
