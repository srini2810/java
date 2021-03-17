package com.cvs.cdc.repo;

import com.cvs.cdc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}