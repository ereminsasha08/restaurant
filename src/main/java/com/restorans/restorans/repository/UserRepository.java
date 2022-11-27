package com.restorans.restorans.repository;

import com.restorans.restorans.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLoginIgnoreCase(String login);

}
