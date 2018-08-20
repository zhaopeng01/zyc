/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : zyc

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-08-20 17:45:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zyc_access
-- ----------------------------
DROP TABLE IF EXISTS `zyc_access`;
CREATE TABLE `zyc_access` (
  `id` bigint(64) NOT NULL AUTO_INCREMENT,
  `req_ip` varchar(255) DEFAULT NULL,
  `req_num` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zyc_access
-- ----------------------------
INSERT INTO `zyc_access` VALUES ('1', '141002', '24');

-- ----------------------------
-- Table structure for zyc_article
-- ----------------------------
DROP TABLE IF EXISTS `zyc_article`;
CREATE TABLE `zyc_article` (
  `id` bigint(64) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `citation` varchar(255) DEFAULT NULL COMMENT '引文',
  `text_content` longtext COMMENT '内容',
  `type` varchar(255) DEFAULT NULL COMMENT '类型',
  `tag` varchar(255) DEFAULT NULL COMMENT '标签',
  `found` int(2) DEFAULT NULL COMMENT '原创',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `author` varchar(255) DEFAULT NULL COMMENT '作者',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zyc_article
-- ----------------------------
INSERT INTO `zyc_article` VALUES ('1', '这个是正文标题1', '嗯我就是这个引文砸窗了嗯我就是这个引文砸窗了嗯我就是这个引文砸窗了嗯我就是这个引文砸窗了嗯我就是这个引文砸窗了', '**转载请注明出处:	https://blog.csdn.net/Strugglein/article/details/81536117**\r\n\r\n还在为写完代码还得重新部署而烦恼吗,还在为刚刚启动了项目然后忽然想起还有日志没打印还得重新部署项目而难过吗,是的我就是,那么就来写这篇文章解决一下这个难过的事情吧.....\r\n\r\n\r\n1.环境\r\n----\r\n\r\n - IntelliJ IDEA 2018.1\r\n - SpringBoot	2.0.4.RELEASE\r\n - JDK	1.8\r\n\r\n2.依赖\r\n----\r\n\r\n```\r\n<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n    <modelVersion>4.0.0</modelVersion>\r\n\r\n    <groupId>com.zyc</groupId>\r\n    <artifactId>deployment</artifactId>\r\n    <version>0.0.1-SNAPSHOT</version>\r\n    <packaging>jar</packaging>\r\n\r\n    <name>deployment</name>\r\n    <description>Demo project for Spring Boot</description>\r\n\r\n    <parent>\r\n        <groupId>org.springframework.boot</groupId>\r\n        <artifactId>spring-boot-starter-parent</artifactId>\r\n        <version>2.0.4.RELEASE</version>\r\n        <relativePath/> <!-- lookup parent from repository -->\r\n    </parent>\r\n\r\n    <properties>\r\n        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\r\n        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>\r\n        <java.version>1.8</java.version>\r\n    </properties>\r\n	<dependencies>\r\n		<dependencies>\r\n	        <dependency>\r\n	            <groupId>org.springframework.boot</groupId>\r\n	            <artifactId>spring-boot-starter-web</artifactId>\r\n	        </dependency>\r\n		<dependency>\r\n			<groupId>org.springframework.boot</groupId>\r\n			<artifactId>spring-boot-devtools</artifactId>\r\n			<optional>true</optional>\r\n		</dependency>\r\n	</dependencies>\r\n    <build>\r\n		<plugins>\r\n			<plugin>\r\n				<groupId>org.springframework.boot</groupId>\r\n				<artifactId>spring-boot-maven-plugin</artifactId>\r\n				<configuration>\r\n					<fork>true</fork>\r\n				</configuration>\r\n			</plugin>\r\n		</plugins>\r\n	</build>\r\n\r\n</project>\r\n```\r\n\r\n3.IDEA设置\r\n---------------\r\n\r\n**`ctrl+alt+s`打开settings     或者File -> settings 然后找到Compiler 然后把圈出来的那个选上**\r\n\r\n![这里写图片描述](https://img-blog.csdn.net/20180809142207423?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1N0cnVnZ2xlaW4=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)\r\n\r\n`ctrl+shift+alt+/`  找到Registry,然后将圈出来的打个√\r\n\r\n![Registry](https://img-blog.csdn.net/20180809142612677?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1N0cnVnZ2xlaW4=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)\r\n\r\n![这里写图片描述](https://img-blog.csdn.net/20180809142622370?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1N0cnVnZ2xlaW4=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)\r\n\r\n\r\n**然后重启你的IDEA,你就可以尽情的嗨皮了~~~**\r\n\r\n外话\r\n--\r\n\r\n关于SpringBoot的教程在我之前也有很多大佬写过了,我也是来作为一个个人的笔记来进行记录,如有雷同,还望海涵,希望可以给大家带来帮助 ~ ~&\r\n\r\n\r\n虚心的去学习,自信的去工作~![Vue](https://cn.vuejs.org/images/logo.png)', '这个是分类1', '这个是标签1', '1', '2018-08-17 01:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('2', '这个是正文标题2', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类2', '这个是标签2', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('3', '这个是正文标题3', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类3', '这个是标签3', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('4', '这个是正文标题4', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类4', '这个是标签4', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('5', '这个是正文标题5', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('6', '这个是正文标题6', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('7', '这个是正文标题7', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('8', '这个是正文标题8', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('9', '这个是正文标题9', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('10', '这个是正文标题10', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
INSERT INTO `zyc_article` VALUES ('11', '这个是正文标题111', '这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文这一些就是引文没错 就是引文', '这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了这一堆就有意思了', '这个是分类1', '这个是标签1', '1', '2018-08-17 00:00:00', '2018-08-17 00:00:00', 'zyc', '1', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2861498845,3047908129&fm=27&gp=0.jpg');
