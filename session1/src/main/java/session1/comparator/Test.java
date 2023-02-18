package session1.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Human[] humanArray = new Human[3];
        humanArray[0] = new Human(10, "ali");
        humanArray[1] = new Human(1, "ali");
        humanArray[2] = new Human(8, "ali");

//        first way
//        Arrays.sort(humanArray, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        second way
//        Arrays.sort(humanArray, (Human o1, Human o2) -> o1.getAge() - o2.getAge());
//        Arrays.stream(humanArray).forEach(x -> System.out.println(x));


//        third array
        Arrays.sort(humanArray, Comparator.comparingInt(Human::getAge));
        Arrays.stream(humanArray).forEach(x -> System.out.println(x));
    }
}
