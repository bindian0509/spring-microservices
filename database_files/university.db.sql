CREATE DATABASE IF NOT EXISTS university;
USE university;

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `street` varchar(100) NOT NULL,
  `city` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

LOCK TABLES `address` WRITE;
INSERT INTO `address` VALUES (1,'Happy Street','Delhi'),(2,'Down the town Street','NY');
UNLOCK TABLES;


DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `address_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

LOCK TABLES `student` WRITE;
INSERT INTO `student` VALUES (1,'Raj','Dave','raj_dave@yahoo.com',1),(2,'John','Smith','john_smith@gmail.com',2);
UNLOCK TABLES;