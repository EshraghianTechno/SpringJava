package p07mixconfig.p02class;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(10);
        list.add(7);
        list.add(2);

    }

    public static Integer findNextRightChoice(List list, int i) {
        Integer rightChoice = i + 1;
        return (Integer) list.get(rightChoice);
    }

    public static Integer findNextLeftChoice(List list, int j) {
        Integer leftChoice = j - 1;
        return (Integer) list.get(leftChoice);
    }
}
