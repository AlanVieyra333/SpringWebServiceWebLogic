package com.telmex.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telmex.application.entity.Actor;

@Repository
public interface DemoRepository extends JpaRepository<Actor, Long> {
	public Actor getActorByFolioActor(Long folioActor);
}
