import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import tech.ezrealc.config.SpringConfig;

import java.util.Arrays;

public class TestAnnotationConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

        System.out.println(applicationContext.getBean("singletonExample"));
        System.out.println(applicationContext.getBean("prototypeExample"));

        AbstractApplicationContext aac = (AbstractApplicationContext) applicationContext;
        aac.registerShutdownHook();
    }
}
