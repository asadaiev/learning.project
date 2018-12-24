import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEachSecond {

    static ArrayList<Integer> list = new ArrayList();


    public static void main(String[] arg) {

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        removeSecondElement();
        System.out.println("Final list =" + list.toString());

    }


    public static void removeSecondElement() {

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() != (list.get(list.size() - 1))) {
                iterator.next();
                iterator.remove();
            }
        }
    }

}


