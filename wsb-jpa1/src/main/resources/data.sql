insert into address (address_line1, address_line2, city, postal_code)
            values ('xx', 'yy', 'city', '62-030');

insert into address (address_line1, address_line2, city, postal_code)
            values
            ('ul. Kolorowa', '12,m. 3', 'Warszawa', '00-001'),
            ('ul. Klonowa' , '12' , 'Wrocław' , '55-253'),
            ('ul. Kolorowa' , '12' , 'Kraków' , '33-333'),
            ('ul. Akacjowa' , '12' , 'Gdańsk' , '44-444'),
            ('ul. Brzozowa' , '12' , 'Poznań' , '66-666');

insert into PATIENT (first_name, last_name, address_id, date_of_birth, patient_number,telephone_number,weight)
            values
            ('Jan', 'Kowalski', 1, '1990-01-01','1','671983230',80),
            ('Anna', 'Nowak', 2, '1991-02-02','2','12345',65),
            ('Marek', 'Kowalski', 3, '1992-03-03','3','12345',70),
            ('Kasia', 'Nowak', 4, '1993-04-04','4','12345',75);


insert into DOCTOR (first_name, last_name, address_id, doctor_number,telephone_number,specialization)
            values
            ('Jan', 'Kowalski', 3, '1','671983230','GP'),
            ('Anna', 'Nowak', 4 ,'2','12345','SURGEON');


insert into VISIT (patient_id, doctor_id, time, description)
            values
            (1, 1, '2019-01-01 12:00:00', 'bad tooth'),
            (2, 2, '2019-02-02 12:00:00', 'appendix');

INSERT into MEDICAL_TREATMENT(description, type, visit_id)
            values
            ('tooth extraction', 'SURGERY', 1),
            ('appendix removal', 'SURGERY', 2);


