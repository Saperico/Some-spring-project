package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	//jednokierunkowa relacja z DoctorEntity od strony dziecka VisitEntity
	@ManyToOne(fetch = FetchType.LAZY)
	private DoctorEntity doctor;
	@Transient
	private String doctorName;

	//relacja dwukierunkowa z PatientEntity
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
