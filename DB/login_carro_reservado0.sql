-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: login
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carro_reservado`
--

DROP TABLE IF EXISTS `carro_reservado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `carro_reservado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ano` varchar(255) DEFAULT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `cor` varchar(255) DEFAULT NULL,
  `estado_conservacao` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `nome_carro` varchar(255) DEFAULT NULL,
  `nome_cliente` varchar(255) DEFAULT NULL,
  `placa` varchar(255) DEFAULT NULL,
  `quilometragem` varchar(255) DEFAULT NULL,
  `tnq_combustivel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carro_reservado`
--

LOCK TABLES `carro_reservado` WRITE;
/*!40000 ALTER TABLE `carro_reservado` DISABLE KEYS */;
INSERT INTO `carro_reservado` VALUES (1,'2017','SUV','Branco','Usado','KLO-5485','Volvo','usuario',NULL,'120.000 km','20 Litros'),(2,'2017','Popular','Prata','Usado','KYO-5005','Camaro','usuario',NULL,'100.000 km','30 Litros'),(3,'2017','Popular','Branco','Usado','Mile-fire','UNO','usuario',NULL,'20.000 km','40 Litros');
/*!40000 ALTER TABLE `carro_reservado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-17 16:29:10
