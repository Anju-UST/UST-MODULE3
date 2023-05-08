package com.processone.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.processone.model.FTTIssueBase;

@Repository
public interface FTTIssueBaseRepository extends JpaRepository<FTTIssueBase,String> {

}