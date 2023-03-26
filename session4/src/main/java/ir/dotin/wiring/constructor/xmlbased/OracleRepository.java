package ir.dotin.wiring.constructor.xmlbased;


public class OracleRepository implements Repository {
    public OracleRepository() {
        System.out.println("Oracle repository is created!");
    }

    @Override
    public void create() {
        System.out.println("Oracle");
    }
}
