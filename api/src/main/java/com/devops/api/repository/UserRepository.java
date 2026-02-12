package com.devops.api.repository;

import com.devops.api.model.UserModel;  // ← Import correto!
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
