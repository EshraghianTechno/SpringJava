package session1.basic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<ProgrammerRecord> programmerList = new ArrayList<>();
//        Programmer programmer = new Programmer("Ali", Boolean.FALSE, Boolean.TRUE);
//        Programmer programmer1 = new Programmer("Elham", Boolean.TRUE, Boolean.FALSE);
//        Programmer programmer2 = new Programmer("Iman", Boolean.FALSE, Boolean.FALSE);
//        programmerList.add(programmer);
//        programmerList.add(programmer1);
//        programmerList.add(programmer2);

        programmerList.add(new ProgrammerRecord("Ali", Boolean.FALSE, Boolean.TRUE));
        programmerList.add(new ProgrammerRecord("Elham", Boolean.TRUE, Boolean.FALSE));
        programmerList.add(new ProgrammerRecord("Iman", Boolean.FALSE, Boolean.FALSE));

//        =============== first way
//        show(programmerList, new CheckIfDocer());

//        =============== second way
//        show(programmerList, new CheckProgrammer() {
//            @Override
//            public Boolean checkFeatures(ProgrammerRecord programmer) {
//                return programmer.canDoc();
//            }
//        });

//      =============== third way
        show(programmerList, (ProgrammerRecord programmer) -> !programmer.canDoc());
    }

    public static void show(List<ProgrammerRecord> programmerList, CheckProgrammer checkProgrammer) {
        for (ProgrammerRecord programmerRecord : programmerList) {
            if (checkProgrammer.checkFeatures(programmerRecord)) {
                System.out.println(programmerRecord);
            }
        }
    }
}
