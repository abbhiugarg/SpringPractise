package com.learningProject.forlearning.Dao;

import com.learningProject.forlearning.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    public List<User> findByName(String name);

    @Query("select u from User u where u.name = :n AND u.city = :c")
    public List<User> getByNameAndCity(@Param("n") String name,@Param("c") String city);
}
