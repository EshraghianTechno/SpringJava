package ir.dotin.wiring.setterbased.xmlbased;

public class SQLRepository implements Repository {
    public SQLRepository() {
        System.out.println("sql repository is created!");
    }

    @Override
    public void create() {
        System.out.println("SQL");
    }
}
