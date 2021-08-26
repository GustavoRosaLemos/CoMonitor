-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26-Ago-2021 às 05:23
-- Versão do servidor: 10.4.19-MariaDB
-- versão do PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco_prog`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `emails`
--

CREATE DATABASE comonitor;
USE comonitor;

CREATE TABLE `emails` (
  `id` text NOT NULL,
  `type` text NOT NULL,
  `value` text NOT NULL,
  `employee_int` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `employees`
--

CREATE TABLE `employees` (
  `id` text NOT NULL,
  `fullName` text NOT NULL,
  `role` text NOT NULL,
  `section` text NOT NULL,
  `location` text NOT NULL,
  `infected` tinyint(1) NOT NULL,
  `immunized` tinyint(1) NOT NULL,
  `workMethod` text NOT NULL,
  `employeeld` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `enterprises`
--

CREATE TABLE `enterprises` (
  `id` text NOT NULL,
  `companyName` text NOT NULL,
  `fantasyName` text NOT NULL,
  `CNPJ` text NOT NULL,
  `employeesList` text NOT NULL,
  `displayName` text NOT NULL,
  `employees` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `phones`
--

CREATE TABLE `phones` (
  `id` text NOT NULL,
  `type` text NOT NULL,
  `ddd` text NOT NULL,
  `number` text NOT NULL,
  `employee_int` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `users`
--

CREATE TABLE `users` (
  `id` text NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL,
  `isAdmin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
