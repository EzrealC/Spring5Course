package tech.ezrealc.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
@Scope("prototype")
public class PrototypeExample {

    @Value("PrototypeExample")
    private String name;

    @Value("this is a prototype example")
    private String content;

    @PostConstruct
    public void init(){
        System.out.println("prototype object created...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("prototype object destroyed...");
    }
}
