SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
        'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema forum
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `forum`;
USE `forum`;

-- -----------------------------------------------------
-- Table `forum`.`T_POST`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `forum`.`T_POST`
(
    `ID`        INT GENERATED ALWAYS AS (),
    `TITLE`     VARCHAR(100) NULL,
    `TEXT`      LONGTEXT     NULL,
    `POST_TIME` DATETIME     NULL,
    `FILE_URL`  VARCHAR(45)  NULL,
    `USER_ID`   INT          NOT NULL,
    `USER_NAME` VARCHAR(45)  NOT NULL,
    PRIMARY KEY (`ID`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `forum`.`T_COMMENT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `forum`.`T_COMMENT`
(
    `ID`        INT         NOT NULL,
    `TEXT`      LONGTEXT    NOT NULL,
    `POST_TIME` DATETIME    NOT NULL,
    `FILE_URL`  VARCHAR(45) NULL,
    `USER_ID`   INT         NOT NULL,
    `T_POST_ID` INT         NOT NULL,
    `USER_NAME` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`ID`),
    INDEX `fk_T_COMENT_T_POST_idx` (`T_POST_ID` ASC) VISIBLE,
    CONSTRAINT `fk_T_COMENT_T_POST`
        FOREIGN KEY (`T_POST_ID`)
            REFERENCES `forum`.`T_POST` (`ID`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;

USE `forum`;

SET SQL_MODE = @OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;
