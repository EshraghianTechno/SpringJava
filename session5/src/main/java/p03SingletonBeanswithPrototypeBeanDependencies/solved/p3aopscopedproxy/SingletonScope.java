package p03SingletonBeanswithPrototypeBeanDependencies.solved.p3aopscopedproxy;

public class SingletonScope {
    private PrototypeScope prototypeBean;
    public SingletonScope()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }
    public PrototypeScope getPrototypeBean() {
        return prototypeBean;
    }
    public void setPrototypeBean(PrototypeScope prototypeBean) {
        this.prototypeBean = prototypeBean;
    }
}
