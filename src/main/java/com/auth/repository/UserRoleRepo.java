package com.auth.repository;

import com.auth.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepo extends JpaRepository<AppRole, Long> {
}
