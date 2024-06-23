package com.byt3social.logging.repositories;

import com.byt3social.logging.models.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Integer> {
}
