package session1.basic;

public class CheckIfDocer implements CheckProgrammer {
    @Override
    public Boolean checkFeatures(ProgrammerRecord programmer) {
        return programmer.canDoc();
    }
}
