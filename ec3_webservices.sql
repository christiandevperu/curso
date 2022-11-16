/*
 Navicat Premium Data Transfer

 Source Server         : ConexionMySQL
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : ec3_webservices

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 16/11/2022 10:57:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for alumno
-- ----------------------------
DROP TABLE IF EXISTS `alumno`;
CREATE TABLE `alumno`  (
  `id_alumno` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `apellidos` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `edad` int NULL DEFAULT NULL,
  PRIMARY KEY (`id_alumno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of alumno
-- ----------------------------
INSERT INTO `alumno` VALUES (1, 'Christian', 'Huaman', 20);
INSERT INTO `alumno` VALUES (2, 'Martin', 'Chavez', 21);

-- ----------------------------
-- Table structure for alumno_curso
-- ----------------------------
DROP TABLE IF EXISTS `alumno_curso`;
CREATE TABLE `alumno_curso`  (
  `id_alumno_curso` int NOT NULL,
  `id_alumno` int NULL DEFAULT NULL,
  `id_curso` int NULL DEFAULT NULL,
  PRIMARY KEY (`id_alumno_curso`) USING BTREE,
  INDEX `alumno_curso_fk0`(`id_alumno` ASC) USING BTREE,
  INDEX `alumno_curso_fk1`(`id_curso` ASC) USING BTREE,
  CONSTRAINT `alumno_curso_fk0` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`id_alumno`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `alumno_curso_fk1` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`id_curso`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of alumno_curso
-- ----------------------------
INSERT INTO `alumno_curso` VALUES (1, 1, 1);
INSERT INTO `alumno_curso` VALUES (2, 2, 1);

-- ----------------------------
-- Table structure for curso
-- ----------------------------
DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso`  (
  `id_curso` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id_curso`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of curso
-- ----------------------------
INSERT INTO `curso` VALUES (1, 'Programacion');

SET FOREIGN_KEY_CHECKS = 1;
