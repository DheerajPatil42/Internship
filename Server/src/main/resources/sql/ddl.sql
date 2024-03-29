
CREATE TABLE ROLE
(
   ROLE_ID INT NOT NULL,
   ROLE_NAME VARCHAR (45) NOT NULL,
   PRIMARY KEY (ROLE_ID)
);

CREATE TABLE EMPLOYEE
(
   EMPLOYEE_ID INT PRIMARY KEY NOT NULL,
   EMPLOYEE_NAME VARCHAR(100) NOT NULL,
   DESIGNATION VARCHAR(50) NOT NULL,
   EMAIL VARCHAR (100) NOT NULL,
   USERNAME VARCHAR (100) NOT NULL,
   PASSWORD VARCHAR (100) NOT NULL,
   ENABLED BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE USER_ROLE
(
   EMPLOYEE_ID INT NOT NULL,
   ROLE_ID INT NOT NULL,
   KEY USER_FK_IDX (EMPLOYEE_ID),
   KEY ROLE_FK_IDX (ROLE_ID),
   CONSTRAINT ROLE_FK FOREIGN KEY (ROLE_ID) REFERENCES ROLE (ROLE_ID),
   CONSTRAINT USER_FK FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE (EMPLOYEE_ID)
);

CREATE TABLE DEPARTMENT 
(
   DEPARTMENT_ID INT PRIMARY KEY,
   DEPARTMENT_NAME VARCHAR(50) NOT NULL,
   DEFAULT_WORKFLOW_ID INT NOT NULL,
   DEAFULT_USER_ID INT NOT NULL
);

CREATE TABLE DEPARTMENT_USERS 
(
   EMPLOYEE_ID INT PRIMARY KEY,
   DEPARTMENT_ID INT NOT NULL
);

CREATE TABLE WORKFLOW 
(
   WORKFLOW_ID INT PRIMARY KEY,
   WORKFLOW_NAME VARCHAR(50) NOT NULL
);

CREATE TABLE TICKET_TYPE 
(
   TICKET_TYPE_ID INT PRIMARY KEY,
   TICKET_TYPE_NAME VARCHAR(50) NOT NULL,
   WORKFLOW_ID INT NOT NULL,
   DEPARTMENT_ID INT NOT NULL
);

CREATE TABLE WORKFLOW_STATES 
(
   STATE_ID INT PRIMARY KEY,
   WORKFLOW_ID INT NOT NULL,
   STATE_SERIAL_NO INT NOT NULL,
   WORKFLOW_STATE VARCHAR(50) NOT NULL,
   MAPPED_TO INT NOT NULL
);

CREATE TABLE PRIMARY_STATE 
(
   STATE_ID INT PRIMARY KEY, 
   STATE_NAME VARCHAR(50) NOT NULL
);

CREATE TABLE TICKET 
(
   TICKET_ID INT PRIMARY KEY,
   TITLE VARCHAR(200) NOT NULL,
   CREATED_DATE DATETIME NOT NULL,
   CLOSED_DATE DATETIME,
   TICKET_DESCRIPTION LONGTEXT NOT NULL,
   RAISED_BY_ID INT NOT NULL,
   DEPARTMENT_ID INT NOT NULL,
   ASSIGN_TO_ID INT NOT NULL,
   TICKET_TYPE_ID INT NOT NULL,
   PRIORITY_ID INT NOT NULL,
   STATE_ID INT NOT NULL
);

CREATE TABLE ATTACHMENT 
(
   ATTACHMENT_ID INT PRIMARY KEY,
   ATTACHMENT_NAME VARCHAR(50),
   TICKET_ID INT NOT NULL,
   ATTACHMENT_PATH VARCHAR(200) NOT NULL
);

CREATE TABLE PRIORITY 
(
   PRIORITY_ID INT PRIMARY KEY,
   PRIORITY_NAME VARCHAR(20) NOT NULL
);

ALTER TABLE DEPARTMENT
   ADD CONSTRAINT WORKFLOW_FK FOREIGN KEY (DEFAULT_WORKFLOW_ID) REFERENCES WORKFLOW (WORKFLOW_ID),
   ADD CONSTRAINT DEAFULT_USER_FK FOREIGN KEY (DEAFULT_USER_ID) REFERENCES EMPLOYEE (EMPLOYEE_ID);

ALTER TABLE DEPARTMENT_USERS 
   ADD CONSTRAINT DEPARTMENT_FK FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (DEPARTMENT_ID),
   ADD CONSTRAINT EMPLOYEE_FK FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE (EMPLOYEE_ID);

ALTER TABLE TICKET_TYPE
   ADD CONSTRAINT TICKET_TYPE_WORKFLOW_FK FOREIGN KEY (WORKFLOW_ID) REFERENCES WORKFLOW (WORKFLOW_ID),
   ADD CONSTRAINT TICKET_TYPE_DEPARTMENT_FK FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (DEPARTMENT_ID);

ALTER TABLE WORKFLOW_STATES ADD CONSTRAINT PRIMARY_STATE_FK FOREIGN KEY (MAPPED_TO) REFERENCES PRIMARY_STATE (STATE_ID);

ALTER TABLE TICKET
   ADD CONSTRAINT RAISED_BY_FK FOREIGN KEY (RAISED_BY_ID) REFERENCES EMPLOYEE (EMPLOYEE_ID),
   ADD CONSTRAINT TICKET_DEPARTMENT_FK FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (DEPARTMENT_ID),
   ADD CONSTRAINT ASSIGN_TO_FK FOREIGN KEY (ASSIGN_TO_ID) REFERENCES DEPARTMENT_USERS (EMPLOYEE_ID),
   ADD CONSTRAINT TICKET_TYPE_FK FOREIGN KEY (TICKET_TYPE_ID) REFERENCES TICKET_TYPE (TICKET_TYPE_ID),
   ADD CONSTRAINT PRIORITY_FK FOREIGN KEY (PRIORITY_ID) REFERENCES PRIORITY (PRIORITY_ID),
   ADD CONSTRAINT WORKFLOW_STATE_FK FOREIGN KEY (STATE_ID) REFERENCES WORKFLOW_STATES (STATE_ID); 

ALTER TABLE ATTACHMENT ADD CONSTRAINT TICKET_FK FOREIGN KEY (TICKET_ID) REFERENCES TICKET (TICKET_ID);