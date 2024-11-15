/*
SQLyog Community v13.3.0 (64 bit)
MySQL - 10.4.32-MariaDB : Database - prviklk2019g1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`prviklk2019g1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `prviklk2019g1`;

/*Table structure for table `predaje` */

DROP TABLE IF EXISTS `predaje`;

CREATE TABLE `predaje` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `profesor` bigint(50) DEFAULT NULL,
  `predmet` bigint(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `profesor` (`profesor`),
  KEY `predmet` (`predmet`),
  CONSTRAINT `predaje_ibfk_1` FOREIGN KEY (`profesor`) REFERENCES `profesor` (`id`),
  CONSTRAINT `predaje_ibfk_2` FOREIGN KEY (`predmet`) REFERENCES `predmet` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `predaje` */

insert  into `predaje`(`id`,`profesor`,`predmet`) values 
(1,2,1),
(2,2,2),
(3,3,5),
(4,4,3),
(5,1,4);

/*Table structure for table `predmet` */

DROP TABLE IF EXISTS `predmet`;

CREATE TABLE `predmet` (
  `id` bigint(50) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(50) DEFAULT NULL,
  `espb` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `predmet` */

insert  into `predmet`(`id`,`naziv`,`espb`) values 
(1,'P1',5),
(2,'P2',6),
(3,'SPA',6),
(4,'ITEH',5),
(5,'FMIR',6);

/*Table structure for table `profesor` */

DROP TABLE IF EXISTS `profesor`;

CREATE TABLE `profesor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) DEFAULT NULL,
  `prezime` varchar(50) DEFAULT NULL,
  `zvanje` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `profesor` */

insert  into `profesor`(`id`,`ime`,`prezime`,`zvanje`,`status`) values 
(1,'Peca','Peric','VANREDNI_PROFESOR','PENZIONISAN'),
(2,'Mikaj','Mikic','REDOVNI_PROFESOR','AKTIVAN'),
(3,'Zex','Obradovic','DOCENT','AKTIVAN'),
(4,'Novak','Djokovic','VANREDNI_PROFESOR','PENZIONISAN');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
