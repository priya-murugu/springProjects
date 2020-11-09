package com.priya.session1.myfirstspring;

import com.priya.session1.myfirstspring.Model.Car;
import com.priya.session1.myfirstspring.Model.Databases;
import com.priya.session1.myfirstspring.Model.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApplicationTest {
    @Test
    void testObjectCreationAndConstruction()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car1 = (Car)context.getBean("carObj");
        Car car2 =(Car)context.getBean("carObj");
        Person p1 =(Person)context.getBean("Person");
        Assertions.assertThat(car1).isSameAs(car2);
        Assertions.assertThat(car1).isNotNull();
        Assertions.assertThat(car1.getName()).isEqualTo("Honda");
        Assertions.assertThat(p1).isNotNull();
        Assertions.assertThat(p1.getCar()).isNotNull();
        Assertions.assertThat(p1.getCar()).isEqualTo(car1);
    }
    @Test
    void testObjCreationandConstructionsDB()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Databases dbs = (Databases) context.getBean("db");

    }
}
