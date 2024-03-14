-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-03-2024 a las 09:43:02
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `caballeros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arma`
--

CREATE TABLE `arma` (
  `idArma` int(11) NOT NULL,
  `Daño` int(11) NOT NULL,
  `Durabilidad` int(11) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `Material` varchar(30) NOT NULL,
  `Nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `arma`
--

INSERT INTO `arma` (`idArma`, `Daño`, `Durabilidad`, `Velocidad`, `Material`, `Nombre`) VALUES
(1, 20, 100, 5, 'Hierro', 'Espada de Hierro'),
(2, 15, 80, 8, 'Madera', 'Arco de Madera'),
(3, 10, 90, 10, 'Acero', 'Daga de Acero'),
(4, 12, 85, 7, 'Roble', 'Bastón de Roble'),
(5, 25, 95, 4, 'Bronce', 'Maza de Bronce');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballeros`
--

CREATE TABLE `caballeros` (
  `idCaballero` int(11) NOT NULL,
  `idEcudero` int(11) NOT NULL,
  `idArma` int(11) NOT NULL,
  `idEscudo` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `FuerzaLucha` int(11) NOT NULL,
  `Habilidad` int(11) NOT NULL,
  `idCaballo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `caballeros`
--

INSERT INTO `caballeros` (`idCaballero`, `idEcudero`, `idArma`, `idEscudo`, `Nombre`, `FuerzaLucha`, `Habilidad`, `idCaballo`) VALUES
(1, 1, 1, 1, 'Sir Lancelot', 90, 0, 1),
(2, 2, 2, 1, 'Sir Robin', 80, 0, 2),
(3, 3, 3, 1, 'Sir Galahad', 85, 0, 3),
(4, 4, 1, 2, 'Sir Bedevere', 88, 0, 4),
(5, 5, 4, 2, 'Sir Percival', 87, 0, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `caballo`
--

CREATE TABLE `caballo` (
  `idCaballo` int(11) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `idCaballero` int(11) NOT NULL,
  `Color` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `caballo`
--

INSERT INTO `caballo` (`idCaballo`, `Velocidad`, `idCaballero`, `Color`) VALUES
(1, 30, 1, 'Blanco'),
(2, 35, 2, 'Marrón'),
(3, 25, 3, 'Negro'),
(4, 28, 4, 'Gris'),
(5, 32, 5, 'Alazán');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ecudero`
--

CREATE TABLE `ecudero` (
  `idEcudero` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `idCaballero` int(11) NOT NULL,
  `exp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ecudero`
--

INSERT INTO `ecudero` (`idEcudero`, `nombre`, `idCaballero`, `exp`) VALUES
(1, 'John', 1, 150),
(2, 'Peter', 2, 120),
(3, 'Michael', 3, 180),
(4, 'Robert', 4, 130),
(5, 'William', 5, 140);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escudo`
--

CREATE TABLE `escudo` (
  `idEscudo` int(11) NOT NULL,
  `Defensa` int(11) NOT NULL,
  `Durabilidad` int(11) NOT NULL,
  `Material` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `escudo`
--

INSERT INTO `escudo` (`idEscudo`, `Defensa`, `Durabilidad`, `Material`) VALUES
(1, 15, 90, 0),
(2, 20, 95, 0),
(3, 25, 100, 0),
(4, 18, 92, 0),
(5, 12, 85, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arma`
--
ALTER TABLE `arma`
  ADD PRIMARY KEY (`idArma`);

--
-- Indices de la tabla `caballeros`
--
ALTER TABLE `caballeros`
  ADD PRIMARY KEY (`idCaballero`),
  ADD KEY `idEscudo` (`idEscudo`),
  ADD KEY `idArma` (`idArma`),
  ADD KEY `idEcudero` (`idEcudero`),
  ADD KEY `idCaballo` (`idCaballo`);

--
-- Indices de la tabla `caballo`
--
ALTER TABLE `caballo`
  ADD PRIMARY KEY (`idCaballo`);

--
-- Indices de la tabla `ecudero`
--
ALTER TABLE `ecudero`
  ADD PRIMARY KEY (`idEcudero`);

--
-- Indices de la tabla `escudo`
--
ALTER TABLE `escudo`
  ADD PRIMARY KEY (`idEscudo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `arma`
--
ALTER TABLE `arma`
  MODIFY `idArma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `caballeros`
--
ALTER TABLE `caballeros`
  MODIFY `idCaballero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `caballo`
--
ALTER TABLE `caballo`
  MODIFY `idCaballo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `ecudero`
--
ALTER TABLE `ecudero`
  MODIFY `idEcudero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `escudo`
--
ALTER TABLE `escudo`
  MODIFY `idEscudo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `caballeros`
--
ALTER TABLE `caballeros`
  ADD CONSTRAINT `caballeros_ibfk_1` FOREIGN KEY (`idEcudero`) REFERENCES `ecudero` (`idEcudero`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `caballeros_ibfk_2` FOREIGN KEY (`idArma`) REFERENCES `arma` (`idArma`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `caballeros_ibfk_3` FOREIGN KEY (`idEscudo`) REFERENCES `escudo` (`idEscudo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `caballeros_ibfk_4` FOREIGN KEY (`idCaballo`) REFERENCES `caballo` (`idCaballo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
