package com.lhs.SpringJdbc;

import com.lhs.SpringJdbc.model.Alien;
import com.lhs.SpringJdbc.repo.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Alien alien = context.getBean(Alien.class);
        alien.setId(10);
        alien.setName("Adi");
        alien.setTech("Java");

        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(alien);

        System.out.println(repo.findAll());
    }

}
