/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : flower

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2019-01-14 08:21:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `AdminContrllor`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `adminAccount` varchar(255) NOT NULL COMMENT '管理员账号',
  `adminPassword` varchar(255) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of AdminContrllor
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'liuqi', 'liuqi');
INSERT INTO `admin` VALUES ('2', 'AdminContrllor', 'AdminContrllor');

-- ----------------------------
-- Table structure for `flower`
-- ----------------------------
DROP TABLE IF EXISTS `flower`;
CREATE TABLE `flower` (
  `flowerId` int(11) NOT NULL AUTO_INCREMENT COMMENT '鲜花编号',
  `flowerTypeId` int(11) NOT NULL COMMENT '对应的鲜花类型编号',
  `flowerUseId` int(11) NOT NULL COMMENT '对应的鲜花用途编号',
  `flowerBranchNumberId` int(11) NOT NULL COMMENT '对应的鲜花枝数编号',
  `marketPrice` double(11,2) NOT NULL COMMENT '市场价格',
  `Price` double(11,2) NOT NULL COMMENT '价格',
  `inventory` int(11) NOT NULL COMMENT '库存',
  `imageName` varchar(255) NOT NULL COMMENT '图片名称',
  `flowerName` varchar(255) NOT NULL COMMENT '鲜花名称',
  `InsertDateTime` datetime NOT NULL COMMENT '添加的日期时间',
  PRIMARY KEY (`flowerId`),
  KEY `flowerTypeId_FK` (`flowerTypeId`),
  KEY `flowerUseId_FK` (`flowerUseId`),
  KEY `flowerBranchNumberId_FK` (`flowerBranchNumberId`),
  CONSTRAINT `flowerBranchNumberId_FK` FOREIGN KEY (`flowerBranchNumberId`) REFERENCES `flowerbranchnumber` (`flowerBranchNumberId`),
  CONSTRAINT `flowerTypeId_FK` FOREIGN KEY (`flowerTypeId`) REFERENCES `flowertype` (`flowerTypeId`),
  CONSTRAINT `flowerUseId_FK` FOREIGN KEY (`flowerUseId`) REFERENCES `floweruse` (`flowerUseId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flower
-- ----------------------------
INSERT INTO `flower` VALUES ('1', '4', '1', '5', '450.00', '311.00', '99', 'AD0I8L_ZCBAEGAAgl5jF2gUorb2e7AYw9AM49AM.png', '爱情进化论', '2019-01-13 23:48:51');

-- ----------------------------
-- Table structure for `flowerbranchnumber`
-- ----------------------------
DROP TABLE IF EXISTS `flowerbranchnumber`;
CREATE TABLE `flowerbranchnumber` (
  `flowerBranchNumberId` int(11) NOT NULL AUTO_INCREMENT COMMENT '鲜花枝数编号',
  `flowerBranchNumber` varchar(255) NOT NULL COMMENT '鲜花枝数',
  PRIMARY KEY (`flowerBranchNumberId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flowerbranchnumber
-- ----------------------------
INSERT INTO `flowerbranchnumber` VALUES ('1', '99枝');
INSERT INTO `flowerbranchnumber` VALUES ('2', '33枝');
INSERT INTO `flowerbranchnumber` VALUES ('3', '18枝');
INSERT INTO `flowerbranchnumber` VALUES ('4', '16枝');
INSERT INTO `flowerbranchnumber` VALUES ('5', '66枝');

-- ----------------------------
-- Table structure for `flowertype`
-- ----------------------------
DROP TABLE IF EXISTS `flowertype`;
CREATE TABLE `flowertype` (
  `flowerTypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '鲜花类型编号',
  `flowerTypeName` varchar(255) NOT NULL COMMENT '鲜花类型名称',
  PRIMARY KEY (`flowerTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flowertype
-- ----------------------------
INSERT INTO `flowertype` VALUES ('1', '卡通花束');
INSERT INTO `flowertype` VALUES ('2', '桌花');
INSERT INTO `flowertype` VALUES ('3', ' 开业花篮');
INSERT INTO `flowertype` VALUES ('4', ' 鲜花礼盒');
INSERT INTO `flowertype` VALUES ('5', ' 手捧花束');

-- ----------------------------
-- Table structure for `floweruse`
-- ----------------------------
DROP TABLE IF EXISTS `floweruse`;
CREATE TABLE `floweruse` (
  `flowerUseId` int(11) NOT NULL AUTO_INCREMENT COMMENT '鲜花用途编号',
  `flowerUseName` varchar(255) NOT NULL COMMENT '鲜花用途名称',
  PRIMARY KEY (`flowerUseId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of floweruse
-- ----------------------------
INSERT INTO `floweruse` VALUES ('1', '探病慰问');
INSERT INTO `floweruse` VALUES ('2', '老师长辈');
INSERT INTO `floweruse` VALUES ('3', '商务用花');
INSERT INTO `floweruse` VALUES ('4', '生日鲜花');
INSERT INTO `floweruse` VALUES ('5', '爱情鲜花');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `userAccount` varchar(255) NOT NULL COMMENT '用户账号',
  `userPassword` varchar(255) NOT NULL COMMENT '用户密码',
  `userName` varchar(255) NOT NULL COMMENT '用户姓名',
  `userMailbox` varchar(255) DEFAULT NULL COMMENT '用户邮箱',
  `userPhone` varchar(255) NOT NULL COMMENT '用户手机',
  `LeaveAMessage` varchar(255) DEFAULT NULL COMMENT '留言',
  `userHeadPortrait` varchar(255) DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2392573484', '2392573484', '刘琪', '2392573484@qq.com', '17679164807', '好', null);
