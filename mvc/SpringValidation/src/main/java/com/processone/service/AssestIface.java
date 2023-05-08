package com.processone.service;

import java.util.Optional;

import com.processone.model.FTTIssueBase;

public interface AssestIface {
	public Optional<FTTIssueBase> findById(String id);

}
