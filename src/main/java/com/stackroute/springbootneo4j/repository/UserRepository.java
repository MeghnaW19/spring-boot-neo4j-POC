package com.stackroute.springbootneo4j.repository;

import com.stackroute.springbootneo4j.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User)-[r:LIKES]->(m:Movie) return u,r,m")
    Collection<User> getAllUsers();

}
