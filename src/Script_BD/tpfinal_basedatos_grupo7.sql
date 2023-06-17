-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 17-06-2023 a las 04:09:49
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tpfinal_basedatos_grupo7`
--
CREATE DATABASE IF NOT EXISTS `tpfinal_basedatos_grupo7` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `tpfinal_basedatos_grupo7`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE IF NOT EXISTS `comentarios` (
  `Id_Comentarios` int(11) NOT NULL AUTO_INCREMENT,
  `Comentarios` varchar(30) NOT NULL,
  `Fecha_Avance` date NOT NULL,
  `Id_Tarea` int(11) NOT NULL,
  PRIMARY KEY (`Id_Comentarios`) USING BTREE,
  KEY `Id_Tarea` (`Id_Tarea`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE IF NOT EXISTS `equipo` (
  `Id_Equipo` int(11) NOT NULL AUTO_INCREMENT,
  `Id_Proyecto` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Fecha_Creacion` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id_Equipo`),
  KEY `Id_Proyecto` (`Id_Proyecto`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`Id_Equipo`, `Id_Proyecto`, `Nombre`, `Fecha_Creacion`, `Estado`) VALUES
(13, 5, 'Dinamita', '2023-06-13', 1),
(17, 5, 'Dinamita', '2023-06-13', 1),
(20, 5, 'Dinamita', '2023-06-13', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo_miembros`
--

CREATE TABLE IF NOT EXISTS `equipo_miembros` (
  `Id_MiembroEq` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha_Incoporacion` date NOT NULL,
  `Id_Equipo` int(11) NOT NULL,
  `Id_Miembro` int(11) NOT NULL,
  PRIMARY KEY (`Id_MiembroEq`) USING BTREE,
  KEY `Id_Equipo` (`Id_Equipo`),
  KEY `Id_Miembro` (`Id_Miembro`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembro`
--

CREATE TABLE IF NOT EXISTS `miembro` (
  `Id_Miembro` int(11) NOT NULL AUTO_INCREMENT,
  `DNI` int(11) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id_Miembro`),
  UNIQUE KEY `DNI` (`DNI`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `miembro`
--

INSERT INTO `miembro` (`Id_Miembro`, `DNI`, `Apellido`, `Nombre`, `Estado`) VALUES
(15, 29960012, 'Moll Montiveros', 'Jesica', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE IF NOT EXISTS `proyecto` (
  `Id_Proyecto` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) NOT NULL,
  `Descripcion` varchar(30) NOT NULL,
  `Fecha_Inicio` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id_Proyecto`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`Id_Proyecto`, `Nombre`, `Descripcion`, `Fecha_Inicio`, `Estado`) VALUES
(5, 'Proyecto 1', 'Compilar base de datos', '2023-06-13', 1),
(6, 'Proyecto 1', 'Compilar base de datos', '2023-06-13', 1),
(7, 'Pruebaa', 'Probar-BD', '2023-06-16', 1),
(8, 'Pruebaa2', 'Prueba BD2', '2023-06-16', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea`
--

CREATE TABLE IF NOT EXISTS `tarea` (
  `Id_Tarea` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) NOT NULL,
  `Fecha_Creacion` date NOT NULL,
  `Fecha_Cierre` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Id_MiembroEq` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id_Tarea`),
  KEY `Id_MiembrosEq` (`Id_MiembroEq`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tarea`
--

INSERT INTO `tarea` (`Id_Tarea`, `Nombre`, `Fecha_Creacion`, `Fecha_Cierre`, `Estado`, `Id_MiembroEq`) VALUES
(1, 'Prueba', '2023-06-13', '2023-08-13', 1, NULL);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD CONSTRAINT `comentarios_ibfk_1` FOREIGN KEY (`Id_Tarea`) REFERENCES `tarea` (`Id_Tarea`);

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_3` FOREIGN KEY (`Id_Proyecto`) REFERENCES `proyecto` (`Id_Proyecto`);

--
-- Filtros para la tabla `equipo_miembros`
--
ALTER TABLE `equipo_miembros`
  ADD CONSTRAINT `equipo_miembros_ibfk_1` FOREIGN KEY (`Id_Miembro`) REFERENCES `miembro` (`Id_Miembro`),
  ADD CONSTRAINT `equipo_miembros_ibfk_2` FOREIGN KEY (`Id_Equipo`) REFERENCES `equipo` (`Id_Equipo`);

--
-- Filtros para la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD CONSTRAINT `tarea_ibfk_1` FOREIGN KEY (`Id_MiembroEq`) REFERENCES `equipo_miembros` (`Id_MiembroEq`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
