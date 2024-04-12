package fr.miage.m1.test_cassandra;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.core.CassandraOperations;

import java.util.UUID;

@SpringBootApplication
public class TestCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCassandraApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CassandraOperations cassandraTemplate, UserCassandraRepository userCassandraRepository) {
        return args -> {
            User userInstance = new User();
            userInstance.setId(UUID.randomUUID());
            userInstance.setName("John Doe");
            userCassandraRepository.save(userInstance);
//            cassandraTemplate.insert(userInstance);
        };
    }
}
