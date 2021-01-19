/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50711
 Source Host           : localhost:3306
 Source Schema         : maven

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : 65001

 Date: 19/01/2021 10:52:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` float(10, 0) NULL DEFAULT NULL,
  `pic` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createtime` datetime(0) NULL DEFAULT NULL,
  `detail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of items
-- ----------------------------
INSERT INTO `items` VALUES (1, '传智播客', 1000, NULL, '2018-03-13 09:29:30', '带我走上人生巅峰');
INSERT INTO `items` VALUES (2, '黑马310', NULL, NULL, '2018-03-28 10:05:52', '插入测试');
INSERT INTO `items` VALUES (3, '黑马307', 199, NULL, '2018-03-07 10:08:04', '插入测试');
INSERT INTO `items` VALUES (7, '插入测试', NULL, NULL, NULL, NULL);
INSERT INTO `items` VALUES (8, '插入测试', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
