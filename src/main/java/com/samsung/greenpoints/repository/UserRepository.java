package com.samsung.greenpoints.repository;

import com.samsung.greenpoints.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(long id);
    User findUserByIdAndName(long id, String name);
    User findUserByIdAndEmail(long id, String email);
    User findUserByEmail(String email);
}
