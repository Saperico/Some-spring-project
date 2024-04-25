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
        return patient.getVisits();
    }

    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        List<PatientEntity> patients = entityManager.createQuery("SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class)
                .setParameter("lastName", lastName)
                .getResultList();
        return patients;
    }

    @Override
    public List<PatientEntity> findPatientsWhichHadMoreVisitsThan(int visits) {
        List<PatientEntity> patients = entityManager.createQuery("SELECT p FROM PatientEntity p WHERE SIZE(p.visits) > :visits", PatientEntity.class)
                .setParameter("visits", visits)
                .getResultList();
        return patients;
    }

    @Override
    public List<PatientEntity> findPatientsWithWeightBetween(double min, double max) {
        List<PatientEntity> patients = entityManager.createQuery("SELECT p FROM PatientEntity p WHERE p.weight BETWEEN :min AND :max", PatientEntity.class)
                .setParameter("min", min)
                .setParameter("max", max)
                .getResultList();
        return patients;
    }
}
