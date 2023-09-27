import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.ezrealc.entity.SingletonExample;

import java.util.Arrays;

public class TestXMLConfig {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        System.out.println(applicationContext.getBean("user"));

    }
}
