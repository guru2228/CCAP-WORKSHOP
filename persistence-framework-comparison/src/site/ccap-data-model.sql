CREATE  TABLE `onlinedatabase`.`CONTINENT` (

  `CONTINENT_ID` INT NOT NULL ,

  `CONTINENT_NAME` VARCHAR(45) NULL ,

  PRIMARY KEY (`CONTINENT_ID`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

INSERT INTO continent (continent_id, continent_name) VALUES (1, 'Africa');
INSERT INTO continent (continent_id, continent_name) VALUES (2, 'Asia');
INSERT INTO continent (continent_id, continent_name) VALUES (3, 'Europe');
INSERT INTO continent (continent_id, continent_name) VALUES (4, 'North America');
INSERT INTO continent (continent_id, continent_name) VALUES (5, 'South America');
INSERT INTO continent (continent_id, continent_name) VALUES (6, 'Oceania');
INSERT INTO continent (continent_id, continent_name) VALUES (7, 'Antarctica');
COMMIT;


CREATE  TABLE `onlinedatabase`.`COUNTRY` (

  `COUNTRY_ID` INT NOT NULL ,

  `COUNTRY_NAME` VARCHAR(45) NULL ,

  `CONTINENT_ID` INT NOT NULL ,

  `AREA` INT NULL ,

  PRIMARY KEY (`COUNTRY_ID`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

ALTER TABLE `onlinedatabase`.`country` 

  ADD CONSTRAINT `COUNTRY_FK`

  FOREIGN KEY (`CONTINENT_ID` )

  REFERENCES `onlinedatabase`.`continent` (`CONTINENT_ID` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION

, ADD INDEX `COUNTRY_FK` (`CONTINENT_ID` ASC) ;

INSERT INTO country (country_id, continent_id, country_name, area) VALUES(14, 3, 'Germany', 137882);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(48, 1, 'Ghana', 92100);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(53, 6, 'Australia', 2969907);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(73, 3, 'Greece', 50949);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(122, 3, 'Georgia', 26900);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(123, 6, 'New Zealand', 104428);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(147, 1, 'Gambia', 4361);
INSERT INTO country (country_id, continent_id, country_name, area) VALUES(149, 1, 'Gabon', 103347);
COMMIT;

CREATE  TABLE `onlinedatabase`.`HEAD_OF_STATE` (

  `HOS_ID` INT NOT NULL ,

  `HOS_NAME` VARCHAR(45) NOT NULL ,

  `COUNTRY_ID` INT NOT NULL ,

  PRIMARY KEY (`HOS_ID`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

ALTER TABLE `onlinedatabase`.`head_of_state` 

  ADD CONSTRAINT `HEAD_OF_STATE_FK`

  FOREIGN KEY (`COUNTRY_ID` )

  REFERENCES `onlinedatabase`.`country` (`COUNTRY_ID` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION

, ADD INDEX `HEAD_OF_STATE_FK` (`COUNTRY_ID` ASC) ;

INSERT INTO head_of_state (hos_id, country_id, hos_name) VALUES (1, 122, 'President Mikheil Saakashvili');
INSERT INTO head_of_state (hos_id, country_id, hos_name) VALUES (2, 14, 'President Horst Köhler');
INSERT INTO head_of_state (hos_id, country_id, hos_name) VALUES (3, 73, 'President Karolos Papoulias');
COMMIT;

CREATE  TABLE `onlinedatabase`.`VISIT` (

  `HOS_ID` INT NOT NULL ,

  `COUNTRY_ID` INT NOT NULL ,

  PRIMARY KEY (`HOS_ID`, `COUNTRY_ID`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

ALTER TABLE `onlinedatabase`.`visit` 

  ADD CONSTRAINT `COUNTRY_FK1`

  FOREIGN KEY (`COUNTRY_ID` )

  REFERENCES `onlinedatabase`.`country` (`COUNTRY_ID` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION, 

  ADD CONSTRAINT `COUNTRY_FK2`

  FOREIGN KEY (`HOS_ID` )

  REFERENCES `onlinedatabase`.`head_of_state` (`HOS_ID` )

  ON DELETE NO ACTION

  ON UPDATE NO ACTION

, ADD INDEX `COUNTRY_FK1` (`COUNTRY_ID` ASC) 

, ADD INDEX `COUNTRY_FK2` (`HOS_ID` ASC) ;

INSERT INTO visit (country_id, hos_id) VALUES (14, 3);
INSERT INTO visit (country_id, hos_id) VALUES (48, 3);
INSERT INTO visit (country_id, hos_id) VALUES (149, 3);
INSERT INTO visit (country_id, hos_id) VALUES (73, 2);
INSERT INTO visit (country_id, hos_id) VALUES (73, 1);
COMMIT;


