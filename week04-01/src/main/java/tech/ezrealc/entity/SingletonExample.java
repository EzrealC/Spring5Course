package tech.ezrealc.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component("singletonExample")
@Scope("singleton")
public class SingletonExample {

    @Value("singletonExample")
    private String name;

    @Value("this is a singleton example")
    private String content;

    @PostConstruct
    public void init(){
        System.out.println("singleton object created...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("singleton object destroyed...");
    }
}
