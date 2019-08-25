CREATE TABLE EMPLOYEE(
  emp_id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR2(32) NOT NULL,
  last_name  VARCHAR2(32) NOT NULL,
  birth_date DATE NOT NULL,
  address    VARCHAR2(32) NOT NULL,
  boss       VARCHAR2(32) NOT NULL,
  salary     NUMBER,
);