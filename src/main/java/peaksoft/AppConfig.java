package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import peaksoft.model.Cat;

@Configuration
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getBeanCat(){
        Cat cat = new Cat();
        cat.setCatSoung("Mya-mya-mya");
        return cat;
    }
}
