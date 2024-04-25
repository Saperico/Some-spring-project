insert into address (address_line1, address_line2, city, postal_code)
            values ('xx', 'yy', 'city', '62-030');

insert into address (address_line1, address_line2, city, postal_code)
            values
            ('ul. Kolorowa', '12,m. 3', 'Warszawa', '00-001'),
            ('ul. Klonowa' , '12' , 'Wrocław' , '55-253'),
            ('ul. Kolorowa' , '12' , 'Kraków' , '33-333'),
            ('ul. Akacjowa' , '12' , 'Gdańsk' , '44-444'),
            ('ul. Brzozowa' , '12' , 'Poznań' , '66-666'),
            ('ul. Dębowa' , '12' , 'Szczecin' , '77-777'),
            ('ul. Eukaliptusowa' , '12' , 'Lublin' , '88-888'),
            ('ul. Fiołkowa' , '12' , 'Katowice' , '99-999');

insert into PATIENT (first_name, last_name, address_id, date_of_birth, patient_number,telephone_number,weight)
            values
            ('Jan', 'Kowalski', 1, '1990-01-01','1','671983230',80),
            ('Anna', 'Nowak', 2, '1991-02-02','2','12345',65),
            ('Marek', 'Kowalski', 3, '1992-03-03','3','12345',70),
            ('Kasia', 'Nowak', 4, '1993-04-04','4','12345',75);


insert into DOCTOR (first_name, last_name, address_id, doctor_number,telephone_number,specialization)
            values
            ('Jan', 'Kowalski', 5, '1','671983230','GP'),
            ('Anna', 'Nowak', 6 ,'2','12345','SURGEON'),
            ('Marek', 'Zalewski', 7, '3','12345','DERMATOLOGIST'),
            ('Kasia','Baran', 8, '4','999999999','OCULIST');


insert into VISIT (patient_id, doctor_id, time, description)
            values
            (1, 1, '2019-01-01 12:00:00', 'bad tooth'),
            (2, 2, '2019-02-02 12:00:00', 'appendix'),
            (1, 1, '2019-03-03 12:00:00', 'bad tooth'),
            (2, 2, '2019-04-04 12:00:00', 'appendix'),
            (3, 3, '2019-05-05 12:00:00', 'bad tooth'),
            (1, 2, '2019-06-06 12:00:00', 'jaw surgery'),
            (1, 4, '2019-07-07 12:00:00', 'eye checkup'),
            (1, 3, '2019-08-08 12:00:00', 'mole chekup');

INSERT into MEDICAL_TREATMENT(description, type, visit_id)
            values
            ('tooth extraction', 'SURGERY', 1),
            ('appendix removal', 'SURGERY', 2),
            ('tooth extraction', 'SURGERY', 3),
            ('appendix removal', 'SURGERY', 4),
            ('tooth extraction', 'SURGERY', 5),
            ('jaw surgery', 'SURGERY', 6),
            ('eye checkup', 'CHECKUP', 7),
            ('mole checkup', 'CHECKUP', 8);

