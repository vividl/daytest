DROP DATABASE IF EXISTS `sampledb`;
CREATE DATABASE IF NOT EXISTS `sampledb`
  CHARACTER SET utf8
  COLLATE utf8_general_ci;
USE `sampledb`;

CREATE TABLE `user` (
  `user_id`    BIGINT(20) AUTO_INCREMENT,
  `user_name`  VARCHAR(30),
  `credits`    BIGINT(20),
  `password`   VARCHAR(32),
  `last_visit` DATETIME,
  `last_ip`    VARCHAR(23),
  PRIMARY KEY (`user_id`)
)ENGINE = InnoDB;

CREATE TABLE `login_log` (
  `login_log_id`   BIGINT(20) AUTO_INCREMENT,
  `user_id`        BIGINT(20),
  `ip`             VARCHAR(23),
  `login_datetime` DATETIME,
  PRIMARY KEY (`login_log_id`)
)ENGINE = InnoDB;

INSERT INTO `user` (`user_name`, `password`) VALUES ('admin', '123456');

COMMIT


