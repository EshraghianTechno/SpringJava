package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p02.p07Around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        final EmployeeService bean = context.getBean(EmployeeService.class);
        //   bean.setEmployee(new Employee("hasan"));
        // bean.addEmployee();
        final String s = bean.addEmployee();
        System.out.println("in main : " + s);
    }
}
