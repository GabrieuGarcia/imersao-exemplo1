import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ExercicioCollections {

    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();

        arrayList();
//        hashSet();
        Long fim = System.currentTimeMillis();

        System.out.println(fim-inicio);
    }

    private static void arrayList() {
        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i < 10000; i ++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }

        Iterator<Integer> itr = integerList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private static void hashSet() {
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }

        Iterator<Integer> itr = integerHashSet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
