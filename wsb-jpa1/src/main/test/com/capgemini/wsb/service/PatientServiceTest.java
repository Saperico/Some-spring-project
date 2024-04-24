package com.capgemini.wsb.service;

import com.capgemini.wsb.persistence.dao.DoctorDao;
import com.capgemini.wsb.persistence.dao.VisitsDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private VisitsDao visitsRepository;

    @Autowired
    private DoctorDao doctorRepository;

    @Transactional
    @Test
    //test for deletion of patient
    public void testShouldDeletePatient() {
        // given
        // patient with id 1 has visit 1 that is also assigned to doctor 1
        // when
        patientService.deletePatient(1L);
        // then
        assertThat(patientService.findById(1L)).isNull();

        //check whether visits are deleted
        assertThat(visitsRepository.findOne(1L)).isNull();

        //check whether doctor was not deleted
        assertThat(doctorRepository.findOne(1L)).isNotNull();
    }
}
