package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long>{

        List<VisitEntity> findVisitsByPatientId(Long id);



}
