-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
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


-- Dumping database structure for quan_ly_kho_hang_spring_boot
CREATE DATABASE IF NOT EXISTS `quan_ly_kho_hang_spring_boot` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quan_ly_kho_hang_spring_boot`;

-- Dumping structure for table quan_ly_kho_hang_spring_boot.categories
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.categories: ~4 rows (approximately)
REPLACE INTO `categories` (`id`, `description`, `name`) VALUES
	(1, 'sản phẩm mới giá bình dân', 'điều hòa'),
	(2, 'sản phẩm giá rẻ chất lượng cao', 'Ti vi'),
	(3, 'sản phẩm giá rẻ chất lượng cao', 'Tủ lạnh'),
	(4, 'sản phẩm giá rẻ chất lượng cao', 'máy giặt');

-- Dumping structure for table quan_ly_kho_hang_spring_boot.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.customer: ~2 rows (approximately)
REPLACE INTO `customer` (`id`, `address`, `email`, `name`) VALUES
	(1, 'hà đông - hà nội', 'c1@gmail.com', 'nguyen van c1'),
	(2, 'Hà Nội', 'c2@gmail.com', 'nguyễn văn c2');

-- Dumping structure for table quan_ly_kho_hang_spring_boot.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `positon` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `warehouse_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKm7i6oxl8m436bvfrsmleyjdwc` (`warehouse_id`),
  CONSTRAINT `FKm7i6oxl8m436bvfrsmleyjdwc` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.employee: ~3 rows (approximately)
REPLACE INTO `employee` (`id`, `name`, `positon`, `warehouse_id`) VALUES
	(1, 'nguyễn văn ab', 'nhân viên', 1),
	(2, 'nguyễn văn bc', 'nhân viên', 1),
	(3, 'nguyễn văn cd', 'nhân viên', 2);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.inventory
CREATE TABLE IF NOT EXISTS `inventory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quantity` float DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `warehouse_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKp7gj4l80fx8v0uap3b2crjwp5` (`product_id`),
  KEY `FKix9yxgetau1y25hhnv42gsiok` (`warehouse_id`),
  CONSTRAINT `FKix9yxgetau1y25hhnv42gsiok` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`id`),
  CONSTRAINT `FKp7gj4l80fx8v0uap3b2crjwp5` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.inventory: ~2 rows (approximately)
REPLACE INTO `inventory` (`id`, `quantity`, `product_id`, `warehouse_id`) VALUES
	(1, 3, 1, 1),
	(2, 6, 3, 1);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `price` float DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKowomku74u72o6h8q0khj7id8q` (`category_id`),
  CONSTRAINT `FKowomku74u72o6h8q0khj7id8q` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.product: ~10 rows (approximately)
REPLACE INTO `product` (`id`, `description`, `name`, `price`, `category_id`) VALUES
	(1, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu1', 0, 1),
	(2, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu2', 0, 1),
	(3, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu3', 0, 1),
	(4, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu4', 0, 1),
	(5, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu5', 0, 1),
	(6, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu6', 0, 1),
	(7, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu7', 0, 1),
	(8, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu8', 0, 1),
	(9, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu9', 0, 1),
	(10, 'điều hòa cho gia đình', 'điều hòa nagakawa 18000btu10', 0, 1);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.purchaseorder
CREATE TABLE IF NOT EXISTS `purchaseorder` (
  `id` int NOT NULL AUTO_INCREMENT,
  `orderdate` datetime(6) DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  `supplier_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnpturxa2eanharutd1hrtomgy` (`employee_id`),
  KEY `FK4lfwegli3tmskxmsuelufupbn` (`supplier_id`),
  CONSTRAINT `FK4lfwegli3tmskxmsuelufupbn` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`),
  CONSTRAINT `FKnpturxa2eanharutd1hrtomgy` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.purchaseorder: ~2 rows (approximately)
REPLACE INTO `purchaseorder` (`id`, `orderdate`, `employee_id`, `supplier_id`) VALUES
	(1, NULL, 1, 1),
	(2, NULL, 1, 1);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.purchaseorderdedail
CREATE TABLE IF NOT EXISTS `purchaseorderdedail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` float DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `purchaseorder_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs2otvxjm9sqe4lillnbhy858q` (`product_id`),
  KEY `FK18jubxi7ly59b2p6dxikx7emq` (`purchaseorder_id`),
  CONSTRAINT `FK18jubxi7ly59b2p6dxikx7emq` FOREIGN KEY (`purchaseorder_id`) REFERENCES `purchaseorder` (`id`),
  CONSTRAINT `FKs2otvxjm9sqe4lillnbhy858q` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.purchaseorderdedail: ~2 rows (approximately)
REPLACE INTO `purchaseorderdedail` (`id`, `price`, `quantity`, `product_id`, `purchaseorder_id`) VALUES
	(1, 4000000, 12, 1, 1),
	(2, 4000000, 12, 1, 2);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.saleorder
CREATE TABLE IF NOT EXISTS `saleorder` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_date` datetime(6) DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdefu7ug9sae1tab65hokt3922` (`customer_id`),
  KEY `FKpvrfl8h823721ma0jwprfb6eb` (`employee_id`),
  CONSTRAINT `FKdefu7ug9sae1tab65hokt3922` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `FKpvrfl8h823721ma0jwprfb6eb` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.saleorder: ~2 rows (approximately)
REPLACE INTO `saleorder` (`id`, `order_date`, `customer_id`, `employee_id`) VALUES
	(1, NULL, 1, 1),
	(2, NULL, 1, 1);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.sale_order_detail
CREATE TABLE IF NOT EXISTS `sale_order_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` float DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `sale_order_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi9wlxjjfrmt8opxodlj6s2ujy` (`product_id`),
  KEY `FKr5dddlm0t6dcr4b3xd2waec33` (`sale_order_id`),
  CONSTRAINT `FKi9wlxjjfrmt8opxodlj6s2ujy` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `FKr5dddlm0t6dcr4b3xd2waec33` FOREIGN KEY (`sale_order_id`) REFERENCES `saleorder` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.sale_order_detail: ~2 rows (approximately)
REPLACE INTO `sale_order_detail` (`id`, `price`, `quantity`, `product_id`, `sale_order_id`) VALUES
	(1, NULL, 4, 1, 1),
	(2, NULL, 4, 1, 2);

-- Dumping structure for table quan_ly_kho_hang_spring_boot.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.supplier: ~2 rows (approximately)
REPLACE INTO `supplier` (`id`, `address`, `email`, `name`, `phone`) VALUES
	(1, 'hà đông - hà nội', 'a@gmail.com', 'ncc1', '34235235252'),
	(2, 'cầu giấy - hà nội', 'b@gmail.com', 'ncc2', '52323523');

-- Dumping structure for table quan_ly_kho_hang_spring_boot.warehouse
CREATE TABLE IF NOT EXISTS `warehouse` (
  `id` int NOT NULL AUTO_INCREMENT,
  `location` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Dumping data for table quan_ly_kho_hang_spring_boot.warehouse: ~2 rows (approximately)
REPLACE INTO `warehouse` (`id`, `location`, `name`) VALUES
	(1, 'Hà đông - Hà Nội', 'kho 1'),
	(2, 'Hoàng Mai - Hà Nội', 'kho 2');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
