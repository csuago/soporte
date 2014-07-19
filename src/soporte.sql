/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50090
Source Host           : localhost:3306
Source Database       : soporte

Target Server Type    : MYSQL
Target Server Version : 50090
File Encoding         : 65001

Date: 2014-04-08 10:25:21
*/

CREATE DATABASE soporte;
USE soporte;
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `admg01`
-- ----------------------------
DROP TABLE IF EXISTS `admg01`;
CREATE TABLE `admg01` (
  `id` smallint(7) NOT NULL auto_increment,
  `edo_reg` char(1) default NULL,
  `cod_cia` char(2) default NULL,
  `den_cia` varchar(50) default NULL,
  `slo_cia` varchar(30) default NULL,
  `ciu_cia` varchar(20) default NULL,
  `pai_cia` varchar(20) default NULL,
  `edo_cia` varchar(20) default NULL,
  `dir_cia` varchar(60) default NULL,
  `rif_cia` varchar(20) default NULL,
  `nit_cia` varchar(20) default NULL,
  `par_cia` varchar(20) default NULL,
  `tlf_cia` varchar(20) default NULL,
  `fec_reg` datetime default '0000-00-00 00:00:00',
  `logo` varchar(50) default NULL,
  UNIQUE KEY `Ind01` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admg01
-- ----------------------------
INSERT INTO `admg01` VALUES ('1', 'A', '16', 'HOSPITAL GENERAL DEL SUR', 'H.G.S', 'MARACAIBO', 'VENEZUELA', 'ZULIA', 'KM 1 VIA PERIJA', '', '', 'CRISTO DE ARANZA', '', '2010-05-13 16:49:47', './imagenes/logohgs.jpg');

-- ----------------------------
-- Table structure for `admg02`
-- ----------------------------
DROP TABLE IF EXISTS `admg02`;
CREATE TABLE `admg02` (
  `edo_reg` char(1) default NULL,
  `cod_usr` varchar(15) default NULL,
  `psw_usr` varchar(16) default NULL,
  `den_usr` varchar(40) default NULL,
  `cod_cia` char(2) default NULL,
  `cod_serv` char(3) default NULL,
  `edo_usu` char(1) default NULL,
  `cla_usr` char(2) default NULL,
  `telef` varchar(15) default NULL,
  `direc` varchar(50) default NULL,
  `plataforma` varchar(4) default NULL,
  `cedula` char(10) default NULL,
  KEY `ind01` (`cod_usr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admg02
-- ----------------------------
INSERT INTO `admg02` VALUES ('A', 'MARIALIS', 'cgqmygsmjv', 'MARIALIS MAVAREZ', '16', null, 'A', 'SU', '7292422', 'URB LA POMONA BLOQ. 9 APTO C-5', 'JAVA', '20149468');
INSERT INTO `admg02` VALUES ('A', 'ELIMAR', 'tcqxngnw', 'ELIMAR MEDINA', '16', null, 'A', 'UM', '', '', 'JAVA', '13723807');
INSERT INTO `admg02` VALUES ('A', 'JESUS', '17396?>:', 'JESUS MORA', '16', null, 'A', 'UM', '', '', 'jAVA', null);
INSERT INTO `admg02` VALUES ('A', 'ALIRIO', '2:386??8', 'ALIRIO JIMENEZ', '16', null, 'A', 'UM', '', '', 'JAVA', null);

-- ----------------------------
-- Table structure for `admg03`
-- ----------------------------
DROP TABLE IF EXISTS `admg03`;
CREATE TABLE `admg03` (
  `edo_reg` char(1) default '0',
  `cod_usr` varchar(15) default NULL,
  `cod_prg` varchar(10) default NULL,
  `cod_cia` char(2) default NULL,
  `ind_rap` char(1) default NULL,
  `opi` int(1) NOT NULL default '0',
  `opm` int(1) NOT NULL default '0',
  `ope` int(1) NOT NULL default '0',
  `plataforma` varchar(4) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admg03
-- ----------------------------
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'FSOPORTE', null, 'T', '1', '1', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'SERVICIOS', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'INVENTARIO', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'BIENES', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'FEMPRESA', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'AUSUARIO', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'REPORTE', null, 'T', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'INVENTARIO', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'FEMPRESA', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'SERVICIOS', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'REPORTE', null, 'T', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'FSOPORTE', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'AUSUARIO', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ELIMAR', 'EQUIPOS', null, 'T', '1', '1', '1', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'MARIALIS', 'EQUIPOS', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'AUSUARIO', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'EQUIPOS', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'BIENES', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'INVENTARIO', null, 'F', '1', '1', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'FEMPRESA', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'FSOPORTE', null, 'T', '1', '1', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'REPORTE', null, 'T', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'JESUS', 'SERVICIOS', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'AUSUARIO', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'EQUIPOS', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'BIENES', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'INVENTARIO', null, 'F', '1', '1', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'FEMPRESA', null, 'F', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'FSOPORTE', null, 'T', '1', '1', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'REPORTE', null, 'T', '0', '0', '0', 'JAVA');
INSERT INTO `admg03` VALUES ('A', 'ALIRIO', 'SERVICIOS', null, 'F', '0', '0', '0', 'JAVA');

-- ----------------------------
-- Table structure for `admg05`
-- ----------------------------
DROP TABLE IF EXISTS `admg05`;
CREATE TABLE `admg05` (
  `edo_reg` char(1) default '0',
  `cla_usr` char(2) default NULL,
  `den_cla` varchar(40) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admg05
-- ----------------------------
INSERT INTO `admg05` VALUES ('A', 'SU', 'Supervisor');
INSERT INTO `admg05` VALUES ('A', 'UM', 'Usuario');
INSERT INTO `admg05` VALUES ('A', 'UP', 'Programador');
INSERT INTO `admg05` VALUES ('A', 'CO', 'Usuario de Consulta');
INSERT INTO `admg05` VALUES ('A', 'PA', 'Usuario de Pasantia');
INSERT INTO `admg05` VALUES ('A', 'SU', 'Supervisor');
INSERT INTO `admg05` VALUES ('A', 'UM', 'Usuario');
INSERT INTO `admg05` VALUES ('A', 'UP', 'Programador');

-- ----------------------------
-- Table structure for `bienes`
-- ----------------------------
DROP TABLE IF EXISTS `bienes`;
CREATE TABLE `bienes` (
  `oid` smallint(9) NOT NULL auto_increment,
  `edo_reg` char(1) default NULL,
  `fecharec` date default '0000-00-00',
  `codserv` char(3) default NULL,
  `codbien` char(3) default NULL,
  `numbien` varchar(10) default NULL,
  `subgrupo` int(2) default NULL,
  `seccion` int(3) default NULL,
  `cantidad` int(3) default '0',
  `descripcion` varchar(200) default NULL,
  `valorunit` double(8,2) default NULL,
  `valortotal` double(8,2) default NULL,
  `desbien` varchar(10) default NULL,
  `status` char(1) default NULL,
  PRIMARY KEY  (`oid`),
  KEY `Ind01` (`codserv`),
  KEY `Ind02` (`numbien`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bienes
-- ----------------------------

-- ----------------------------
-- Table structure for `equipos`
-- ----------------------------
DROP TABLE IF EXISTS `equipos`;
CREATE TABLE `equipos` (
  `oid` mediumint(9) NOT NULL auto_increment,
  `edo_reg` char(1) default NULL,
  `cod_serv` char(3) default NULL,
  `fechareg` date default '0001-01-01',
  `dominio` varchar(20) default NULL,
  `grupo` varchar(20) default NULL,
  `nom_equi` varchar(20) default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of equipos
-- ----------------------------
INSERT INTO `equipos` VALUES ('1', 'A', '004', '2012-06-19', 'SMBSERVER02', 'OTIC', 'INFORMATICA01');

-- ----------------------------
-- Table structure for `insl04`
-- ----------------------------
DROP TABLE IF EXISTS `insl04`;
CREATE TABLE `insl04` (
  `edo_reg` char(1) default NULL,
  `cod_prg` varchar(10) default NULL,
  `nom_prg` varchar(40) default NULL,
  `ind_rap` char(1) default NULL,
  `opi` int(1) default NULL,
  `opm` int(1) default NULL,
  `ope` int(1) default NULL,
  `fec_ins` datetime NOT NULL default '0000-00-00 00:00:00'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insl04
-- ----------------------------
INSERT INTO `insl04` VALUES ('A', 'AUSUARIO', 'Administración de usuarios', 'F', '0', '0', '0', '2009-10-10 04:07:00');
INSERT INTO `insl04` VALUES ('A', 'FEMPRESA', 'Registro de Instituciónes', 'F', '0', '0', '0', '2009-10-10 04:07:00');
INSERT INTO `insl04` VALUES ('A', 'REPORTE', 'Reporte del Sistema', 'F', '0', '0', '0', '2009-10-10 04:07:00');
INSERT INTO `insl04` VALUES ('A', 'FSOPORTE', 'Registro de Soporte', 'F', '1', '1', '0', '2011-06-07 11:50:00');
INSERT INTO `insl04` VALUES ('A', 'BIENES', 'Registro de Bienes', 'F', '0', '0', '0', '2011-08-04 09:53:21');
INSERT INTO `insl04` VALUES ('A', 'SERVICIOS', 'Servicios', 'F', '0', '0', '0', '2009-10-10 04:07:00');
INSERT INTO `insl04` VALUES ('A', 'INVENTARIO', 'Registro de Equipo', 'F', '0', '0', '0', '2011-08-03 10:52:53');
INSERT INTO `insl04` VALUES ('A', 'EQUIPOS', 'Equipos de Red', 'F', '0', '0', '0', '2012-06-19 09:52:42');

-- ----------------------------
-- Table structure for `inventario`
-- ----------------------------
DROP TABLE IF EXISTS `inventario`;
CREATE TABLE `inventario` (
  `oid` smallint(9) NOT NULL auto_increment,
  `edo_reg` char(1) default NULL,
  `fecharec` date default '0000-00-00',
  `codserv` char(3) default NULL,
  `codbien` char(3) default NULL,
  `numbien` varchar(10) default NULL,
  `impresora` varchar(100) default NULL,
  `tarjetamadre` varchar(40) default NULL,
  `disco` varchar(40) default NULL,
  `memoria` varchar(40) default NULL,
  `procesador` varchar(40) default NULL,
  `dvdcd` varchar(40) default NULL,
  `teclado` varchar(40) default NULL,
  `mouse` varchar(40) default NULL,
  `corneta` varchar(40) default NULL,
  `monitor` varchar(40) default NULL,
  `regulador` varchar(40) default NULL,
  `sistema` varchar(40) default NULL,
  PRIMARY KEY  (`oid`),
  KEY `ind01` (`numbien`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inventario
-- ----------------------------

-- ----------------------------
-- Table structure for `repolist`
-- ----------------------------
DROP TABLE IF EXISTS `repolist`;
CREATE TABLE `repolist` (
  `edo_reg` char(1) default NULL,
  `codigo` varchar(8) default NULL,
  `descrip` varchar(60) default NULL,
  `status` varchar(4) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repolist
-- ----------------------------
INSERT INTO `repolist` VALUES ('A', 'LISTMES', 'Listado mensual por usuario de soporte', '');
INSERT INTO `repolist` VALUES ('A', 'REPOMES', 'Estadistica por mes', null);

-- ----------------------------
-- Table structure for `servicios`
-- ----------------------------
DROP TABLE IF EXISTS `servicios`;
CREATE TABLE `servicios` (
  `cod_serv` char(3) default NULL,
  `cod_cia` char(2) default NULL,
  `den_serv` varchar(60) default NULL,
  `edo_reg` char(1) default NULL,
  `oid` mediumint(9) unsigned zerofill NOT NULL auto_increment,
  PRIMARY KEY  (`oid`),
  KEY `Ind01` (`cod_serv`)
) ENGINE=MyISAM AUTO_INCREMENT=158 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of servicios
-- ----------------------------
INSERT INTO `servicios` VALUES ('000', '16', 'UNIDAD DE GESTION', 'A', '000000002');
INSERT INTO `servicios` VALUES ('002', '16', 'ADMINISTRACION', 'A', '000000139');
INSERT INTO `servicios` VALUES ('003', '16', 'GERENCIA RRHH', 'A', '000000140');
INSERT INTO `servicios` VALUES ('004', '16', 'INFORMATICA', 'A', '000000006');
INSERT INTO `servicios` VALUES ('007', '16', 'KARDEX', 'A', '000000008');
INSERT INTO `servicios` VALUES ('009', '16', 'BIENES Y MATERIA', 'A', '000000009');
INSERT INTO `servicios` VALUES ('010', '16', 'CAJA', 'A', '000000010');
INSERT INTO `servicios` VALUES ('013', '16', 'FARMACIA', 'A', '000000011');
INSERT INTO `servicios` VALUES ('014', '16', 'REGISTRO Y ESTADISTICA DE SALUD', 'A', '000000012');
INSERT INTO `servicios` VALUES ('015', '16', 'LABORATORIO GENERAL', 'A', '000000013');
INSERT INTO `servicios` VALUES ('016', '16', 'LABORATORIO EMERGENCIA', 'A', '000000014');
INSERT INTO `servicios` VALUES ('017', '16', 'ENFERMERIA', 'A', '000000015');
INSERT INTO `servicios` VALUES ('018', '16', 'FISIATRIA', 'A', '000000016');
INSERT INTO `servicios` VALUES ('019', '16', 'EPIDEMIOLOGIA', 'A', '000000017');
INSERT INTO `servicios` VALUES ('020', '16', 'CARDIOLOGIA', 'A', '000000018');
INSERT INTO `servicios` VALUES ('021', '16', 'OFTALMOLOGIA', 'A', '000000019');
INSERT INTO `servicios` VALUES ('022', '16', 'EMERGENCIA DE ADULTO', 'A', '000000020');
INSERT INTO `servicios` VALUES ('023', '16', 'EMERGENCIA DE NIÑO', 'A', '000000021');
INSERT INTO `servicios` VALUES ('024', '16', 'NUTRICION Y DIETETICA', 'A', '000000022');
INSERT INTO `servicios` VALUES ('025', '16', 'BANCO DE SANGRE', 'A', '000000023');
INSERT INTO `servicios` VALUES ('026', '16', 'CIRUGIA DE TORAX', 'A', '000000024');
INSERT INTO `servicios` VALUES ('027', '16', 'COORDINACION MEDICINA FAMILIAR', 'A', '000000025');
INSERT INTO `servicios` VALUES ('028', '16', 'TISIOLOGIA', 'A', '000000026');
INSERT INTO `servicios` VALUES ('029', '16', 'ANATOMIA PATOLOGICA', 'A', '000000027');
INSERT INTO `servicios` VALUES ('030', '16', 'IMAGENES RX', 'A', '000000028');
INSERT INTO `servicios` VALUES ('032', '16', 'TELEVISION EDUCATIVA', 'A', '000000029');
INSERT INTO `servicios` VALUES ('033', '16', 'SUMINISTRO', 'A', '000000030');
INSERT INTO `servicios` VALUES ('036', '16', 'INMUNOLOGIA', 'A', '000000032');
INSERT INTO `servicios` VALUES ('037', '16', 'CENTRAL DE CITAS', 'A', '000000033');
INSERT INTO `servicios` VALUES ('038', '16', 'ADMISION DE EMERGENCIA', 'A', '000000034');
INSERT INTO `servicios` VALUES ('039', '16', 'BIBLIOTECA', 'A', '000000035');
INSERT INTO `servicios` VALUES ('040', '16', 'ODONTOLOGIA', 'A', '000000036');
INSERT INTO `servicios` VALUES ('041', '16', 'SANEAMIENTO AMBIENTAR', 'A', '000000037');
INSERT INTO `servicios` VALUES ('042', '16', 'PABELLON', 'A', '000000038');
INSERT INTO `servicios` VALUES ('043', '16', 'NEUMONOLOGIA', 'A', '000000039');
INSERT INTO `servicios` VALUES ('044', '16', 'MEDICINA INTERNA', 'A', '000000040');
INSERT INTO `servicios` VALUES ('045', '16', 'DERMATOLOGIA', 'A', '000000041');
INSERT INTO `servicios` VALUES ('046', '16', 'UROLOGIA', 'A', '000000042');
INSERT INTO `servicios` VALUES ('047', '16', 'CIRUGIA PLASTICA', 'A', '000000043');
INSERT INTO `servicios` VALUES ('048', '16', 'SERVICIO SOCIAL', 'A', '000000044');
INSERT INTO `servicios` VALUES ('049', '16', 'TRAUMATOLOGIA', 'A', '000000045');
INSERT INTO `servicios` VALUES ('050', '16', 'PEDIATRIA', 'A', '000000046');
INSERT INTO `servicios` VALUES ('051', '16', 'GASTROENTEROLOGIA', 'A', '000000047');
INSERT INTO `servicios` VALUES ('052', '16', 'CIRUGIA GENERAL', 'A', '000000048');
INSERT INTO `servicios` VALUES ('054', '16', 'NEFROLOGIA - CONSULTA', 'A', '000000049');
INSERT INTO `servicios` VALUES ('055', '16', 'VENEREOLOGIA', 'A', '000000050');
INSERT INTO `servicios` VALUES ('056', '16', 'PSIQUIATRIA', 'A', '000000051');
INSERT INTO `servicios` VALUES ('057', '16', 'GINECOLOGIA', 'A', '000000052');
INSERT INTO `servicios` VALUES ('058', '16', 'O.R.L.', 'A', '000000053');
INSERT INTO `servicios` VALUES ('059', '16', 'TRANSPORTE Y VIGILANCIA', 'A', '000000054');
INSERT INTO `servicios` VALUES ('060', '16', 'MANTENIMIENTO', 'A', '000000055');
INSERT INTO `servicios` VALUES ('062', '16', 'AREA AMBULATORIA (CONSULTA)', 'A', '000000056');
INSERT INTO `servicios` VALUES ('063', '16', 'NEFROLOGIA HOSP - PISO 2', 'A', '000000057');
INSERT INTO `servicios` VALUES ('064', '16', 'UNIDAD HEMODIALISIS - PISO 3', 'A', '000000058');
INSERT INTO `servicios` VALUES ('065', '16', 'PEDIATRIA HOSP. - PISO 4', 'A', '000000059');
INSERT INTO `servicios` VALUES ('066', '16', 'PEDIATRIA HOSP. - PISO 5', 'A', '000000060');
INSERT INTO `servicios` VALUES ('067', '16', 'TRAUMATOLOGIA HOSP. - PISO 6', 'A', '000000061');
INSERT INTO `servicios` VALUES ('068', '16', 'CIRUGIA HOSP. - PISO 7', 'A', '000000062');
INSERT INTO `servicios` VALUES ('070', '16', 'MEDICINA INTERNA HOSP. - PISO 9', 'A', '000000063');
INSERT INTO `servicios` VALUES ('071', '16', 'MEDICINA INTERNA HOSP. - PISO 10', 'A', '000000064');
INSERT INTO `servicios` VALUES ('072', '16', 'M-4', 'A', '000000065');
INSERT INTO `servicios` VALUES ('073', '16', 'NEUMOTISIOLOGIA HOSP. - H-4', 'A', '000000066');
INSERT INTO `servicios` VALUES ('074', '16', 'U.C.R. - UNIDAD DE CUIDADOS RESPIRATORIOS', 'A', '000000067');
INSERT INTO `servicios` VALUES ('075', '16', 'U.C.I. - UNIDAD DE CUIDADOS INTENSIVOS', 'A', '000000068');
INSERT INTO `servicios` VALUES ('076', '16', 'LAVANDERIA Y COSTURA', 'A', '000000069');
INSERT INTO `servicios` VALUES ('079', '16', 'INZUDIABETES', 'A', '000000070');
INSERT INTO `servicios` VALUES ('080', '16', 'ERGOMETRIA', 'A', '000000071');
INSERT INTO `servicios` VALUES ('082', '16', 'ASMA Y EFICEMA - I.R.A. - P.A.N.A.', 'A', '000000072');
INSERT INTO `servicios` VALUES ('083', '16', 'ULTRASONIDO', 'A', '000000073');
INSERT INTO `servicios` VALUES ('086', '16', 'NEUROLOGIA', 'A', '000000074');
INSERT INTO `servicios` VALUES ('092', '16', 'MEDICINA GENERAL', 'A', '000000075');
INSERT INTO `servicios` VALUES ('095', '16', 'NEUROCIRUGIA', 'A', '000000076');
INSERT INTO `servicios` VALUES ('096', '16', 'EXPLORACION PULMONAR', 'A', '000000077');
INSERT INTO `servicios` VALUES ('097', '16', 'EXPLORACION FUNCIONAL', 'A', '000000078');
INSERT INTO `servicios` VALUES ('098', '16', 'CIRUGIA CARDIOVASCULAR', 'A', '000000079');
INSERT INTO `servicios` VALUES ('099', '16', 'GERIATRIA', 'A', '000000080');
INSERT INTO `servicios` VALUES ('069', '16', 'BRONCOSCOPIA - PISO 3', 'A', '000000110');
INSERT INTO `servicios` VALUES ('008', '16', 'ANESTESIOLOGIA', 'A', '000000114');
INSERT INTO `servicios` VALUES ('001', '16', 'DIRECCION', 'A', '000000141');
INSERT INTO `servicios` VALUES ('100', '16', 'ASESORIA JURIDICA', 'A', '000000143');
INSERT INTO `servicios` VALUES ('101', '16', 'ECOGRAFIA', 'A', '000000144');
INSERT INTO `servicios` VALUES ('011', '16', 'AVANCE', 'A', '000000145');
INSERT INTO `servicios` VALUES ('006', '16', 'CONTABILIDAD', 'A', '000000146');
INSERT INTO `servicios` VALUES ('005', '16', 'COMPRA', 'A', '000000147');
INSERT INTO `servicios` VALUES ('012', '16', 'SEGURIDAD Y TRANSPORTE', 'A', '000000148');
INSERT INTO `servicios` VALUES ('102', '16', 'SEGUIMIENTO Y CONTROL', 'A', '000000149');
INSERT INTO `servicios` VALUES ('031', '16', 'ECOGRAMA DE EMERGENCIA', 'A', '000000150');
INSERT INTO `servicios` VALUES ('034', '16', 'RELACIONES PUBLICAS', 'A', '000000151');
INSERT INTO `servicios` VALUES ('077', '16', 'PROGRAMA DE DIABETES', 'A', '000000152');
INSERT INTO `servicios` VALUES ('084', '16', 'ALMACEN', 'A', '000000155');
INSERT INTO `servicios` VALUES ('078', '16', 'ESCUELA PARA PADRE', 'A', '000000154');
INSERT INTO `servicios` VALUES ('053', '16', 'COORDINACION DE ENFERMERIA REGIONAL', 'A', '000000156');
INSERT INTO `servicios` VALUES ('103', '16', 'ELIMAR', 'D', '000000157');

-- ----------------------------
-- Table structure for `soporte`
-- ----------------------------
DROP TABLE IF EXISTS `soporte`;
CREATE TABLE `soporte` (
  `oid` mediumint(9) NOT NULL auto_increment,
  `edo_reg` char(1) default NULL,
  `fecharec` date default '0000-00-00',
  `fechasal` date default '0000-00-00',
  `noment` varchar(30) default NULL,
  `nomrec` varchar(30) default NULL,
  `codserv` char(3) default NULL,
  `codbien` char(3) default NULL,
  `numbien` varchar(10) default NULL,
  `desequipo` text,
  `dessoporte` text,
  `cedula` char(10) default NULL,
  `tiempo` datetime default NULL,
  PRIMARY KEY  (`oid`)
) ENGINE=MyISAM AUTO_INCREMENT=163 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of soporte
-- ----------------------------
