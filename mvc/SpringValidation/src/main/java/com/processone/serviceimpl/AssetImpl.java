package com.processone.serviceimpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.processone.model.FTTIssueBase;
import com.processone.repositories.FTTIssueBaseRepository;


public class AssetImpl {
	@Autowired
	FTTIssueBaseRepository repo;
	

	public Optional<FTTIssueBase>findById(String id) {

		return repo.findById(id);
	}
}
