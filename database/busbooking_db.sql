-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 27, 2018 at 02:07 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `busbooking_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` varchar(10) NOT NULL,
  `admin_name` varchar(20) NOT NULL,
  `admin_password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_password`) VALUES
('adm1', 'Thasneem', '987654');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `ref_no` varchar(50) NOT NULL,
  `bus_id` varchar(10) NOT NULL,
  `emp_id` varchar(10) NOT NULL,
  `num_of_seat` varchar(10) NOT NULL,
  `seat_no` varchar(50) NOT NULL,
  `date` varchar(15) NOT NULL,
  `amount` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`ref_no`, `bus_id`, `emp_id`, `num_of_seat`, `seat_no`, `date`, `amount`) VALUES
('B12018-08-03s42', 'B1', 'Emp1', ' 2', ' s42 ,s46 ,', '2018-08-03', '2000'),
('B12018-08-03s41', 'B1', 'Emp1', ' 2', ' s41 ,s48 ,', '2018-08-03', '2000'),
('B12018-08-03s9', 'B1', 'Emp1', ' 4', ' s9 ,s18 ,s19 ,s45 ,', '2018-08-03', '4000');

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `bus_id` varchar(10) NOT NULL,
  `route_no` varchar(10) NOT NULL,
  `bus_no` varchar(20) NOT NULL,
  `bus_time` varchar(15) NOT NULL,
  `bus_from` varchar(30) NOT NULL,
  `bus_to` varchar(30) NOT NULL,
  `amount` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`bus_id`, `route_no`, `bus_no`, `bus_time`, `bus_from`, `bus_to`, `amount`) VALUES
('B1', '123', 'BDQ 8029', '08.30', 'Sammanthurai', 'Colombo', '1000'),
('B1', '123', 'BDQ 8029', '08.30', 'Sammanthurai', 'Colombo', '1000'),
('B2', '135', 'GU 4043', '06.30', 'Jaffna', 'Colombo', '1200'),
('B3', '456', 'NA 3035', '08.30', 'Colombo', 'Sammanthurai', '1000'),
('B3', '456', 'NA 3035', '08.30', 'Colombo', 'Sammanthurai', '1000'),
('B4', '789', 'NI 8029', '03.30', 'Sammanthurai', 'Colombo', '1000'),
('B4', '789', 'NI 8029', '03.30', 'Sammanthurai', 'Colombo', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ref_no` varchar(20) DEFAULT NULL,
  `cus_name` varchar(25) NOT NULL,
  `cus_nic` varchar(10) NOT NULL,
  `cus_phone` varchar(10) NOT NULL,
  `cus_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ref_no`, `cus_name`, `cus_nic`, `cus_phone`, `cus_address`) VALUES
('B12018-08-02s3', 'Thasneem', '0774065294', '962032346v', '188,ampara road , sammanthurai-02'),
('B12018-08-02s4', 'ljkhc', 'koiyu', 'piohu', 'piouuy'),
('B12018-08-02s3', 'khjh', 'jlkhu', 'poutufy', 'joiuf'),
('B12018-08-02s24', 'ssdasawea', 'waewa', 'awea', 'awea'),
('B12018-08-02s21', 'ujnhbtvrfc', 'bvrfcdx', 'bvfd', 'tfrde'),
('B12018-08-02s21', 'ujnhbtvrfc', 'bvrfcdx', 'bvfd', 'tfrde'),
('B12018-08-02s21', 'ujnhbtvrfc', 'bvrfcdx', 'bvfd', 'tfrde'),
('B12018-08-02s31', 'u98yyt', 'ouiuyft', 'oiuyf', 'ouiyuf'),
('B12018-08-02s25', 'kiujyhtrfed', 'nytrfedws', 'uhytfred', 'uynbtrve'),
('B12018-08-02s20', 'jihuyft', 'jihuyftdr', 'ojiuyft', 'joiuyft'),
('B12018-08-02s30', 'oiuyf', 'jihuyf', 'ojiuy', 'kpojihuy'),
('B12018-08-02s17', 'pkohiuy', 'ljhh', 'kljhc', 'kojih'),
('B12018-08-02s15', 'ojuyft', 'oiyutyft', 'huytf', 'jiyuyftd'),
('B12018-08-02s2', 'uyvtc', 'ojiuy', 'mbhv', 'ijhuy'),
('B12018-08-02s1', 'pioy', 'ljuf', 'ljkhf', 'kyutt'),
('B12018-08-02s7', 'jihuy', 'ihuyf', 'jihuyf', 'iyuyft'),
('B12018-08-02s43', 'huyft', 'khuy', 'jihuytf', 'ojihuy'),
('B12018-08-02s45', 'ijuhytrfd', 'juhytfrde', 'jnyhtrf', 'ytfrde'),
('B12018-08-02s38', 'ijuhy', 'uhyt', 'hyt', 'ytr'),
('B12018-08-02s28', 'hytfr', 'hytf', 'nyhbtvrfc', 'hbtvf'),
('B12018-08-02s18', 'fdtrfed', 'yhtrfew', 'ytre', 'yt5r4e3w'),
('B12018-08-02s8', 'iyuyft', 'ouiuy', 'ouy8y', 'ouy8ty'),
('B12018-08-02s52', 'ouiy', 'iyutyt', 'ouytyt', 'joiuyft'),
('B12018-08-02s51', 'oiuy', 'joiuh', 'ljhv', 'kojiuh'),
('B12018-08-02s50', 'juhytrf', 'hytfr', 'hytfr', 'uj7hytf'),
('B12018-08-02s49', 'juhyf', 'hytrf', 'yhtrfdtfrd', 'tfr'),
('B12018-08-02s48', 'q', 'werty', '23rtr', '3245'),
('B12018-08-02s47', 'uyft', 'ojihuy', 'i9u8', 'hu'),
('B12018-08-03s3', 'jcjihu', 'u', 'kuy8', 'ojhuy'),
('B12018-08-03s14', 'i9y8t', 'piouuy', 'koiuyf', 'ohiu'),
('B12018-08-03s24', 'swdef', 'sadfv', 'swdf', 'werf'),
('B12018-08-03s22', 'huy', 'huyv', 'jiuy', 'jhuy'),
('B12018-08-03s33', 'y8', 'y87ttd', 'jyuyft', 'jiuyft'),
('B12018-08-03s31', 'ouy', 'ouiy', 'ouy', 'joiuy'),
('B12018-08-03s5', 'uyty', 'u9ty', 'piuyuy', 'kohi'),
('B12018-08-03s2', 'iuyutft', 'oiuyf', 'khuyf', 'hiuy'),
('B12018-08-03s30', 'rewt', '', '', ''),
('B12018-08-03s1', 'ihuyft', 'jihuyf', 'jhuyf', 'hiuyftc'),
('B12018-08-03s7', 'jihuyf', 'uy', 'khy', 'nuytc'),
('B12018-08-03s43', 'huytf', 'uyt', 'hu', 'jiy'),
('B12018-08-03s39', 'de', '22e3', '23r', 'qwer'),
('B12018-08-03s42', 'huyftdr', 'u8y7f', 'jy87f', 'huyft'),
('B12018-08-03s41', 'jihuyftjihuytc', 'kjhuy', 'kihuy', 'ojiuy'),
('B12018-08-03s9', 'yft', 'huyft', 'mkh', 'njbv');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_id` varchar(10) NOT NULL,
  `emp_name` varchar(25) NOT NULL,
  `emp_nic` varchar(10) NOT NULL,
  `emp_phone` varchar(10) NOT NULL,
  `emp_address` varchar(50) NOT NULL,
  `emp_mail` varchar(30) NOT NULL,
  `emp_password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `emp_name`, `emp_nic`, `emp_phone`, `emp_address`, `emp_mail`, `emp_password`) VALUES
('', 'jkh', '', '', '\n\n\n\n', '', ''),
('Emp1', 'Thasneem', '962032346v', '0774065294', '\n188,Ampara Road,\nSammanthurai-02\n\n\n', 'amythasneem@gmail.com', '123456'),
(' jbu', ' mknj', ' ljj', ' mlknj', ' mknjb', ' knj', 'njbh');

-- --------------------------------------------------------

--
-- Table structure for table `seat`
--

CREATE TABLE `seat` (
  `bus_id` varchar(10) NOT NULL,
  `date` varchar(15) NOT NULL,
  `ref_no` varchar(50) NOT NULL,
  `seat_no` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seat`
--

INSERT INTO `seat` (`bus_id`, `date`, `ref_no`, `seat_no`) VALUES
('bus1', '1 aug 18', 'ref10', 's23'),
('bus1', '1 aug 18', 'ref10', 's33'),
('bus1', '1 aug 18', 'ref10', 's32'),
('bus1', '1 aug 18', 'ref10', 's35'),
('bus1', '1 aug 18', 'ref10', 's42'),
('B1', '2018-08-02', 'B12018-08-02s3', 's3'),
('B1', '2018-08-02', 'B12018-08-02s3', 's4'),
('B1', '2018-08-02', 'B12018-08-02s3', 's13'),
('B1', '2018-08-02', 'B12018-08-02s3', 's14'),
('B1', '2018-08-02', 'B12018-08-02s24', 's24'),
('B1', '2018-08-02', 'B12018-08-02s24', 's34'),
('B1', '2018-08-02', 'B12018-08-02s21', 's21'),
('B1', '2018-08-02', 'B12018-08-02s21', 's22'),
('B1', '2018-08-02', 'B12018-08-02s21', 's26'),
('B1', '2018-08-02', 'B12018-08-02s31', 's31'),
('B1', '2018-08-02', 'B12018-08-02s31', 's32'),
('B1', '2018-08-02', 'B12018-08-02s25', 's25'),
('B1', '2018-08-02', 'B12018-08-02s25', 's36'),
('B1', '2018-08-02', 'B12018-08-02s20', 's20'),
('B1', '2018-08-02', 'B12018-08-02s20', 's23'),
('B1', '2018-08-02', 'B12018-08-02s20', 's27'),
('B1', '2018-08-02', 'B12018-08-02s20', 's33'),
('B1', '2018-08-02', 'B12018-08-02s30', 's30'),
('B1', '2018-08-02', 'B12018-08-02s30', 's35'),
('B1', '2018-08-02', 'B12018-08-02s30', 's37'),
('B1', '2018-08-02', 'B12018-08-02s17', 's17'),
('B1', '2018-08-02', 'B12018-08-02s17', 's40'),
('B1', '2018-08-02', 'B12018-08-02s17', 's41'),
('B1', '2018-08-02', 'B12018-08-02s15', 's15'),
('B1', '2018-08-02', 'B12018-08-02s15', 's16'),
('B1', '2018-08-02', 'B12018-08-02s2', 's2'),
('B1', '2018-08-02', 'B12018-08-02s2', 's5'),
('B1', '2018-08-02', 'B12018-08-02s2', 's12'),
('B1', '2018-08-02', 'B12018-08-02s1', 's1'),
('B1', '2018-08-02', 'B12018-08-02s1', 's6'),
('B1', '2018-08-02', 'B12018-08-02s1', 's11'),
('B1', '2018-08-02', 'B12018-08-02s1', 's42'),
('B1', '2018-08-02', 'B12018-08-02s7', 's7'),
('B1', '2018-08-02', 'B12018-08-02s7', 's10'),
('B1', '2018-08-02', 'B12018-08-02s43', 's43'),
('B1', '2018-08-02', 'B12018-08-02s43', 's44'),
('B1', '2018-08-02', 'B12018-08-02s45', 's45'),
('B1', '2018-08-02', 'B12018-08-02s45', 's46'),
('B1', '2018-08-02', 'B12018-08-02s38', 's38'),
('B1', '2018-08-02', 'B12018-08-02s38', 's39'),
('B1', '2018-08-02', 'B12018-08-02s28', 's28'),
('B1', '2018-08-02', 'B12018-08-02s28', 's29'),
('B1', '2018-08-02', 'B12018-08-02s18', 's18'),
('B1', '2018-08-02', 'B12018-08-02s18', 's19'),
('B1', '2018-08-02', 'B12018-08-02s8', 's8'),
('B1', '2018-08-02', 'B12018-08-02s8', 's9'),
('B1', '2018-08-02', 'B12018-08-02s52', 's52'),
('B1', '2018-08-02', 'B12018-08-02s51', 's51'),
('B1', '2018-08-02', 'B12018-08-02s50', 's50'),
('B1', '2018-08-02', 'B12018-08-02s49', 's49'),
('B1', '2018-08-02', 'B12018-08-02s48', 's48'),
('B1', '2018-08-02', 'B12018-08-02s47', 's47'),
('B1', '2018-08-03', 'B12018-08-03s3', 's3'),
('B1', '2018-08-03', 'B12018-08-03s3', 's4'),
('B1', '2018-08-03', 'B12018-08-03s3', 's13'),
('B1', '2018-08-03', 'B12018-08-03s14', 's14'),
('B1', '2018-08-03', 'B12018-08-03s14', 's15'),
('B1', '2018-08-03', 'B12018-08-03s14', 's16'),
('B1', '2018-08-03', 'B12018-08-03s14', 's21'),
('B1', '2018-08-03', 'B12018-08-03s24', 's24'),
('B1', '2018-08-03', 'B12018-08-03s24', 's25'),
('B1', '2018-08-03', 'B12018-08-03s24', 's26'),
('B1', '2018-08-03', 'B12018-08-03s22', 's22'),
('B1', '2018-08-03', 'B12018-08-03s22', 's23'),
('B1', '2018-08-03', 'B12018-08-03s33', 's33'),
('B1', '2018-08-03', 'B12018-08-03s33', 's34'),
('B1', '2018-08-03', 'B12018-08-03s33', 's35'),
('B1', '2018-08-03', 'B12018-08-03s31', 's31'),
('B1', '2018-08-03', 'B12018-08-03s31', 's32'),
('B1', '2018-08-03', 'B12018-08-03s31', 's36'),
('B1', '2018-08-03', 'B12018-08-03s5', 's5'),
('B1', '2018-08-03', 'B12018-08-03s5', 's11'),
('B1', '2018-08-03', 'B12018-08-03s5', 's12'),
('B1', '2018-08-03', 'B12018-08-03s2', 's2'),
('B1', '2018-08-03', 'B12018-08-03s2', 's6'),
('B1', '2018-08-03', 'B12018-08-03s30', 's30'),
('B1', '2018-08-03', 'B12018-08-03s30', 's37'),
('B1', '2018-08-03', 'B12018-08-03s30', 's40'),
('B1', '2018-08-03', 'B12018-08-03s1', 's1'),
('B1', '2018-08-03', 'B12018-08-03s1', 's44'),
('B1', '2018-08-03', 'B12018-08-03s1', 's47'),
('B1', '2018-08-03', 'B12018-08-03s1', 's52'),
('B1', '2018-08-03', 'B12018-08-03s7', 's7'),
('B1', '2018-08-03', 'B12018-08-03s7', 's10'),
('B1', '2018-08-03', 'B12018-08-03s7', 's27'),
('B1', '2018-08-03', 'B12018-08-03s43', 's43'),
('B1', '2018-08-03', 'B12018-08-03s43', 's50'),
('B1', '2018-08-03', 'B12018-08-03s39', 's39'),
('B1', '2018-08-03', 'B12018-08-03s39', 's49'),
('B1', '2018-08-03', 'B12018-08-03s42', 's42'),
('B1', '2018-08-03', 'B12018-08-03s42', 's46'),
('B1', '2018-08-03', 'B12018-08-03s41', 's41'),
('B1', '2018-08-03', 'B12018-08-03s41', 's48'),
('B1', '2018-08-03', 'B12018-08-03s9', 's9'),
('B1', '2018-08-03', 'B12018-08-03s9', 's18'),
('B1', '2018-08-03', 'B12018-08-03s9', 's19'),
('B1', '2018-08-03', 'B12018-08-03s9', 's45');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
