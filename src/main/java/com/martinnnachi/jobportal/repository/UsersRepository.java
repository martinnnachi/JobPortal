package com.martinnnachi.jobportal.repository;

import com.martinnnachi.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
