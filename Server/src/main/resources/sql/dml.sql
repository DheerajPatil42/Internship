INSERT INTO WORKFLOW VALUES
    (101,'WORKFLOW-1'),
    (102,'WORKFLOW-2'),
    (103,'WORKFLOW-3'),
    (104,'WORKFLOW-4'),
    (105,'WORKFLOW-5');

INSERT INTO EMPLOYEE (EMPLOYEE_ID, EMPLOYEE_NAME, DESIGNATION, EMAIL, USERNAME, PASSWORD)VALUES 
    (84531, 'DHEERAJ', 'INTERN','dhepatil@abswavesight.com', 'dhepatil', '123'),
    (84532, 'TUSHAR','INTERN','trathod@abswavesight.com', 'trathod', '123'),
    (84533, 'KUNAL', 'INTERN', 'kangal@abswavesight.com', 'kangal', '123'),
    (84534, 'ROSHAN','INTERN',  'rmadhe@abswavesight.com', 'rmadhe', '123'),
    (84539, 'AVINASH','INTERN', 'alohar@abswavesight.com', 'alohar', '123'),
    (7001, 'TUSHAR','HR-MANAGER',  'ttare@eagle.org', 'ttare', '123'),
    (7002, 'BHATTACHARYA','ACCOUNTANT', 'kbhattacharya@eagle.org', 'kbhattacharya', '123'),
    (7003, 'SONIA', 'OFFICE-ADMIN', 'sbannewar@eagle.org', 'sbannewar', '123'),
    (7004, 'VIVEK','IT-EXPERT',  'vgaikwad@eagle.org', 'vgaikwad', '123'),
    (7005, 'GANESH','IT-EXPERT',  'gbharati@eagle.org', 'gbharati', '123'),
    (7006, 'AKSHATA','HR-ASSISTANT',  'apatil@eagle.org', 'apatil', '123'),
    (7007, 'VIKRAM','HR-ASSISTANT',  'vpatil@eagle.org', 'vpatil', '123');

INSERT INTO DEPARTMENT VALUES
    (1,'HR',101,7001),
    (2,'ACCOUNT',101,7002),
    (3,'ADMIN',101,7003),
    (4,'IT',101,7004);

INSERT INTO TICKET_TYPE VALUES
    (201,'BONAFIDE',101,1),
    (202,'PAYMENT-SLIP',102,2),
    (203,'JOINING-KIT',103,3),
    (204,'ORIENTATION',104,3),
    (205,'ADMIN-RIGHTS',105,4),
    (206,'TECHNICAL-ISSUE',105,4),
    (207, 'GENERAL', 101, 1),
    (208, 'GENERAL', 101, 2),
    (209, 'GENERAL', 101, 3),
    (210, 'GENERAL', 101, 4);

INSERT INTO DEPARTMENT_USERS  VALUES
    (7001,1),
    (7002,2),
    (7003,3),
    (7004,4),
    (7005,4),
    (7007,1),
    (7006,1);

INSERT INTO PRIMARY_STATE VALUES
    (1,'NEW'),
    (2,'IN-PROGRESS'),
    (3, 'COMPLETE');
 
INSERT INTO PRIORITY VALUES
    (1, 'URGENT'),
    (2, 'HIGH'),
    (3, 'MEDIUM'),
    (4, 'LOW');

INSERT INTO WORKFLOW_STATES VALUES 
    (1,101,1,'NEW',1),
    (2,101,2,'IN-PROGRESS',2),
    (3,101,3,'DONE', 2),
    (4,101,4,'RESOLVED',3),
    (5,102,1,'NEW',1),
    (6,102,2,'ORDERED',2),
    (7,102,3,'DELIVERED', 2),
    (8,102,4,'RECEIVED',3),
    (9,103,1,'NEW',1),
    (10,103,2,'IN-PROGRESS',2),
    (11,103,3,'SENT', 2),
    (12,103,4,'RECEIVED',3),
    (13,104,1,'NEW',1),
    (14,104,2,'WAITING FOR APPROVAL',2),
    (15,104,3,'APPROVED', 2),
    (16,104,4,'RESOLVED',3),
    (17,105,1,'NEW',1),
    (18,105,2,'IN-PROGRESS',2),
    (19,105,3,'DONE', 2),
    (20,105,4,'RESOLVED',3),
    (21,105,5,'CANCELED',3);
    
INSERT INTO TICKET VALUES
	(11, 'Laptop battery issue', '2024-01-01', '2024-01-03', 'My work laptop is suffering very short battery life. This issue needs urgent attention because I constantly need power supply.', 84531, 4, 7005, 206, 2, 21), 
	(12, 'Need bonafide for official purposes', '2024-02-29', NULL, 'I need my bonafide before Thursday', 84532, 1, 7001, 201, 3, 1), 
	(13, 'Safety threat - Needs urgent attention!', '2024-02-28', NULL, 'There is some hinderance in entrance door, which may cause the bypassers to trip and fall.', 84533, 3, 7003, 210, 1, 2), 
	(14, 'Vending machine malfunction', '2024-02-01', NULL, 'Cafeteria vending machine is not disposing products since morning. Also, my payment has not been refunded yet.', 84534, 3, 7003, 210, 4, 1),
	(15, 'Want to update my bank details', '2024-02-05', '2024-02-06', 'There have been some changes in my bank account details. Those need to be updated.', 84539, 2, 7002, 208, 2, 3), 
	(16, 'Salary not credited', '2024-02-05', '2024-02-06', 'Waiting for my salary since 5 days. I am broke, need money', 84539, 2, 7002, 208, 2, 4),
	(17, 'AC not working', '2024-02-08', NULL, 'The AC near desk no. 12 is not working. Kindly look into it.', 84534, 3, 7003, 210, 3, 2);