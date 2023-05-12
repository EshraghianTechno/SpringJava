package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p02;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("file:F:\\SpringJava\\session9\\src\\main\\java\\DeclarativeApproachConfiguringAOP\\p02UsingAOPNamespace\\p02\\config.xml");
        context.refresh();
        final EmployeeService employeeService = context.getBean(EmployeeService.class);

    /*    String employeeById = employeeService.findEmployeeById(1);
        System.out.println(employeeById);*/

//        employeeService.createEmployee2(new Employee("neda"));

//        employeeService.findEmployeeById(1);

      /*  String employeeById = bean.findEmployeeById(1);
        System.out.println(employeeById);*/


           employeeService.createEmployee(new Employee("neda"));


     /*   final String employee = bean.findEmployee1(10);
        System.out.println(employee);*/


        //  bean.deleteEmployee();

        //   bean.findAllEmployees();

        // bean.errorrrrrr();

    }
}
