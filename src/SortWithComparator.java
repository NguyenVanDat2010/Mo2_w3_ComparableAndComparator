import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithComparator {
    public static void main(String[] args) {
        //Sắp xếp với Comparator
        List<Simpson> characters = new ArrayList<>();

        //Cach 1: nhieu code dai dong
//        Simpson homer = new Simpson("Homer") {
//            @Override
//            public int compareTo(Simpson simpson) {
//                return this.name.length() - (simpson.name.length());
//            }
//        };
//
//        Simpson moe = new Simpson("Moe") {
//            @Override
//            public int compareTo(Simpson simpson) {
//                return this.name.length() - (simpson.name.length());
//            }
//        };
//        Collections.sort(characters);

//        System.out.println(characters);

        //Cach 2:
        Simpson homer = new Simpson("Homer");
        Simpson moe = new Simpson("Moe");

        characters.add(homer);
        characters.add(moe);

        Collections.sort(characters,(Comparator.<Simpson>
                comparingInt(character1->character1.name.length())
                .thenComparingInt(character2->character2.name.length())));

        System.out.println(characters);
    }
}
