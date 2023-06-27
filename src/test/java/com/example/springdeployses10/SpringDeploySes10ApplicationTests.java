package com.example.springdeployses10;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeploySes10ApplicationTests {
    //Esto sirve para ver las variables de entorno disponibles
    @Test
    void contextLoads() {
        System.getenv().forEach((key,value)->System.out.println(key+""+value));
    }

}
