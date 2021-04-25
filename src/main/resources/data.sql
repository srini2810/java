/*
create table if not exists  employees
(
    employee_id integer not null,
    age         integer not null,
    email       varchar(255),
    first_name  varchar(255),
    last_name   varchar(255),
    primary key (employee_id)

);

insert into employees(employee_id, age,email,first_name,last_name) values (1,1,'1@gmail.com','1f',NULL);
insert into employees(employee_id, age,email,first_name,last_name) values (2,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (3,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (4,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (5,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (6,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (7,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (8,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (9,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (10,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (11,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (12,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (13,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (14,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (15,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (16,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (17,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (18,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (19,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (20,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (21,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (22,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (23,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (24,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (25,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (26,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (27,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (28,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (29,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (30,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (31,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (32,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (33,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (34,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (35,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (36,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (37,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (38,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (39,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (40,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (41,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (42,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (43,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (44,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (45,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (46,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (47,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (48,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (49,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (50,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (51,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (52,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (53,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (54,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (55,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (56,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (57,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (58,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (59,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (60,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (61,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (62,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (63,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (64,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (65,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (66,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (67,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (68,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (69,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (70,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (71,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (72,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (73,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (74,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (75,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (76,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (77,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (78,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (79,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (80,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (81,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (82,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (83,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (84,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (85,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (86,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (87,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (88,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (1023,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (1024,1,'1@gmail.com','1f','1l');*/
/*create table if not exists  immunization_info
(
    vax_event_id varchar2 not null,
    ext_type     varchar(255),
    pprl_id       varchar(255),
    recip_id  varchar(255),
    recip_first_name   varchar(255),
    recip_middle_name     varchar(255),
    recip_last_name       varchar(255),
    recip_dob  varchar(255),
    recip_sex   varchar(255),
    recip_address_street     varchar(255),
    recip_address_street_2       varchar(255),
    recip_address_city  varchar(255),
    recip_address_county   varchar(255),
    recip_address_state     varchar(255),
    recip_address_zip       varchar(255),
    primary key (vax_event_id)
);*/


/*
insert into immunization_info
values('00685560010025601','I','','6808418','NFUJLE','','WALKER','10011','M','2 CVS DRIVE',' WHITE SULPHUR',' SPRING','','NJ','12787');
insert into immunization_info
values('00685590010632203','I','','4225902','OMNZZA','','MORANO','31985','M','98-810',' AUMAKIKI ST',' AIEA ','','HI','967');*/
/*insert into immunization_info
values('00175240888963108','I','','5637','SDFFNC','','RICHARDSON','24669','F','230 SUITE','30 CROSSING DR','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00175240888963129','I','','5637','SDFFNC','','RICHARDSON','24669','F','230 SUITE','30 CROSSING DR','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00686080010039902','I','','5637','SDFFNC','','RICHARDSON','24669','F','OFATRAVE','LINGSHOW STREET','BOSTON','','MA','2222');
insert into immunization_info
values('00175240888963118','I','','9023','WTLTDK','','GENERY','24151','F','ONE RD','45 ST','MARYKNOLL','','NJ','10545');
insert into immunization_info
values('00685560010025602','I','','1244179992','TYPDQX','','RICHARD','30792','F','12313',' JK RD',' NEW YORK','','NJ','10013');
insert into immunization_info
values('00175240888963127','I','','3460001','DSLVDH','','FOLKS','25489','F','123','','SCHENECTADY','','NY','12345');
insert into immunization_info
values('00175240888963106','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00685590010632202','I','','4972980536','TXDCUI','','DEEL','25953','M','OFATRAVE','LINGSHOW STREET','BOSTON ','','MA','2222');
insert into immunization_info
values('00686080010040602','I','','1251779454','KKSGEW','D','JOHNSON','26081','M','101','87 RD',' CUMBERLAND ','','RI','2864');
insert into immunization_info
values('00686080010041203','I','','3730551844','ADKKWU','','KNOETGEN','35944','M','123',' SCHENECTADY ','PEARL CITY','','NY','12345');
insert into immunization_info
values('00175240888963102','I','','7739514','ETUXTW','','ROY','29466','F','12313','','NEW YORK','','NY','10013');
insert into immunization_info
values('00175240888963114','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00175240888963116','I','','1245931496','SYPSZF','','SHETLER','22428','M','33 PARK ','STREET','CRANSTON ','','RI','2910');
insert into immunization_info
values('00175240888963115','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00686080010040601','I','','10137320','IAJSSA','','VASSELL','12926','F','ONE',' ST',' SHREWSBURY','','MA','1545');
insert into immunization_info
values('00175240888963120','I','','5637','SDFFNC','','RICHARDSON','24669','F','230 SUITE','30 CROSSING DR','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00175240888963107','I','','2612166','DLHFUI','','MURPHY','38756','F','101','','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00175240888963130','I','','5637','SDFFNC','','RICHARDSON','24669','F','230 SUITE','30 CROSSING DR','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00175240888963128','I','','6345','CKMXVJ','','TODD','24645','M','2441 E Broad Street','18470','Statesville','','NC','28625');
insert into immunization_info
values('00686080010041202','I','','3730551844','ADKKWU','','KNOETGEN','35944','M','123',' SCHENECTADY ','PEARL CITY','','NY','12345');
insert into immunization_info
values('00175240888963123','I','','9023','WTLTDK','','GENERY','24151','F','ONE RD','45 ST','MARYKNOLL','','NJ','10545');
insert into immunization_info
values('00175240888963113','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00175240888963117','I','','1245931496','SYPSZF','','SHETLER','22428','M','33 PARK ','STREET','CRANSTON ','','RI','2910');
insert into immunization_info
values('00175240888963101','I','','10278840','OAJMNZ','','MCMAHON','18770','M','20 MAIN ST','','BOSTON','','MA','2222');
insert into immunization_info
values('00685560010025600','I','','1248391008','YYGEBA','','PINEDA','12233','F','THE 5 RD','65 LANE','JERSEY CITY','','NJ','7306');
insert into immunization_info
values('00175240888963121','I','','1245884207','SYHDLV','','STRINGFIELD','23177','F','ONE ST','','MARYKNOLL','','NY','10545');
insert into immunization_info
values('00175240888963105','I','','10238464','SNXVUO','','DECUBAS','22166','M','100','','BELLINGHAM','','MA','2019');
insert into immunization_info
values('00175240888963119','I','','5637','SDFFNC','','RICHARDSON','24669','F','230 SUITE','30 CROSSING DR','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00175240888963104','I','','1253465908','GDAFFN','','MISONO','15478','F','45 DR','SIX ST','SHREWSBURY ','','MA','1545');
insert into immunization_info
values('00686080010039901','I','','1244226873','BSLMRQ','','BURGESS','24958','F','2','CVS DRIVE','WHITE SULPHUR SPRING','','NJ','12787');
insert into immunization_info
values('00686080010039903','I','','5637','SDFFNC','','RICHARDSON','24669','F','OFATRAVE','LINGSHOW STREET','BOSTON','','MA','2222');
insert into immunization_info
values('00175240888963133','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00175240888963103','I','','1253465908','GDAFFN','','MISONO','15478','F','45 DR','SIX ST','SHREWSBURY ','','MA','1545');
insert into immunization_info
values('00175240888963110','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00175240888963109','I','','6345','CKMXVJ','','TODD','24645','M','2 CVS DRIVE','','WHITE SULPHUR SPRING','','NY','12787');
insert into immunization_info
values('00175240888963122','I','','9023','WTLTDK','','GENERY','24151','F','ONE RD','45 ST','MARYKNOLL','','NJ','10545');
insert into immunization_info
values('00175240888963131','I','','9023','WTLTDK','','GENERY','24151','F','ONE RD','45 ST','MARYKNOLL','','NJ','10545');
insert into immunization_info
values('00685590010632201','I','','6345','CKMXVJ','','TODD','24645','M','LOUY RD','8 STREET','BOSTON','','MA','2222');
insert into immunization_info
values('00686080010039900','I','','1248392415','GDCOMJ','','KAMDAR','19535','F','101 TH','43 RD','CUMBERLAND','','RI','2864');
insert into immunization_info
values('00686080010041201','I','','3728828909','UEEVBO','','GABRIELLI','34570','F','1629 GH ',' KALAUIPO ST','PEARL CITY','','HI','96782');
insert into immunization_info
values('00685560010025603','I','','6808418','NFUJLE','','WALKER','10011','M','2 CVS DRIVE',' WHITE SULPHUR',' SPRING','','NJ','12787');
insert into immunization_info
values('00175240888963111','I','','4974695885','DHVNDD','','BENNETT','20959','M','THE LANE','','JERSEY CITY','','NJ','7306');
insert into immunization_info
values('00686080010041200','I','','5637','SDFFNC','','RICHARDSON','24669','F','98-810',' AUMAKIKI ST',' AIEA','','HI','967');
insert into immunization_info
values('00685590010632200','I','','4225902','OMNZZA','','MORANO','31985','M','98-810',' AUMAKIKI ST',' AIEA ','','HI','967');*/

/*create table if not exists  cdc_resp_info
(
    cdc_id int NOT NULL auto_increment,
    status varchar2,
    create_at varchar2,
    updated_at varchar2,
    validation_errors varchar2,
    processing_errors varchar2,
    created_by varchar2,
    updated_by varchar2,
    cdc_vax_event_id varchar2,
    status_message varchar2,
    PRIMARY KEY (cdc_id),
    CONSTRAINT FK_PLANETICKET_TOURIST foreign key (cdc_vax_event_id) references immunization_info(vax_event_id)

);*/

/*insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685560010025601');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685590010632203');*/
/*insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963108');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963129');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010039902');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963118');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685560010025602');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963127');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963106');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685590010632202');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010040602');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010041203');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963102');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963114');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963116');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963115');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010040601');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963120');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963107');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963130');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963128');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010041202');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963123');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963113');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963117');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963101');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685560010025600');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963121');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963105');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963119');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963104');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010039901');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010039903');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963133');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963103');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963110');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963109');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963122');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963131');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685590010632201');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010039900');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010041201');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685560010025603');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00175240888963111');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00686080010041200');
insert into cdc_resp_info (status,cdc_vax_event_id)
values('0','00685590010632200');*/

/*
insert into cdc_resp_info
values('1','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685560010025601','success');
insert into cdc_resp_info
values('2','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685590010632203','success');
insert into cdc_resp_info
values('3','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963108','success');
insert into cdc_resp_info
values('4','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963129','success');
insert into cdc_resp_info
values('5','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010039902','success');
insert into cdc_resp_info
values('6','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963118','success');
insert into cdc_resp_info
values('7','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685560010025602','success');
insert into cdc_resp_info
values('8','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963127','success');
insert into cdc_resp_info
values('9','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963106','success');
insert into cdc_resp_info
values('10','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685590010632202','success');
insert into cdc_resp_info
values('11','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010040602','success');
insert into cdc_resp_info
values('12','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010041203','success');
insert into cdc_resp_info
values('13','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963102','success');
insert into cdc_resp_info
values('14','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963114','success');
insert into cdc_resp_info
values('15','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963116','success');
insert into cdc_resp_info
values('16','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963115','success');
insert into cdc_resp_info
values('17','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010040601','success');
insert into cdc_resp_info
values('18','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963120','success');
insert into cdc_resp_info
values('19','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963107','success');
insert into cdc_resp_info
values('20','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963130','success');
insert into cdc_resp_info
values('21','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963128','success');
insert into cdc_resp_info
values('22','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010041202','success');
insert into cdc_resp_info
values('23','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963123','success');
insert into cdc_resp_info
values('24','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963113','success');
insert into cdc_resp_info
values('25','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963117','success');
insert into cdc_resp_info
values('26','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963101','success');
insert into cdc_resp_info
values('27','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685560010025600','success');
insert into cdc_resp_info
values('28','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963121','success');
insert into cdc_resp_info
values('29','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963105','success');
insert into cdc_resp_info
values('30','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963119','success');
insert into cdc_resp_info
values('31','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963104','success');
insert into cdc_resp_info
values('32','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010039901','success');
insert into cdc_resp_info
values('33','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010039903','success');
insert into cdc_resp_info
values('34','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963133','success');
insert into cdc_resp_info
values('35','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963103','success');
insert into cdc_resp_info
values('36','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963110','success');
insert into cdc_resp_info
values('37','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963109','success');
insert into cdc_resp_info
values('38','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963122','success');
insert into cdc_resp_info
values('39','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963131','success');
insert into cdc_resp_info
values('40','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685590010632201','success');
insert into cdc_resp_info
values('41','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010039900','success');
insert into cdc_resp_info
values('42','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010041201','success');
insert into cdc_resp_info
values('43','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685560010025603','success');
insert into cdc_resp_info
values('44','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00175240888963111','success');
insert into cdc_resp_info
values('45','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00686080010041200','success');
insert into cdc_resp_info
values('46','0','createdat','udpateat','validationerror','processingerror','createdby','updatedby','00685590010632200','success');*/



/*    recip_race_1  varchar(255),
    recip_race_2   varchar(255),
    recip_race_3     varchar(255),
    recip_race_4       varchar(255),
    recip_race_5  varchar(255),
    recip_race_6   varchar(255),
    recip_ethnicity     varchar(255),*/
   /* admin_date       varchar(255),
    cvx  varchar(255),
    ndc   varchar(255),
    mvx     varchar(255),
    lot_number       varchar(255),
    vax_expiration  varchar(255),
    vax_admin_site   varchar(255),
    vax_route  varchar(255),
    dose_num   varchar(255),
    vax_series_complete     varchar(255),
    responsible_org       varchar(255),
    admin_name  varchar(255),
    vtrcks_prov_pin   varchar(255),
    admin_type     varchar(255),
    admin_address_street       varchar(255),
    admin_address_street_2  varchar(255),
    admin_address_city   varchar(255),
    admin_address_county     varchar(255),
    admin_address_state       varchar(255),
    admin_address_zip  varchar(255),
    vax_refusal   varchar(255),
    cmorbid_status       varchar(255),
    serology  varchar(255),
    status   varchar(255),*/



/*insert into immunization_info(cdc_vax_event_id,ext_type,pprl_id,recip_id,recip_first_name,recip_middle_name,recip_last_name,recip_dob,
                    recip_sex,recip_address_street,recip_address_street_2,recip_address_city,recip_address_county
                    ,recip_address_state,recip_address_zip)
                     values ('00685560010025601','I','','6808418','NFUJLE','','WALKER','10011','M','2 CVS DRIVE',' WHITE SULPHUR',' SPRING','','NJ','12787'
                            );


/*CREATE PROCEDURE Getcdcinfo
AS
BEGIN
SET NOCOUNT ON

SELECT top 1000 *  FROM immunization_info;

END*/

   // EXEC Getcdcinfo


/*insert into immunization_info(v/*ax_event_id,ext_type,pprl_id,recip_id,recip_first_name,recip_middle_name,recip_last_name,recip_dob,recip_sex,recip_address_street,recip_address_street_2,recip_address_city,recip_address_county,recip_address_state,recip_address_zip,recip_race_1,recip_race_2,recip_race_3,recip_race_4,recip_race_5,recip_race_6,recip_ethnicity,admin_date,cvx,ndc,mvx,lot_number,vax_expiration,vax_admin_site,vax_route,dose_num,vax_series_complete,responsible_org,admin_name,vtrcks_prov_pin,admin_type,admin_address_street,admin_address_street_2,admin_address_city,admin_address_county,admin_address_state,admin_address_zip,vax_refusal,cmorbid_status,serology,status) values (1,1,'1@gmail.com','1f',NULL);
insert into employees(employee_id, age,email,first_name,last_name) values (2,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (3,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (4,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (5,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (6,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (7,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (8,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (9,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (10,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (11,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (12,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (13,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (14,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (15,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (16,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (17,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (18,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (19,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (20,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (21,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (22,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (23,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (24,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (25,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (26,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (27,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (28,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (29,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (30,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (31,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (32,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (33,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (34,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (35,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (36,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (37,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (38,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (39,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (40,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (41,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (42,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (43,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (44,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (45,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (46,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (47,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (48,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (49,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (50,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (51,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (52,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (53,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (54,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (55,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (56,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (57,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (58,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (59,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (60,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (61,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (62,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (63,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (64,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (65,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (66,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (67,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (68,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (69,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (70,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (71,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (72,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (73,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (74,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (75,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (76,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (77,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (78,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (79,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (80,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (81,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (82,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (83,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (84,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (85,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (86,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (87,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (88,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values (1023,1,'1@gmail.com','1f','1l');
insert into employees(employee_id, age,email,first_name,last_name) values*/ /*(1024,1,'1@gmail.com','1f','1l');*/