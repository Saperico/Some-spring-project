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
    public void testDeletePatient() {
        // given
        assertThat(patientService.findById(1L)).isNotNull();
        assertThat(visitsRepository.findOne(1L)).isNotNull();
        assertThat(doctorRepository.findOne(1L)).isNotNull();
        // when
        patientService.deletePatient(1L);
        // then
        assertThat(patientService.findById(1L)).isNull();
        assertThat(visitsRepository.findOne(1L)).isNull();
        assertThat(doctorRepository.findOne(1L)).isNotNull();
    }

    @Transactional
    @Test
    //test for finding patients by last name
    public void testFindByLastName() {
        // given
        assertThat(patientService.findById(1L).getLastName()).isEqualTo("Kowalski");
        assertThat(patientService.findById(3L).getLastName()).isEqualTo("Kowalski");
        // when
        // then
        assertThat(patientService.findByLastName("Kowalski")).isNotNull();
        assertThat(patientService.findByLastName("Kowalski").size()).isEqualTo(2);
    }
}
