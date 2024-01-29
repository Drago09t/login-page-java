-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for login_form
CREATE DATABASE IF NOT EXISTS `login_form` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `login_form`;

-- Dumping structure for table login_form.admin_table
CREATE TABLE IF NOT EXISTS `admin_table` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table login_form.admin_table: ~0 rows (approximately)
INSERT INTO `admin_table` (`id`, `name`, `email`) VALUES
	(1, 'abc', 'abc@123');

-- Dumping structure for table login_form.student_table
CREATE TABLE IF NOT EXISTS `student_table` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table login_form.student_table: ~0 rows (approximately)
INSERT INTO `student_table` (`id`, `name`, `email`) VALUES
	(1, '1', '1'),
	(1, 'azmat', 'abc');

-- Dumping structure for table login_form.teacher_table
CREATE TABLE IF NOT EXISTS `teacher_table` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table login_form.teacher_table: ~0 rows (approximately)
INSERT INTO `teacher_table` (`id`, `name`, `email`) VALUES
	(1, '1', '2'),
	(1, 'abc', 'abc');

-- Dumping structure for table login_form.user
CREATE TABLE IF NOT EXISTS `user` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table login_form.user: ~3 rows (approximately)
INSERT INTO `user` (`first_name`, `last_name`, `username`, `email`, `password`, `age`, `address`, `gender`) VALUES
	('Azmat', 'Mustafa', 'azmat890', 'azmatmustafa979@gmail.com', 'abc123', '222', 'street no  9 ', 'Male'),
	('azmat', 'mustafa', 'azm890', 'azmatmustafa@gmail.com', 'abc123', '22', 'streeet no 9', 'Male'),
	('shykh', 'gandu', 'shykhgandu', 'shykhgandu@gmail.com', 'abc123', '22', 'street 9 ', 'Female'),
	('abc', 'abc', 'drago09090', 'abc@gmail.com', 'abc123', '22', 'street no 9', 'Male');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
