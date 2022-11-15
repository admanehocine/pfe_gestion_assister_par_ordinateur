-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: pfe2
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agent`
--

DROP TABLE IF EXISTS `agent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agent` (
  `idagent` int NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `grade` varchar(45) NOT NULL,
  `codepostale` int NOT NULL,
  `chef_service_numch` int NOT NULL,
  `idservice` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idagent`),
  KEY `fk_agent_chef_service1_idx` (`chef_service_numch`),
  KEY `fk_agent_service1_idx` (`idservice`),
  CONSTRAINT `fk_agent_chef_service1` FOREIGN KEY (`chef_service_numch`) REFERENCES `chef_service` (`numch`),
  CONSTRAINT `fk_agent_service1` FOREIGN KEY (`idservice`) REFERENCES `service` (`idservice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent`
--

LOCK TABLES `agent` WRITE;
/*!40000 ALTER TABLE `agent` DISABLE KEYS */;
INSERT INTO `agent` VALUES (1264,'agent','test','sqdsqd',15000,1,1,'Agent','test');
/*!40000 ALTER TABLE `agent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `article` (
  `idarticle` int NOT NULL,
  `numero_serie` int NOT NULL,
  `concepteur` varchar(45) NOT NULL,
  `poids` double NOT NULL,
  `taille` double NOT NULL,
  `libelle` varchar(45) NOT NULL,
  `quantite_stock` int NOT NULL,
  `prix_unitaire` double NOT NULL,
  `couleur` varchar(45) NOT NULL,
  `date_acquisition` date NOT NULL,
  `dure_vie_moyenne` varchar(45) NOT NULL,
  `date_experimentation` date NOT NULL,
  `type` varchar(45) NOT NULL,
  `conditionnement` varchar(45) NOT NULL,
  PRIMARY KEY (`idarticle`,`numero_serie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1234,123432323,'qskldlskqd',23,50,'qsdqd',200,5000,'noire','2015-09-23','12','2010-02-23','qsdqsd','qsdqsjkhd'),(1567,94687545,'qsgdqsgd',456,4567,'qsjhdqhsd',345678,456789,'ghjqksd','2017-04-30','45','2011-01-16','sjkdghdjsf','kjdshfsd');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bloqué`
--

DROP TABLE IF EXISTS `bloqué`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bloqué` (
  `mac` varchar(17) NOT NULL,
  `fails` int NOT NULL,
  PRIMARY KEY (`mac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bloqué`
--

LOCK TABLES `bloqué` WRITE;
/*!40000 ALTER TABLE `bloqué` DISABLE KEYS */;
/*!40000 ALTER TABLE `bloqué` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bon_commande`
--

DROP TABLE IF EXISTS `bon_commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bon_commande` (
  `concepteur` varchar(45) NOT NULL,
  `libelle` varchar(45) NOT NULL,
  `poids` int NOT NULL,
  `taille` int NOT NULL,
  `quantite` int NOT NULL,
  `couleur` varchar(45) NOT NULL,
  `date_acquisition` date NOT NULL,
  `dure_vie_moyenne` varchar(45) NOT NULL,
  `date_expermentation` date NOT NULL,
  `conditionnement` varchar(45) NOT NULL,
  `idarticle` int NOT NULL,
  `article_numero_serie` int NOT NULL,
  `id_bon_commande` int NOT NULL,
  PRIMARY KEY (`id_bon_commande`,`idarticle`,`article_numero_serie`),
  KEY `fk_bon_commande_artiKcle_idx` (`idarticle`,`article_numero_serie`),
  CONSTRAINT `fk_bon_commande_article10` FOREIGN KEY (`idarticle`, `article_numero_serie`) REFERENCES `article` (`idarticle`, `numero_serie`),
  CONSTRAINT `fk_bon_commande_bon` FOREIGN KEY (`id_bon_commande`) REFERENCES `boncommande` (`id_bon_commande`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bon_commande`
--

LOCK TABLES `bon_commande` WRITE;
/*!40000 ALTER TABLE `bon_commande` DISABLE KEYS */;
INSERT INTO `bon_commande` VALUES ('qskldlskqd','qsdqd',23,50,1,'noire','2015-09-23','12','2010-02-23','qsdqsjkhd',1234,123432323,3333),('qskldlskqd','qsdqd',23,50,2,'noire','2015-09-23','12','2010-02-23','qsdqsjkhd',1234,123432323,4441),('qskldlskqd','qsdqd',23,50,2,'noire','2015-09-23','12','2010-02-23','qsdqsjkhd',1234,123432323,5462);
/*!40000 ALTER TABLE `bon_commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bon_livraison`
--

DROP TABLE IF EXISTS `bon_livraison`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bon_livraison` (
  `concepteur` varchar(45) NOT NULL,
  `libelle` varchar(45) NOT NULL,
  `poids` int NOT NULL,
  `taille` int NOT NULL,
  `quantite` int NOT NULL,
  `couleur` varchar(45) NOT NULL,
  `date_acquisition` date NOT NULL,
  `dure_vie_moyenne` varchar(45) NOT NULL,
  `date_expermentation` date NOT NULL,
  `conditionnement` varchar(45) NOT NULL,
  `idarticle` int NOT NULL,
  `article_numero_serie` int NOT NULL,
  `id_bon_livraison` int NOT NULL,
  PRIMARY KEY (`idarticle`,`article_numero_serie`,`id_bon_livraison`),
  KEY `fk_bon_livraison_idx` (`idarticle`,`article_numero_serie`),
  KEY `fk_id_bonliv_idx` (`id_bon_livraison`),
  CONSTRAINT `fk_bon_livraison_article1` FOREIGN KEY (`idarticle`, `article_numero_serie`) REFERENCES `article` (`idarticle`, `numero_serie`),
  CONSTRAINT `fkkkk` FOREIGN KEY (`id_bon_livraison`) REFERENCES `boncommande` (`id_bon_commande`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bon_livraison`
--

LOCK TABLES `bon_livraison` WRITE;
/*!40000 ALTER TABLE `bon_livraison` DISABLE KEYS */;
INSERT INTO `bon_livraison` VALUES ('qskldlskqd','qsdqd',23,50,1,'noire','2015-09-23','12','2010-02-23','qsdqsjkhd',1234,123432323,6799),('qskldlskqd','qsdqd',23,50,1,'noire','2015-09-23','12','2010-02-23','qsdqsjkhd',1567,94687545,6799);
/*!40000 ALTER TABLE `bon_livraison` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `boncommande`
--

DROP TABLE IF EXISTS `boncommande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `boncommande` (
  `id_bon_commande` int NOT NULL,
  `id_chef_service` int DEFAULT NULL,
  `idservice` int NOT NULL,
  `datecreation` date NOT NULL,
  `idmagasinier` int NOT NULL,
  `description` varchar(200) NOT NULL,
  `Traitement` int DEFAULT NULL,
  PRIMARY KEY (`id_bon_commande`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boncommande`
--

LOCK TABLES `boncommande` WRITE;
/*!40000 ALTER TABLE `boncommande` DISABLE KEYS */;
INSERT INTO `boncommande` VALUES (3333,1,1,'2020-08-31',1,'qsdqsdsqd',1),(4441,1,1,'2020-08-20',1,';kk;k',0),(5462,1,1,'2020-08-20',1,'description du bon de commande',0),(6799,NULL,1,'2020-09-04',1,'qsdkhqsjkdsqd',NULL);
/*!40000 ALTER TABLE `boncommande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chef_service`
--

DROP TABLE IF EXISTS `chef_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chef_service` (
  `numch` int NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `dtn` date NOT NULL,
  `tel` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `id_commandont` int NOT NULL,
  `service_idservice` int NOT NULL,
  PRIMARY KEY (`numch`),
  KEY `fk_chef_service_commandont_bord1_idx` (`id_commandont`),
  KEY `fk_chef_service_service1_idx` (`service_idservice`),
  CONSTRAINT `fk_chef_service_commandont_bord1` FOREIGN KEY (`id_commandont`) REFERENCES `commandant_bord` (`id_commandant`),
  CONSTRAINT `fk_chef_service_service1` FOREIGN KEY (`service_idservice`) REFERENCES `service` (`idservice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chef_service`
--

LOCK TABLES `chef_service` WRITE;
/*!40000 ALTER TABLE `chef_service` DISABLE KEYS */;
INSERT INTO `chef_service` VALUES (1,'chef','service','1999-01-28',55678875,'Chefservice','test',1,1);
/*!40000 ALTER TABLE `chef_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comm_prod`
--

DROP TABLE IF EXISTS `comm_prod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comm_prod` (
  `idcommande` int NOT NULL,
  `idarticle` int NOT NULL,
  `quantite` int NOT NULL,
  PRIMARY KEY (`idcommande`,`idarticle`),
  KEY `fk_commande_has_article_commande1_idx` (`idcommande`),
  KEY `fk_comm_prod_article1_idx` (`idarticle`),
  CONSTRAINT `fk_comm_prod_article1` FOREIGN KEY (`idarticle`) REFERENCES `article` (`idarticle`),
  CONSTRAINT `fk_commande_has_article_commande1` FOREIGN KEY (`idcommande`) REFERENCES `commande` (`idcommande`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comm_prod`
--

LOCK TABLES `comm_prod` WRITE;
/*!40000 ALTER TABLE `comm_prod` DISABLE KEYS */;
/*!40000 ALTER TABLE `comm_prod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commandant_bord`
--

DROP TABLE IF EXISTS `commandant_bord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `commandant_bord` (
  `id_commandant` int NOT NULL,
  `grade` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id_commandant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commandant_bord`
--

LOCK TABLES `commandant_bord` WRITE;
/*!40000 ALTER TABLE `commandant_bord` DISABLE KEYS */;
INSERT INTO `commandant_bord` VALUES (1,'generale','Bouraoui','Seyfallah','bouraoui','seyfallah');
/*!40000 ALTER TABLE `commandant_bord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commande`
--

DROP TABLE IF EXISTS `commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `commande` (
  `idcommande` int NOT NULL,
  `date_commande` date NOT NULL,
  `prix` double NOT NULL,
  `idmagasinier` int NOT NULL,
  PRIMARY KEY (`idcommande`),
  KEY `fk_commande_magasinier1_idx` (`idmagasinier`),
  CONSTRAINT `fk_commande_magasinier1` FOREIGN KEY (`idmagasinier`) REFERENCES `magasinier` (`idmagasinier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
/*!40000 ALTER TABLE `commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipement`
--

DROP TABLE IF EXISTS `equipement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipement` (
  `nume` int NOT NULL,
  `nome` varchar(69) NOT NULL,
  PRIMARY KEY (`nume`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipement`
--

LOCK TABLES `equipement` WRITE;
/*!40000 ALTER TABLE `equipement` DISABLE KEYS */;
INSERT INTO `equipement` VALUES (1200,'qsdqsfaz');
/*!40000 ALTER TABLE `equipement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `est_valider`
--

DROP TABLE IF EXISTS `est_valider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `est_valider` (
  `id_commandont` int NOT NULL,
  `chef_service_numch` int DEFAULT NULL,
  `idcommande` int NOT NULL,
  `date_validation` date NOT NULL,
  PRIMARY KEY (`id_commandont`,`idcommande`),
  KEY `fk_commandont_bord_has_chef_service_chef_service1_idx` (`chef_service_numch`),
  KEY `fk_commandont_bord_has_chef_service_commandont_bord1_idx` (`id_commandont`),
  KEY `fk_commandont_bord_has_chef_service_commande1_idx` (`idcommande`),
  CONSTRAINT `fk_commandont_bord_has_chef_service_chef_service1` FOREIGN KEY (`chef_service_numch`) REFERENCES `chef_service` (`numch`),
  CONSTRAINT `fk_commandont_bord_has_chef_service_commandont_bord1` FOREIGN KEY (`id_commandont`) REFERENCES `commandant_bord` (`id_commandant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `est_valider`
--

LOCK TABLES `est_valider` WRITE;
/*!40000 ALTER TABLE `est_valider` DISABLE KEYS */;
/*!40000 ALTER TABLE `est_valider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etat_piece`
--

DROP TABLE IF EXISTS `etat_piece`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etat_piece` (
  `idEtat_piece` int NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`idEtat_piece`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etat_piece`
--

LOCK TABLES `etat_piece` WRITE;
/*!40000 ALTER TABLE `etat_piece` DISABLE KEYS */;
/*!40000 ALTER TABLE `etat_piece` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etat_stock`
--

DROP TABLE IF EXISTS `etat_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etat_stock` (
  `idEtat_stock` int NOT NULL AUTO_INCREMENT,
  `quantite_article` double NOT NULL,
  `date_acquisition` varchar(45) NOT NULL,
  `idarticle` int NOT NULL,
  `id_commandont` int NOT NULL,
  PRIMARY KEY (`idEtat_stock`,`quantite_article`,`idarticle`),
  KEY `fk_Etat_stock_article1_idx` (`idarticle`),
  KEY `fk_Etat_stock_commandont_bord1_idx` (`id_commandont`),
  CONSTRAINT `fk_Etat_stock_article1` FOREIGN KEY (`idarticle`) REFERENCES `article` (`idarticle`),
  CONSTRAINT `fk_Etat_stock_commandont_bord1` FOREIGN KEY (`id_commandont`) REFERENCES `commandant_bord` (`id_commandant`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etat_stock`
--

LOCK TABLES `etat_stock` WRITE;
/*!40000 ALTER TABLE `etat_stock` DISABLE KEYS */;
INSERT INTO `etat_stock` VALUES (1,18,'2018-05-25',1234,1),(2,38,'2018-05-25',1234,1),(3,46,'2018-02-16',1567,1),(4,58,'2018-04-13',1234,1);
/*!40000 ALTER TABLE `etat_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fournisseur` (
  `numf` int NOT NULL,
  `num_contract` varchar(50) NOT NULL,
  `adr` varchar(45) NOT NULL,
  `tel` int NOT NULL,
  `nomf` varchar(45) NOT NULL,
  PRIMARY KEY (`numf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fournisseur`
--

LOCK TABLES `fournisseur` WRITE;
/*!40000 ALTER TABLE `fournisseur` DISABLE KEYS */;
INSERT INTO `fournisseur` VALUES (5730,'45594045','LKHsqlkhdlqhsd',67896789,'AAAABBBb'),(5887,'45678976','RUE flan flan , 67 Alger',876567885,'TESLA MOTORS');
/*!40000 ALTER TABLE `fournisseur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fournit`
--

DROP TABLE IF EXISTS `fournit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fournit` (
  `numf` int NOT NULL,
  `idarticle` int NOT NULL,
  `article_numero_serie` int NOT NULL,
  PRIMARY KEY (`numf`,`idarticle`,`article_numero_serie`),
  KEY `fk_fourniseur_has_article_article1_idx` (`idarticle`,`article_numero_serie`),
  KEY `fk_fourniseur_has_article_fourniseur1_idx` (`numf`),
  CONSTRAINT `fk_fourniseur_has_article_article1` FOREIGN KEY (`idarticle`, `article_numero_serie`) REFERENCES `article` (`idarticle`, `numero_serie`),
  CONSTRAINT `fk_fourniseur_has_article_fourniseur1` FOREIGN KEY (`numf`) REFERENCES `fournisseur` (`numf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fournit`
--

LOCK TABLES `fournit` WRITE;
/*!40000 ALTER TABLE `fournit` DISABLE KEYS */;
INSERT INTO `fournit` VALUES (5730,1234,123432323),(5887,1567,94687545);
/*!40000 ALTER TABLE `fournit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historique`
--

DROP TABLE IF EXISTS `historique`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historique` (
  `date` date NOT NULL,
  `heure` time NOT NULL,
  `panne_nump` int NOT NULL,
  PRIMARY KEY (`date`,`heure`),
  KEY `fk_historique_panne1_idx` (`panne_nump`),
  CONSTRAINT `fk_historique_panne1` FOREIGN KEY (`panne_nump`) REFERENCES `panne` (`nump`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historique`
--

LOCK TABLES `historique` WRITE;
/*!40000 ALTER TABLE `historique` DISABLE KEYS */;
INSERT INTO `historique` VALUES ('2018-05-26','10:32:00',1326),('2018-07-15','14:15:00',1326);
/*!40000 ALTER TABLE `historique` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `intervention`
--

DROP TABLE IF EXISTS `intervention`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `intervention` (
  `id` int NOT NULL,
  `cout_piece` double NOT NULL,
  `date_i` date NOT NULL,
  `type_i` varchar(45) NOT NULL,
  `modification` varchar(45) NOT NULL,
  `dure_i` time NOT NULL,
  `panne_nump` int NOT NULL,
  `remarque` varchar(145) NOT NULL,
  `idred` int DEFAULT NULL,
  `valider` int NOT NULL,
  PRIMARY KEY (`id`,`date_i`),
  KEY `fk_intervention_panne1_idx` (`panne_nump`),
  KEY `fk_intervention_agent1_idx` (`idred`),
  CONSTRAINT `fk_intervention_agent1` FOREIGN KEY (`idred`) REFERENCES `agent` (`idagent`),
  CONSTRAINT `fk_intervention_panne1` FOREIGN KEY (`panne_nump`) REFERENCES `panne` (`nump`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intervention`
--

LOCK TABLES `intervention` WRITE;
/*!40000 ALTER TABLE `intervention` DISABLE KEYS */;
INSERT INTO `intervention` VALUES (6542,3500,'2020-05-15','sqdqsd','uiouio','02:30:00',1326,'hjhjhj',1264,0);
/*!40000 ALTER TABLE `intervention` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journal`
--

DROP TABLE IF EXISTS `journal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `journal` (
  `DateJ` date NOT NULL,
  `Idagent` int NOT NULL,
  `taches` varchar(1000) NOT NULL,
  `idchef` int NOT NULL,
  PRIMARY KEY (`DateJ`,`Idagent`),
  KEY `fk_132_idx` (`Idagent`),
  KEY `fk_1432_idx` (`idchef`),
  CONSTRAINT `fk_132` FOREIGN KEY (`Idagent`) REFERENCES `agent` (`idagent`),
  CONSTRAINT `fk_1432` FOREIGN KEY (`idchef`) REFERENCES `chef_service` (`numch`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journal`
--

LOCK TABLES `journal` WRITE;
/*!40000 ALTER TABLE `journal` DISABLE KEYS */;
INSERT INTO `journal` VALUES ('2020-06-16',1264,'- kqhsqdsssssssssssssssssssssssssss\n- aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n- bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\n',1);
/*!40000 ALTER TABLE `journal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `magasinier`
--

DROP TABLE IF EXISTS `magasinier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `magasinier` (
  `idmagasinier` int NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `grade` varchar(45) NOT NULL,
  `date_installation` date NOT NULL,
  `experience` varchar(45) NOT NULL,
  `idstock` int NOT NULL,
  `navire_idnavire` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idmagasinier`),
  KEY `fk_magasinier_stock1_idx` (`idstock`),
  KEY `fk_magasinier_navire1_idx` (`navire_idnavire`),
  CONSTRAINT `fk_magasinier_navire1` FOREIGN KEY (`navire_idnavire`) REFERENCES `navire` (`idnavire`),
  CONSTRAINT `fk_magasinier_stock1` FOREIGN KEY (`idstock`) REFERENCES `stock` (`idstock`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `magasinier`
--

LOCK TABLES `magasinier` WRITE;
/*!40000 ALTER TABLE `magasinier` DISABLE KEYS */;
INSERT INTO `magasinier` VALUES (1,'magasinier','test','aucun','2010-09-16','qdsdqsd',1,1,'magasinierTest','test');
/*!40000 ALTER TABLE `magasinier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `navire`
--

DROP TABLE IF EXISTS `navire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `navire` (
  `idnavire` int NOT NULL,
  `nbr_equipage` int NOT NULL,
  `description` varchar(435) NOT NULL,
  `caracteristique` varchar(435) NOT NULL,
  `id_commandont` int NOT NULL,
  PRIMARY KEY (`idnavire`),
  KEY `fk_navire_commandont_bord1_idx` (`id_commandont`),
  CONSTRAINT `fk_navire_commandont_bord1` FOREIGN KEY (`id_commandont`) REFERENCES `commandant_bord` (`id_commandant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `navire`
--

LOCK TABLES `navire` WRITE;
/*!40000 ALTER TABLE `navire` DISABLE KEYS */;
INSERT INTO `navire` VALUES (1,200,'naivre qqq','porte avions ',1);
/*!40000 ALTER TABLE `navire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organisme_externe`
--

DROP TABLE IF EXISTS `organisme_externe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organisme_externe` (
  `numex` int NOT NULL,
  `tel` int NOT NULL,
  `adr` varchar(60) NOT NULL,
  `domaine` varchar(45) NOT NULL,
  `intervention_id` int NOT NULL,
  PRIMARY KEY (`numex`),
  KEY `fk_organisme_externe_intervention1_idx` (`intervention_id`),
  CONSTRAINT `fk_organisme_externe_intervention1` FOREIGN KEY (`intervention_id`) REFERENCES `intervention` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organisme_externe`
--

LOCK TABLES `organisme_externe` WRITE;
/*!40000 ALTER TABLE `organisme_externe` DISABLE KEYS */;
/*!40000 ALTER TABLE `organisme_externe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `panne`
--

DROP TABLE IF EXISTS `panne`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `panne` (
  `nump` int NOT NULL,
  `type_pannee` varchar(45) NOT NULL,
  `description_panne` tinytext NOT NULL,
  `Equipement_nume` int NOT NULL,
  PRIMARY KEY (`nump`),
  KEY `fk_panne_Equipement1_idx` (`Equipement_nume`),
  CONSTRAINT `fk_panne_Equipement1` FOREIGN KEY (`Equipement_nume`) REFERENCES `equipement` (`nume`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `panne`
--

LOCK TABLES `panne` WRITE;
/*!40000 ALTER TABLE `panne` DISABLE KEYS */;
INSERT INTO `panne` VALUES (1326,'xcvxcv','xcvxcv',1200);
/*!40000 ALTER TABLE `panne` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `piece`
--

DROP TABLE IF EXISTS `piece`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `piece` (
  `idpiece` int NOT NULL,
  `num_serie` int NOT NULL,
  `nom_item` varchar(45) NOT NULL,
  `fonctionement` varchar(200) NOT NULL,
  `Equipement_nume` int NOT NULL,
  `dEtat_piece` int NOT NULL,
  `photo` blob,
  PRIMARY KEY (`idpiece`,`num_serie`),
  KEY `fk_piece_Equipement1_idx` (`Equipement_nume`),
  KEY `fk_piece_Etat_piece1_idx` (`dEtat_piece`),
  CONSTRAINT `fk_piece_Equipement1` FOREIGN KEY (`Equipement_nume`) REFERENCES `equipement` (`nume`),
  CONSTRAINT `fk_piece_Etat_piece1` FOREIGN KEY (`dEtat_piece`) REFERENCES `etat_piece` (`idEtat_piece`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `piece`
--

LOCK TABLES `piece` WRITE;
/*!40000 ALTER TABLE `piece` DISABLE KEYS */;
/*!40000 ALTER TABLE `piece` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rapport`
--

DROP TABLE IF EXISTS `rapport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rapport` (
  `idRapport` int NOT NULL,
  `description` text NOT NULL,
  `type` varchar(45) NOT NULL,
  `valide` tinyint NOT NULL DEFAULT '0',
  `id_reparateur` int NOT NULL,
  `chef_service_numch` int NOT NULL,
  `id_intervention` int NOT NULL,
  `date_i` date NOT NULL,
  `objet_rap` varchar(150) NOT NULL,
  PRIMARY KEY (`idRapport`),
  KEY `fk_Rapport_ouvries1_idx` (`id_reparateur`),
  KEY `fk_Rapport_chef_service1_idx` (`chef_service_numch`),
  CONSTRAINT `fk_Rapport_chef_service1` FOREIGN KEY (`chef_service_numch`) REFERENCES `chef_service` (`numch`),
  CONSTRAINT `fk_Rapport_ouvries1` FOREIGN KEY (`id_reparateur`) REFERENCES `reparateur` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rapport`
--

LOCK TABLES `rapport` WRITE;
/*!40000 ALTER TABLE `rapport` DISABLE KEYS */;
INSERT INTO `rapport` VALUES (2266,'dsfGSDS','qsdqs',0,6542,1,6542,'2022-08-19','gfgfhgfh');
/*!40000 ALTER TABLE `rapport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rapport_chef_service`
--

DROP TABLE IF EXISTS `rapport_chef_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rapport_chef_service` (
  `num_rapport` int NOT NULL,
  `type` varchar(45) NOT NULL,
  `description` mediumtext NOT NULL,
  `numch_chef_service` int NOT NULL,
  `id_commandont` int DEFAULT NULL,
  `objet_rap` varchar(150) NOT NULL,
  `date_rap` date NOT NULL,
  PRIMARY KEY (`num_rapport`),
  KEY `fk_rapport_chef_service_chef_service1_idx` (`numch_chef_service`),
  KEY `fk_rapport_chef_service_commandont_bord1_idx` (`id_commandont`),
  CONSTRAINT `fk_commbord` FOREIGN KEY (`id_commandont`) REFERENCES `commandant_bord` (`id_commandant`),
  CONSTRAINT `fk_rapport_chef_service_chef_service1` FOREIGN KEY (`numch_chef_service`) REFERENCES `chef_service` (`numch`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rapport_chef_service`
--

LOCK TABLES `rapport_chef_service` WRITE;
/*!40000 ALTER TABLE `rapport_chef_service` DISABLE KEYS */;
INSERT INTO `rapport_chef_service` VALUES (1564,'kkl','dsfsdf',1,NULL,'dfsdfsdf','2020-08-13'),(7834,'sqdqsd','s dfqds fq sdf ',1,1,'fsdfdsf','2020-02-14');
/*!40000 ALTER TABLE `rapport_chef_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reparateur`
--

DROP TABLE IF EXISTS `reparateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reparateur` (
  `id` int NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `date_naissance` date NOT NULL,
  `tel` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `idservice` int NOT NULL,
  PRIMARY KEY (`id`,`idservice`),
  KEY `fk_Reparateur_service1_idx` (`idservice`),
  CONSTRAINT `fk_Reparateur_service1` FOREIGN KEY (`idservice`) REFERENCES `service` (`idservice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reparateur`
--

LOCK TABLES `reparateur` WRITE;
/*!40000 ALTER TABLE `reparateur` DISABLE KEYS */;
INSERT INTO `reparateur` VALUES (6542,'repare','test','1985-02-12',55185498,'Reparateur','test',1);
/*!40000 ALTER TABLE `reparateur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repare`
--

DROP TABLE IF EXISTS `repare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repare` (
  `id_reparateur` int NOT NULL,
  `Equipement_nume` int NOT NULL,
  `intervention_id` int NOT NULL,
  `date_i` date NOT NULL,
  PRIMARY KEY (`intervention_id`,`date_i`),
  KEY `fk_ouvries_has_Equipement_Equipement1_idx` (`Equipement_nume`),
  KEY `fk_ouvries_has_Equipement_ouvries_idx` (`id_reparateur`),
  KEY `fk_repare_intervention1_idx` (`intervention_id`),
  CONSTRAINT `fk_ouvries_has_Equipement_Equipement1` FOREIGN KEY (`Equipement_nume`) REFERENCES `equipement` (`nume`),
  CONSTRAINT `fk_ouvries_has_Equipement_ouvries` FOREIGN KEY (`id_reparateur`) REFERENCES `reparateur` (`id`),
  CONSTRAINT `fk_repare_intervention1` FOREIGN KEY (`intervention_id`) REFERENCES `intervention` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repare`
--

LOCK TABLES `repare` WRITE;
/*!40000 ALTER TABLE `repare` DISABLE KEYS */;
/*!40000 ALTER TABLE `repare` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `nomS` varchar(60) NOT NULL,
  `idservice` int NOT NULL,
  `nbr_effictive` int NOT NULL,
  PRIMARY KEY (`idservice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES ('NomSerivce',1,20);
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `idstock` int NOT NULL,
  `espace` int NOT NULL,
  `capacite_maximale` int NOT NULL,
  `espace_libre` int NOT NULL,
  `espace_occuper` int NOT NULL,
  `nbr_places` double NOT NULL,
  `température` int NOT NULL,
  `equipements` varchar(200) NOT NULL,
  `etat_stock` varchar(45) NOT NULL,
  PRIMARY KEY (`idstock`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,200,200,100,100,30,25,'Electronique','0001');
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-09 20:04:17
