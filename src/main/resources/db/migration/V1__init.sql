CREATE TABLE PERSONS (
    PERSON_NO bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '사람 키',
    PERSON_NAME varchar(64) NOT NULL COMMENT '사람 이름',
    PRIMARY KEY (PERSON_NO)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO PERSONS (PERSON_NO, PERSON_NAME) VALUES (1, 'Jones');
