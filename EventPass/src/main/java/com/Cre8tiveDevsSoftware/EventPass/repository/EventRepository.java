package com.Cre8tiveDevsSoftware.EventPass.repository;

import com.Cre8tiveDevsSoftware.EventPass.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer> {
}
