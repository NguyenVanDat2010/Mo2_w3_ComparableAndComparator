import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Sắp xếp danh sách Java với một đối tượng tùy chỉnh--------------------------------------------------------
//        List<Simpson> simpsonList = new ArrayList<>();
//        simpsonList.add(new Simpson("Homer "));
//        simpsonList.add(new Simpson("Marge "));
//        simpsonList.add(new Simpson("Bart "));
//        simpsonList.add(new Simpson("Lisa "));
//
//        //Collections.sort(list) để sắp xếp các phần tử String của list theo thứ tự tăng dần.
//        Collections.sort(simpsonList);
//        /*stream().map chuyển các phần tử trong collection từ loại object này sang 1 loại object khác.
//        Nói cách khác, đối với từng phần tử trong collection bạn sẽ tạo một đối tượng mới dựa trên đó.
//         */
//        simpsonList.stream().map(s -> s.name).forEach(System.out::print);
//
//        System.out.println("\n");
//
//        //Collections.reverse(List) đảo ngược một Collection trong Java
//        Collections.reverse(simpsonList);
//        simpsonList.stream().forEach(System.out::println);

        //Sắp xếp đối với mảng trong java-------------------------------------------------------------------
//        int[]moesPints = new int[] {9, 8, 7, 6, 1};
//
//        Arrays.sort(moesPints);
//        Arrays.stream(moesPints).forEach(System.out::print);
//
//        System.out.println("\n");
//
//        Simpson[]simpsons=new Simpson[]{new Simpson("Lisa"),new Simpson("Homer"),new Simpson("Marge")};
//        Arrays.sort(simpsons);
//        Arrays.stream(simpsons).forEach(System.out::println);

        //Sắp xếp một Map với TreeMap-------------------------------------------------------------------------
        Map<Simpson, String> simpsonsCharacters = new TreeMap<>();
        simpsonsCharacters.put(new Simpson("Moe"), "shotgun");
        simpsonsCharacters.put(new Simpson("Lenny"), "Carl");
        simpsonsCharacters.put(new Simpson("Homer"), "television");
        simpsonsCharacters.put(new Simpson("Barney"), "beer");

        System.out.println(simpsonsCharacters);
    }
}
