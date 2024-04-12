package fr.miage.m1.test_cassandra;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserCassandraRepository extends CrudRepository<User, UUID> {
}
