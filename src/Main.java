import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Simpson> simpsonList = new ArrayList<>();
        simpsonList.add(new Simpson("Homer"));
        simpsonList.add(new Simpson("Marge"));
        simpsonList.add(new Simpson("Bart"));
        simpsonList.add(new Simpson("Lisa"));

        //Collections.sort(list) để sắp xếp các phần tử String của list theo thứ tự tăng dần.
        Collections.sort(simpsonList);
        /*stream().map chuyển các phần tử trong collection từ loại object này sang 1 loại object khác.
        Nói cách khác, đối với từng phần tử trong collection bạn sẽ tạo một đối tượng mới dựa trên đó.
         */
        simpsonList.stream().map(s -> s.name).forEach(System.out::print);

        System.out.println("\n");

        //Collections.reverse(List) đảo ngược một Collection trong Java
        Collections.reverse(simpsonList);
        simpsonList.stream().forEach(System.out::print);
    }
}
