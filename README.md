# conference-demo-service

## Follow the below instructions to setup mysql DB requried for the app

### Use the below queries to create the required tables

CREATE DATABASE conference_demo;

USE conference_demo;

CREATE TABLE sessions (
	session_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	session_name varchar(255) NOT NULL,
	session_description varchar(1000),
	session_length int NOT NULL,
	session_type varchar(10)
);

CREATE TABLE speakers (
	speaker_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	speaker_first_name varchar(100) NOT NULL,
	speaker_last_name varchar(100) NOT NULL,
	speaker_title varchar(100),
	speaker_bio varchar(1000)
);

CREATE TABLE session_speaker (
	session_id int,
	speaker_id int,
	FOREIGN KEY (session_id) REFERENCES sessions(session_id),
	FOREIGN KEY (speaker_id) REFERENCES speakers(speaker_id)
);

### Use the below queries to insert starter data into tables

INSERT INTO sessions (session_name, session_description, session_length, session_type)
VALUES ('AWS Cloud Practitioner', 'Basics of all the services in AWS', 40, 'online');

INSERT INTO sessions (session_name, session_description, session_length, session_type)
VALUES ('Maven Life Cycle', 'Life cycle of a maven application', 30, 'online');

INSERT INTO sessions (session_name, session_description, session_length, session_type)
VALUES ('Creating a Springboot app', 'Basics of creation of a springboot application', 60, 'online');

INSERT INTO speakers (speaker_first_name, speaker_last_name, speaker_title, speaker_bio)
VALUES ('Kusal', 'Bandaru', 'Developer', 'Working as a Web developer from 2 years in with Java, Spring and Angular');

INSERT INTO speakers (speaker_first_name, speaker_last_name, speaker_title, speaker_bio)
VALUES ('Abhimanyu', 'Rathod', 'Web Architect', 'Java full stack developer | System Architect | Expert in high level and low level system design. | Graduated from Columbia state university, USA.');

INSERT INTO speakers (speaker_first_name, speaker_last_name, speaker_title, speaker_bio)
VALUES ('Sheldon', 'Cooper', 'AWS Architect', 'Working with AWS for 3+ years. Developed numerous systems with capacity to sustain heavy loads. | Graduated from Caltech university, USA.');

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(1, 1);

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(1, 3);

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(2, 1);

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(2, 2);

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(3, 1);

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(3, 2);

INSERT INTO session_speaker(session_id, speaker_id)
VALUES(3, 3);
