package com.ldm.exam1.user.dao;

import com.ldm.exam1.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
