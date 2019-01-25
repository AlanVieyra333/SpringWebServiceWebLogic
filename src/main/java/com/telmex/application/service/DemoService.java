package com.telmex.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telmex.application.entity.Actor;
import com.telmex.application.repository.DemoRepository;

@Service
public class DemoService {
	@Autowired
	private DemoRepository demoRepository;

	public Actor getServicio(Long id) {
		return this.demoRepository.getActorByFolioActor(id);
	}
}
