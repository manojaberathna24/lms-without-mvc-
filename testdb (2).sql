-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2024 at 02:54 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `addadmin`
--

CREATE TABLE `addadmin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `addadmin`
--

INSERT INTO `addadmin` (`username`, `password`) VALUES
('abc', '123'),
('abc', '123'),
('', ''),
('abc', '123');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookID` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookID`, `name`, `author`, `title`, `quantity`) VALUES
(1, 'the wall', 'peris', 'perisgmail.com', 8),
(2, 'artistic', 'shevon', 'shevon@gmail.com', 5),
(3, 'starlink', 'bilgates', 'briliyns@gmail.com', 25),
(4, 'roseflower', 'jonny', 'jonny@gmail.com', 15),
(5, 'sonic 2', 'kelvin', 'kelvin@gmail.com', 30),
(6, 'scuby', 'wiliyam', 'wiliyam2gmaail.com', 15);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `bookID` int(11) NOT NULL,
  `bookname` varchar(10) NOT NULL,
  `author` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `knowledge` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `issudate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`bookID`, `bookname`, `author`, `quantity`, `sid`, `sname`, `address`, `gender`, `knowledge`, `subject`, `issudate`) VALUES
(1, 'the wall', 'peris', 8, 2, 'charuka', 'weyangoda', 'female', 'java python ', 'Diploma in  Information Technology', '2024-06-13');

-- --------------------------------------------------------

--
-- Table structure for table `logindatabase`
--

CREATE TABLE `logindatabase` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logindatabase`
--

INSERT INTO `logindatabase` (`username`, `password`) VALUES
('manoj', '12345'),
('abc', '123'),
('xyz', '123'),
('pubudu', '123'),
('mnj', '123'),
('horizon', '123'),
('pubudu123', '123'),
('pubudu', '111');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE `returnbook` (
  `sid` int(20) NOT NULL,
  `sname` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `knowledge` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `bookid` int(20) NOT NULL,
  `bookname` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `issudate` date NOT NULL,
  `returndate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `returnbook`
--

INSERT INTO `returnbook` (`sid`, `sname`, `address`, `gender`, `knowledge`, `subject`, `bookid`, `bookname`, `author`, `issudate`, `returndate`) VALUES
(1, 'mnoj', 'kurungl', 'female', 'python ', 'Computer Science', 2, 'madolduwa', 'awedaw', '2024-05-03', '2024-05-03'),
(1, 'mnoj', 'kurungl', 'female', 'python ', 'Computer Science', 2, 'madolduwa', 'awedaw', '2024-05-03', '2024-05-10'),
(1, 'mnoj', 'kurungl', 'female', 'python ', 'Computer Science', 2, 'madolduwa', 'awedaw', '2024-05-03', '2024-05-09'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 1, 'harypotter', 'martin', '2024-05-10', '2024-05-03'),
(3, 'nayomi', 'bambalapitiya', 'female', 'java python ', 'Computer Science', 4, 'vikings', 'nishaman', '2024-05-09', '2024-05-16'),
(1, 'mnoj', 'kurungl', 'female', 'python ', 'Computer Science', 2, 'madolduwa', 'kabir', '2024-05-14', '2024-05-16'),
(3, 'nayomi', 'bambalapitiya', 'female', 'java python ', 'Computer Science', 2, 'madolduwa', 'kabir', '2024-05-01', '2024-05-10'),
(3, 'nayomi', 'bambalapitiya', 'female', 'java python ', 'Computer Science', 2, 'madolduwa', 'kabir', '2024-05-01', '2024-05-09'),
(1, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 4, 'vikings', 'nishaman', '2024-05-09', '2024-05-08'),
(1, 'mnoj', 'kurungl', 'female', 'python ', 'Computer Science', 3, 'yakari', 'thiyuli', '2024-05-08', '2024-05-23'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 4, 'vikings', 'nishaman', '2024-05-09', '2024-05-17'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 4, 'vikings', 'nishaman', '2024-05-09', '2024-05-17'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 1, 'the wall', 'martin', '2024-05-07', '2024-05-10'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 1, 'the wall', 'peris', '2024-05-06', '2024-05-17'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 3, 'star', 'briliyns', '2024-05-15', '2024-05-10'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 1, 'the wall', 'peris', '2024-05-10', '2024-06-06'),
(4, 'nayomi', 'homagama', 'female', 'python ', 'Diploma in  Information Technology', 1, 'the wall', 'peris', '2024-06-13', '2024-06-13'),
(1, 'mnoj', 'kurungl', 'male', 'java ', 'Computer Science', 1, 'the wall', 'peris', '2024-06-02', '2024-06-13'),
(1, 'mnoj', 'kurungl', 'male', 'java ', 'Computer Science', 1, 'the wall', 'peris', '2024-06-11', '2024-06-07'),
(4, 'nayomi', 'homagama', 'female', 'python ', 'Diploma in  Information Technology', 1, 'the wall', 'peris', '2024-06-13', '2024-06-15'),
(2, 'chruk', 'weyangoda', 'female', 'java python ', 'Computer Science', 2, 'artistic', 'shevon', '2024-06-19', '2024-06-14'),
(4, 'nayomi', 'colombo', 'male', 'python ', 'Computer Science', 1, 'the wall', 'peris', '2024-06-19', '2024-06-13');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `sno` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `knowledge` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`sno`, `name`, `address`, `gender`, `knowledge`, `subject`) VALUES
(1, 'mnoj', 'kurungl', 'male', 'java ', 'Computer Science'),
(2, 'charuka', 'weyangoda', 'female', 'java python ', 'Diploma in  Information Technology'),
(3, 'chamika', 'colombo', 'male', 'java python ', 'Degree Information Technology');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bookID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`sno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
