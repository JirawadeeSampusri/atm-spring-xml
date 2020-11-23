package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        ATM atm = context.getBean(ATM.class);
        String name = atm.validateCustomer(2, 2345);
        atm.deposit(200);
        System.out.println(name + "has" + atm.getBalance());

    }
}