CREATE TABLE TASK (
  id          BIGINT PRIMARY KEY,
  description VARCHAR(64) NOT NULL,
  completed   BIT NOT NULL);