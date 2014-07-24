CREATE DATABASE  IF NOT EXISTS `soporte` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `soporte`;
-- MySQL dump 10.13  Distrib 5.5.38, for debian-linux-gnu (i686)
--
-- Host: 127.0.0.1    Database: soporte
-- ------------------------------------------------------
-- Server version	5.5.38-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admg01`
--

DROP TABLE IF EXISTS `admg01`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admg01` (
  `id` smallint(7) NOT NULL AUTO_INCREMENT,
  `edo_reg` char(1) DEFAULT NULL,
  `cod_cia` char(2) DEFAULT NULL,
  `den_cia` varchar(50) DEFAULT NULL,
  `slo_cia` varchar(30) DEFAULT NULL,
  `ciu_cia` varchar(20) DEFAULT NULL,
  `pai_cia` varchar(20) DEFAULT NULL,
  `edo_cia` varchar(20) DEFAULT NULL,
  `dir_cia` varchar(60) DEFAULT NULL,
  `rif_cia` varchar(20) DEFAULT NULL,
  `nit_cia` varchar(20) DEFAULT NULL,
  `par_cia` varchar(20) DEFAULT NULL,
  `tlf_cia` varchar(20) DEFAULT NULL,
  `fec_reg` datetime DEFAULT '0000-00-00 00:00:00',
  `logo` varchar(50) DEFAULT NULL,
  UNIQUE KEY `Ind01` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admg01`
--

LOCK TABLES `admg01` WRITE;
/*!40000 ALTER TABLE `admg01` DISABLE KEYS */;
INSERT INTO `admg01` VALUES (1,'A','16','HOSPITAL GENERAL DEL SUR','H.G.S','MARACAIBO','VENEZUELA','ZULIA','KM 1 VIA PERIJA','','','CRISTO DE ARANZA','','2010-05-13 16:49:47','./imagenes/logohgs.jpg');
/*!40000 ALTER TABLE `admg01` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admg02`
--

DROP TABLE IF EXISTS `admg02`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admg02` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `edo_reg` char(1) DEFAULT NULL,
  `cod_usr` varchar(15) DEFAULT NULL,
  `psw_usr` varchar(16) DEFAULT NULL,
  `den_usr` varchar(40) NOT NULL,
  `cod_cia` char(2) DEFAULT NULL,
  `cod_serv` char(3) DEFAULT NULL,
  `edo_usu` char(1) DEFAULT NULL,
  `telef_area` varchar(4) NOT NULL DEFAULT '000',
  `telef` varchar(15) NOT NULL,
  `direc` varchar(50) DEFAULT NULL,
  `plataforma` varchar(4) DEFAULT NULL,
  `cedula` char(10) NOT NULL,
  `id_perfil` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `den_usr_UNIQUE` (`den_usr`),
  UNIQUE KEY `cedula_UNIQUE` (`cedula`),
  KEY `ind01` (`cod_usr`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admg02`
--

LOCK TABLES `admg02` WRITE;
/*!40000 ALTER TABLE `admg02` DISABLE KEYS */;
INSERT INTO `admg02` VALUES (1,'A','MARIALIS','cgqmygsmjv','MARIALIS MAVAREZ','16',NULL,'A','261','7292422','URB LA POMONA BLOQ. 9 APTO C-5','JAVA','20149468',0),(2,'A','ELIMAR','tcqxngnw','ELIMAR MEDINA','16',NULL,'A','000','0000000','','JAVA','13723807',1),(3,'A','JESUS','17396?>:','JESUS MORA','16',NULL,'A','000','0000000','','jAVA','v00000000',0),(4,'A','ALIRIO','17396?>:','ALIRIO JIMENEZ','16',NULL,'A','000','0000000','','JAVA','v00000002',0),(5,'A','JOSE','123','JOSE',NULL,NULL,'B','000','5121556','','JAVA','v24567894',13),(6,'A','PEDRO','1234','PEDRO',NULL,NULL,'B','000','1231231','GSHJGSJGHJ','JAVA','v21215561',4),(7,'A','JOSE','456','JOSE CANSECO',NULL,NULL,'B','123','1234567','ASDASDASDASD','JAVA','v58985855',13);
/*!40000 ALTER TABLE `admg02` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admg03`
--

DROP TABLE IF EXISTS `admg03`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admg03` (
  `edo_reg` char(1) DEFAULT '0',
  `cod_usr` varchar(15) DEFAULT NULL,
  `cod_prg` varchar(10) DEFAULT NULL,
  `cod_cia` char(2) DEFAULT NULL,
  `ind_rap` char(1) DEFAULT NULL,
  `opi` int(1) NOT NULL DEFAULT '0',
  `opm` int(1) NOT NULL DEFAULT '0',
  `ope` int(1) NOT NULL DEFAULT '0',
  `plataforma` varchar(4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admg03`
--

LOCK TABLES `admg03` WRITE;
/*!40000 ALTER TABLE `admg03` DISABLE KEYS */;
INSERT INTO `admg03` VALUES ('A','ELIMAR','FSOPORTE',NULL,'T',1,1,0,'JAVA'),('A','ELIMAR','SERVICIOS',NULL,'T',1,1,1,'JAVA'),('A','ELIMAR','INVENTARIO',NULL,'T',1,1,1,'JAVA'),('A','ELIMAR','BIENES',NULL,'T',1,1,1,'JAVA'),('A','ELIMAR','FEMPRESA',NULL,'T',1,1,1,'JAVA'),('A','ELIMAR','AUSUARIO',NULL,'T',1,1,1,'JAVA'),('A','ELIMAR','REPORTE',NULL,'T',0,0,0,'JAVA'),('A','MARIALIS','INVENTARIO',NULL,'F',0,0,0,'JAVA'),('A','MARIALIS','FEMPRESA',NULL,'F',0,0,0,'JAVA'),('A','MARIALIS','SERVICIOS',NULL,'F',0,0,0,'JAVA'),('A','MARIALIS','REPORTE',NULL,'T',0,0,0,'JAVA'),('A','MARIALIS','FSOPORTE',NULL,'T',1,1,1,'JAVA'),('A','MARIALIS','AUSUARIO',NULL,'F',0,0,0,'JAVA'),('A','ELIMAR','EQUIPOS',NULL,'T',1,1,1,'JAVA'),('A','MARIALIS','EQUIPOS',NULL,'F',0,0,0,'JAVA'),('A','JESUS','AUSUARIO',NULL,'F',0,0,0,'JAVA'),('A','JESUS','EQUIPOS',NULL,'F',0,0,0,'JAVA'),('A','JESUS','BIENES',NULL,'F',0,0,0,'JAVA'),('A','JESUS','INVENTARIO',NULL,'F',1,1,0,'JAVA'),('A','JESUS','FEMPRESA',NULL,'F',0,0,0,'JAVA'),('A','JESUS','FSOPORTE',NULL,'T',1,1,0,'JAVA'),('A','JESUS','REPORTE',NULL,'T',0,0,0,'JAVA'),('A','JESUS','SERVICIOS',NULL,'F',0,0,0,'JAVA'),('A','ALIRIO','AUSUARIO',NULL,'F',0,0,0,'JAVA'),('A','ALIRIO','EQUIPOS',NULL,'F',0,0,0,'JAVA'),('A','ALIRIO','BIENES',NULL,'F',0,0,0,'JAVA'),('A','ALIRIO','INVENTARIO',NULL,'F',1,1,0,'JAVA'),('A','ALIRIO','FEMPRESA',NULL,'F',0,0,0,'JAVA'),('A','ALIRIO','FSOPORTE',NULL,'T',1,1,0,'JAVA'),('A','ALIRIO','REPORTE',NULL,'T',0,0,0,'JAVA'),('A','ALIRIO','SERVICIOS',NULL,'F',0,0,0,'JAVA');
/*!40000 ALTER TABLE `admg03` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admg05`
--

DROP TABLE IF EXISTS `admg05`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admg05` (
  `edo_reg` char(1) DEFAULT '0',
  `cla_usr` char(2) DEFAULT NULL,
  `den_cla` varchar(40) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admg05`
--

LOCK TABLES `admg05` WRITE;
/*!40000 ALTER TABLE `admg05` DISABLE KEYS */;
INSERT INTO `admg05` VALUES ('A','SU','Supervisor'),('A','UM','Usuario'),('A','UP','Programador'),('A','CO','Usuario de Consulta'),('A','PA','Usuario de Pasantia'),('A','SU','Supervisor'),('A','UM','Usuario'),('A','UP','Programador');
/*!40000 ALTER TABLE `admg05` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `analista`
--

DROP TABLE IF EXISTS `analista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `analista` (
  `codigo` int(11) unsigned NOT NULL,
  `nombre` varchar(50) CHARACTER SET latin1 NOT NULL,
  `cedula` varchar(25) CHARACTER SET latin1 NOT NULL,
  `telefono` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `descripcion` tinytext CHARACTER SET latin1,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `cedula_UNIQUE` (`cedula`),
  KEY `index3` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `analista`
--

LOCK TABLES `analista` WRITE;
/*!40000 ALTER TABLE `analista` DISABLE KEYS */;
/*!40000 ALTER TABLE `analista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bienes`
--

DROP TABLE IF EXISTS `bienes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bienes` (
  `oid` smallint(9) NOT NULL AUTO_INCREMENT,
  `edo_reg` char(1) DEFAULT NULL,
  `fecharec` date DEFAULT '0000-00-00',
  `codserv` char(3) DEFAULT NULL,
  `codbien` char(3) DEFAULT NULL,
  `numbien` varchar(10) DEFAULT NULL,
  `subgrupo` int(2) DEFAULT NULL,
  `seccion` int(3) DEFAULT NULL,
  `cantidad` int(3) DEFAULT '0',
  `descripcion` varchar(200) DEFAULT NULL,
  `valorunit` double(8,2) DEFAULT NULL,
  `valortotal` double(8,2) DEFAULT NULL,
  `desbien` varchar(10) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `Ind01` (`codserv`),
  KEY `Ind02` (`numbien`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bienes`
--

LOCK TABLES `bienes` WRITE;
/*!40000 ALTER TABLE `bienes` DISABLE KEYS */;
/*!40000 ALTER TABLE `bienes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `codigo` int(11) unsigned NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cedula` varchar(25) NOT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `descripcion` tinytext,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `cedula_UNIQUE` (`cedula`),
  KEY `index3` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipos` (
  `oid` mediumint(9) NOT NULL AUTO_INCREMENT,
  `edo_reg` char(1) DEFAULT NULL,
  `cod_serv` char(3) DEFAULT NULL,
  `fechareg` date DEFAULT '0001-01-01',
  `dominio` varchar(20) DEFAULT NULL,
  `grupo` varchar(20) DEFAULT NULL,
  `nom_equi` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES (1,'A','004','2012-06-19','SMBSERVER02','OTIC','INFORMATICA01');
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insl04`
--

DROP TABLE IF EXISTS `insl04`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `insl04` (
  `edo_reg` char(1) DEFAULT NULL,
  `cod_prg` varchar(10) DEFAULT NULL,
  `nom_prg` varchar(40) DEFAULT NULL,
  `ind_rap` char(1) DEFAULT NULL,
  `opi` int(1) DEFAULT NULL,
  `opm` int(1) DEFAULT NULL,
  `ope` int(1) DEFAULT NULL,
  `fec_ins` datetime NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insl04`
--

LOCK TABLES `insl04` WRITE;
/*!40000 ALTER TABLE `insl04` DISABLE KEYS */;
INSERT INTO `insl04` VALUES ('A','AUSUARIO','Administración de usuarios','F',0,0,0,'2009-10-10 04:07:00'),('A','FEMPRESA','Registro de Instituciónes','F',0,0,0,'2009-10-10 04:07:00'),('A','REPORTE','Reporte del Sistema','F',0,0,0,'2009-10-10 04:07:00'),('A','FSOPORTE','Registro de Soporte','F',1,1,0,'2011-06-07 11:50:00'),('A','BIENES','Registro de Bienes','F',0,0,0,'2011-08-04 09:53:21'),('A','SERVICIOS','Servicios','F',0,0,0,'2009-10-10 04:07:00'),('A','INVENTARIO','Registro de Equipo','F',0,0,0,'2011-08-03 10:52:53'),('A','EQUIPOS','Equipos de Red','F',0,0,0,'2012-06-19 09:52:42');
/*!40000 ALTER TABLE `insl04` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventario` (
  `codbien` int(3) unsigned zerofill NOT NULL,
  `codserv` int(3) unsigned zerofill NOT NULL,
  `edo_reg` char(1) DEFAULT NULL,
  `fecharec` date DEFAULT '0000-00-00',
  `numbien` varchar(10) DEFAULT NULL,
  `impresora` varchar(100) DEFAULT NULL,
  `tarjetamadre` varchar(40) DEFAULT NULL,
  `disco` varchar(40) DEFAULT NULL,
  `memoria` varchar(40) DEFAULT NULL,
  `procesador` varchar(40) DEFAULT NULL,
  `dvdcd` varchar(40) DEFAULT NULL,
  `teclado` varchar(40) DEFAULT NULL,
  `mouse` varchar(40) DEFAULT NULL,
  `corneta` varchar(40) DEFAULT NULL,
  `monitor` varchar(40) DEFAULT NULL,
  `regulador` varchar(40) DEFAULT NULL,
  `sistema` varchar(40) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1',
  PRIMARY KEY (`codbien`),
  KEY `ind01` (`codserv`),
  CONSTRAINT `fk_servicio` FOREIGN KEY (`codserv`) REFERENCES `servicios` (`cod_serv`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `permission` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_perfil`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (0,'default',32),(1,'admin',63),(13,'usuario',39),(14,'Invitados',32);
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repolist`
--

DROP TABLE IF EXISTS `repolist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repolist` (
  `edo_reg` char(1) DEFAULT NULL,
  `codigo` varchar(8) DEFAULT NULL,
  `descrip` varchar(60) DEFAULT NULL,
  `status` varchar(4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repolist`
--

LOCK TABLES `repolist` WRITE;
/*!40000 ALTER TABLE `repolist` DISABLE KEYS */;
INSERT INTO `repolist` VALUES ('A','LISTMES','Listado mensual por usuario de soporte',''),('A','REPOMES','Estadistica por mes',NULL);
/*!40000 ALTER TABLE `repolist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicios` (
  `cod_serv` int(3) unsigned zerofill NOT NULL,
  `den_serv` varchar(60) NOT NULL,
  `cod_cia` char(2) DEFAULT NULL,
  `edo_reg` char(1) DEFAULT 'A',
  PRIMARY KEY (`cod_serv`),
  UNIQUE KEY `den_serv_UNIQUE` (`den_serv`),
  KEY `Ind01` (`cod_serv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (000,'UNIDAD DE GESTION','16','A'),(001,'DIRECCION','16','A'),(002,'ADMINISTRACION','16','A'),(003,'GERENCIA RRHH','16','A'),(004,'INFORMATICA','16','A'),(005,'COMPRA','16','A'),(006,'CONTABILIDAD','16','A'),(007,'KARDEX','16','A'),(008,'ANESTESIOLOGIA','16','A'),(009,'BIENES Y MATERIA','16','A'),(010,'CAJA','16','A'),(011,'AVANCE','16','A'),(012,'SEGURIDAD Y TRANSPORTE','16','A'),(013,'FARMACIA','16','A'),(014,'REGISTRO Y ESTADISTICA DE SALUD','16','A'),(015,'LABORATORIO GENERAL','16','A'),(016,'LABORATORIO EMERGENCIA','16','A'),(017,'ENFERMERIA','16','A'),(018,'FISIATRIA','16','A'),(019,'EPIDEMIOLOGIA','16','A'),(020,'CARDIOLOGIA','16','A'),(021,'OFTALMOLOGIA','16','A'),(022,'EMERGENCIA DE ADULTO','16','A'),(023,'EMERGENCIA DE NIÑO','16','A'),(024,'NUTRICION Y DIETETICA','16','A'),(025,'BANCO DE SANGRE','16','A'),(026,'CIRUGIA DE TORAX','16','A'),(027,'COORDINACION MEDICINA FAMILIAR','16','A'),(028,'TISIOLOGIA','16','A'),(029,'ANATOMIA PATOLOGICA','16','A'),(030,'IMAGENES RX','16','A'),(031,'ECOGRAMA DE EMERGENCIA','16','A'),(032,'TELEVISION EDUCATIVA','16','A'),(033,'SUMINISTRO','16','A'),(034,'RELACIONES PUBLICAS','16','A'),(036,'INMUNOLOGIA','16','A'),(037,'CENTRAL DE CITAS','16','A'),(038,'ADMISION DE EMERGENCIA','16','A'),(039,'BIBLIOTECA','16','A'),(040,'ODONTOLOGIA','16','A'),(041,'SANEAMIENTO AMBIENTAR','16','A'),(042,'PABELLON','16','A'),(043,'NEUMONOLOGIA','16','A'),(044,'MEDICINA INTERNA','16','A'),(045,'DERMATOLOGIA','16','A'),(046,'UROLOGIA','16','A'),(047,'CIRUGIA PLASTICA','16','A'),(048,'SERVICIO SOCIAL','16','A'),(049,'TRAUMATOLOGIA','16','A'),(050,'PEDIATRIA','16','A'),(051,'GASTROENTEROLOGIA','16','A'),(052,'CIRUGIA GENERAL','16','A'),(053,'COORDINACION DE ENFERMERIA REGIONAL','16','A'),(054,'NEFROLOGIA - CONSULTA','16','A'),(055,'VENEREOLOGIA','16','A'),(056,'PSIQUIATRIA','16','A'),(057,'GINECOLOGIA','16','A'),(058,'O.R.L.','16','A'),(059,'TRANSPORTE Y VIGILANCIA','16','A'),(060,'MANTENIMIENTO','16','A'),(062,'AREA AMBULATORIA (CONSULTA)','16','A'),(063,'NEFROLOGIA HOSP - PISO 2','16','A'),(064,'UNIDAD HEMODIALISIS - PISO 3','16','A'),(065,'PEDIATRIA HOSP. - PISO 4','16','A'),(066,'PEDIATRIA HOSP. - PISO 5','16','A'),(067,'TRAUMATOLOGIA HOSP. - PISO 6','16','A'),(068,'CIRUGIA HOSP. - PISO 7','16','A'),(069,'BRONCOSCOPIA - PISO 3','16','A'),(070,'MEDICINA INTERNA HOSP. - PISO 9','16','A'),(071,'MEDICINA INTERNA HOSP. - PISO 10','16','A'),(072,'M-4','16','A'),(073,'NEUMOTISIOLOGIA HOSP. - H-4','16','A'),(074,'U.C.R. - UNIDAD DE CUIDADOS RESPIRATORIOS','16','A'),(075,'U.C.I. - UNIDAD DE CUIDADOS INTENSIVOS','16','A'),(076,'LAVANDERIA Y COSTURA','16','A'),(077,'PROGRAMA DE DIABETES','16','A'),(078,'ESCUELA PARA PADRE','16','A'),(079,'INZUDIABETES','16','A'),(080,'ERGOMETRIA','16','A'),(082,'ASMA Y EFICEMA - I.R.A. - P.A.N.A.','16','A'),(083,'ULTRASONIDO','16','A'),(084,'ALMACEN','16','A'),(086,'NEUROLOGIA','16','A'),(092,'MEDICINA GENERAL','16','A'),(095,'NEUROCIRUGIA','16','A'),(096,'EXPLORACION PULMONAR','16','A'),(097,'EXPLORACION FUNCIONAL','16','A'),(098,'CIRUGIA CARDIOVASCULAR','16','A'),(099,'GERIATRIA','16','A'),(100,'ASESORIA JURIDICA','16','A'),(101,'ECOGRAFIA','16','A'),(102,'SEGUIMIENTO Y CONTROL','16','A'),(103,'ELIMAR','16','D'),(104,'SEGUIMIENTO Y CONTROL 2','16','D');
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `soporte`
--

DROP TABLE IF EXISTS `soporte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `soporte` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` int(11) unsigned NOT NULL,
  `edo_reg` char(1) DEFAULT NULL,
  `fecharec` date DEFAULT '0000-00-00',
  `fechasal` date DEFAULT '0000-00-00',
  `analista` int(11) unsigned NOT NULL,
  `codbien` int(3) unsigned zerofill NOT NULL,
  `numbien` varchar(10) DEFAULT NULL,
  `desequipo` text,
  `dessoporte` text,
  `cedula` char(10) DEFAULT NULL,
  `tiempo` datetime DEFAULT NULL,
  `reparacion` bit(1) DEFAULT b'0',
  `instalacion` bit(1) DEFAULT b'0',
  `cerrado` bit(1) DEFAULT b'0',
  PRIMARY KEY (`oid`),
  KEY `ind` (`codbien`),
  KEY `index3` (`cliente`),
  KEY `index4` (`analista`),
  CONSTRAINT `fk_soporte_1` FOREIGN KEY (`codbien`) REFERENCES `inventario` (`codbien`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_soporte_2` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_soporte_3` FOREIGN KEY (`analista`) REFERENCES `analista` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soporte`
--

LOCK TABLES `soporte` WRITE;
/*!40000 ALTER TABLE `soporte` DISABLE KEYS */;
/*!40000 ALTER TABLE `soporte` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-23 23:42:45
