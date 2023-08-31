package com.fmc.oasisinfobytetask4.repository;

import com.fmc.oasisinfobytetask4.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsUserByEmailContainingIgnoreCase(String email);
    boolean existsUserByPassword(String password);
}
