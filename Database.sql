CREATE DATABASE disasterdb;

show tables;
drop table incident;
SELECT * FROM incidents;
SELECT * FROM resources;
SELECT * FROM volunteers;
SELECT * FROM alerts;
select * from users;
SELECT first_name, profile_image FROM users;

truncate table incidents;
truncate table alerts;
truncate table volunteers;
truncate table incidents;
DELETE FROM resources;
DESCRIBE incidents;
DROP TABLE incidents;
ALTER TABLE resources ADD latitude VARCHAR(255);
ALTER TABLE resources ADD longitude VARCHAR(255);
INSERT INTO resources
(name, type, quantity, status, contact, location, latitude, longitude)

VALUES

(
'AIIMS Delhi',
'Shelter',
'120 / 120',
'Available',
'+91 11-26588500',
'Delhi',
'28.5672',
'77.2100'
),

(
'Apollo Chennai Ambulance',
'Vehicle',
'12 / 12',
'Available',
'+91 44-28290200',
'Chennai',
'13.0827',
'80.2707'
),

(
'NDRF Rescue Team',
'Personnel',
'40 / 40',
'Available',
'+91 9876543210',
'Mumbai',
'19.0760',
'72.8777'
),

(
'Hyderabad Relief Camp',
'Shelter',
'80 / 80',
'Available',
'+91 9123456780',
'Hyderabad',
'17.3850',
'78.4867'
),

(
'Emergency Ambulance Unit',
'Vehicle',
'8 / 8',
'Busy',
'+91 9988776655',
'Pune',
'18.5204',
'73.8567'
),

(
'Disaster Medical Team',
'Personnel',
'25 / 25',
'Available',
'+91 8899776655',
'Kolkata',
'22.5726',
'88.3639'
);
