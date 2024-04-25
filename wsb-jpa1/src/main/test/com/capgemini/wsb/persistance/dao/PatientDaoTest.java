package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Test
    public void testFindPatientsByLastName() {
        // given
        assertThat(patientDao.findOne(1L).getLastName().equals("Kowalski"));
        assertThat(patientDao.findOne(3L).getLastName().equals("Kowalski"));
        // when
        // then
        assertThat(patientDao.findByLastName("Kowalski")).isNotNull();
        assertThat(patientDao.findByLastName("Kowalski").size()).isEqualTo(2);
    }

    @Test
    public void testFindPatientsWhichHadMoreVisitsThan() {
        // given
        // when
        // then
        assertThat(patientDao.findPatientsWhichHadMoreVisitsThan(1)).isNotNull();
        assertThat(patientDao.findPatientsWhichHadMoreVisitsThan(1).size()).isEqualTo(2);
    }

    @Test
    public void testFindPatientsWithWeightBetween() {
        // given
        // when
        // then
        assertThat(patientDao.findPatientsWithWeightBetween(70.0, 80.0)).isNotNull();
        assertThat(patientDao.findPatientsWithWeightBetween(70.0, 80.0).size()).isEqualTo(3);
    }
}
