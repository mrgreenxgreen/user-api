package com.example.rest3.repositories;

import com.example.rest3.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rest3Repository extends JpaRepository<Users, Long> {
}
