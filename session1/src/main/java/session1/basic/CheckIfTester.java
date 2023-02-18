package session1.basic;

public class CheckIfTester implements CheckProgrammer{
    @Override
    public Boolean checkFeatures(ProgrammerRecord programmer) {
        return programmer.canTest();
    }
}
