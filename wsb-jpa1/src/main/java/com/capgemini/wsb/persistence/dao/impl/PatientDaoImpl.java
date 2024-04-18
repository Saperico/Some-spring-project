package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity,Long> implements PatientDao {

    @Override
    public List<VisitEntity> findVisitsByPatientId(Long id) {
        PatientEntity patient = findOne(id);
        PatientTO patientTO = PatientMapper.mapToTO(patient);
        return patientTO.getVisits();
    }
}
