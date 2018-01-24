/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.1.50-community : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `mybatis`;

/*Table structure for table `t_game` */

DROP TABLE IF EXISTS `t_game`;

CREATE TABLE `t_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `game_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_game` */

insert  into `t_game`(`id`,`game_name`) values (1,'LOL'),(2,'CS'),(3,'DOTA');

/*Table structure for table `t_hus` */

DROP TABLE IF EXISTS `t_hus`;

CREATE TABLE `t_hus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_wife_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_hus` */

insert  into `t_hus`(`id`,`name`,`fk_wife_id`) values (1,'小刘',1);

/*Table structure for table `t_operlog` */

DROP TABLE IF EXISTS `t_operlog`;

CREATE TABLE `t_operlog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `oper_time` datetime DEFAULT NULL,
  `model` varchar(120) COLLATE utf8_bin DEFAULT NULL,
  `oper_type` int(11) DEFAULT NULL,
  `datas` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_operlog` */

insert  into `t_operlog`(`id`,`user_name`,`oper_time`,`model`,`oper_type`,`datas`) values (1,'xiaohuang','2017-06-19 10:01:49','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@143fbf6',0,'[UserBean [id=6, userName=xiaoma, age=18, password=123456]]'),(2,'xiaohuang','2017-06-19 10:35:26','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[1]'),(3,'xiaohuang','2017-06-19 10:36:33','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[1]'),(4,'xiaohuang','2017-06-19 10:36:33','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[UserBean [id=1, userName=xiaohuang, age=20, password=123456]]'),(5,'xiaohuang','2017-06-19 10:43:44','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[1]'),(6,'xiaohuang','2017-06-19 10:43:44','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[1]'),(7,'xiaohuang','2017-06-19 10:44:21','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[1]'),(8,'xiaohuang','2017-06-19 10:44:33','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[3]'),(9,'xiaohuang','2017-06-19 10:44:33','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[UserBean [id=3, userName=xiao, age=18, password=123456]]'),(10,'xiaohuang','2017-06-19 10:56:02','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[xiao, 123456]'),(11,'xiaohuang','2017-06-19 10:56:43','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[xiao, 123456]'),(12,'xiaohuang','2017-06-19 10:59:07','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[xiao, 123456]'),(13,'xiaohuang','2017-06-19 11:00:25','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[xiao, 123456]'),(14,'xiaohuang','2017-06-19 11:00:44','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[a, 123456]'),(15,'xiaohuang','2017-06-19 11:07:10','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[{password=123456, loginName=a}]'),(16,'xiaohuang','2017-06-19 11:45:22','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[{password=123456, loginName=a}]'),(17,'xiaohuang','2017-06-19 13:25:40','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@107730f',0,'[xiao]'),(18,'xiaohuang','2017-06-19 13:56:15','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@1dfafd2',0,'[[UserBean [id=null, userName=xiaomei, age=25, password=123456, loginName=c], UserBean [id=null, userName=xiaomei, age=25, password=123456, loginName=d], UserBean [id=null, userName=xiaomei, age=25, password=123456, loginName=e]]]'),(19,'xiaohuang','2017-06-19 14:03:09','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@1dfafd2',0,'[[Ljava.lang.Long;@639b12]'),(20,'xiaohuang','2017-06-19 15:14:17','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@1dfafd2',0,'[{password=123456, index=0, userName=x, rows=6}, org.spring_mybatis.study.beans.Pager@b9eadd]'),(21,'xiaohuang','2017-06-19 15:14:47','org.spring_mybatis.study.usermag.service.impl.UserServiceImpl@1dfafd2',0,'[{password=123456, index=0, userName=x, rows=6}, Pager [page=1, rows=6, index=0, totalRows=11, totalPage=2, datas=[UserBean [id=11, userName=xiaoji, age=34, password=123456, loginName=l], UserBean [id=10, userName=xiaowei, age=65, password=123456, loginName=k], UserBean [id=9, userName=xiaoliu, age=31, password=123456, loginName=j], UserBean [id=8, userName=xiaohe, age=22, password=123456, loginName=h], UserBean [id=7, userName=xiaowang, age=24, password=123456, loginName=g], UserBean [id=6, userName=xiaopan, age=23, password=123456, loginName=f]]]]'),(22,'xiaohuang','2017-06-20 10:47:42','org.spring_mybatis.study.relationshipmag.service.impl.HusbandServiceImpl@499e4f',0,'[Husband [id=1, name=小魏, wife=Wife [id=1, name=如花, hus=null]], Wife [id=1, name=如花, hus=null]]'),(23,'xiaohuang','2017-06-20 11:12:56','org.spring_mybatis.study.relationshipmag.service.impl.HusbandServiceImpl@1cd7ffc',0,'[1]'),(24,'xiaohuang','2017-06-20 11:22:49','org.spring_mybatis.study.relationshipmag.service.impl.HusbandServiceImpl@1cd7ffc',0,'[1]'),(25,'xiaohuang','2017-06-20 13:32:34','org.spring_mybatis.study.relationshipmag.service.impl.WifeServiceImpl@1925502',0,'[1]');

/*Table structure for table `t_person` */

DROP TABLE IF EXISTS `t_person`;

CREATE TABLE `t_person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `login_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_index` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_person` */

insert  into `t_person`(`id`,`user_name`,`login_name`,`fk_role_id`) values (1,'魏东旭','wdx',1),(2,'何攀','hp',1),(3,'刘毅','ly',2);

/*Table structure for table `t_player` */

DROP TABLE IF EXISTS `t_player`;

CREATE TABLE `t_player` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_player` */

insert  into `t_player`(`id`,`player_name`) values (1,'小马'),(2,'小草');

/*Table structure for table `t_player_game` */

DROP TABLE IF EXISTS `t_player_game`;

CREATE TABLE `t_player_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_player_id` bigint(20) DEFAULT NULL,
  `fk_game_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_player_game` */

insert  into `t_player_game`(`id`,`fk_player_id`,`fk_game_id`) values (1,1,1),(2,1,2),(3,2,2);

/*Table structure for table `t_role` */

DROP TABLE IF EXISTS `t_role`;

CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_role` */

insert  into `t_role`(`id`,`role_name`) values (1,'法师'),(2,'战士');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `pwd` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `login_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_index` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`user_name`,`age`,`pwd`,`login_name`) values (1,'xiaoma',23,'123456','c'),(2,'xiaofei',24,'123456','d'),(3,'xiao',18,'123456','a'),(4,'xiaogao',25,'123456','e'),(5,'xiao',18,'123456','b'),(6,'xiaopan',23,'123456','f'),(7,'xiaowang',24,'123456','g'),(8,'xiaohe',22,'123456','h'),(9,'xiaoliu',31,'123456','j'),(10,'xiaowei',65,'123456','k'),(11,'xiaoji',34,'123456','l');

/*Table structure for table `t_wife` */

DROP TABLE IF EXISTS `t_wife`;

CREATE TABLE `t_wife` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_wife` */

insert  into `t_wife`(`id`,`name`) values (1,'小魏');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
