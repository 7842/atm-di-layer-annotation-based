//package atm;
//
//public class Main {
//    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();
//    }
//}

//package atm;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
////        ApplicationContext app = new AnnotationConfigApplicationContext(ATMConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        AtmUI atmUI = app.getBean(AtmUI.class);
//        atmUI.run();
//    }
//}

package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
