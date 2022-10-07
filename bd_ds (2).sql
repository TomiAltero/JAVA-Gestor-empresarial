-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-09-2022 a las 13:17:21
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ds`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividades`
--

CREATE TABLE `actividades` (
  `ID` int(11) NOT NULL,
  `Tipo_sistema` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Precio` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Estatus` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Exp_Principal` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `proj_dirigido` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `proposito` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `prin_func` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `Tipo_lenguaje` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Dia_registrado` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Mes_registrado` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Año_registrado` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `id_cliente` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `actividades`
--

INSERT INTO `actividades` (`ID`, `Tipo_sistema`, `Precio`, `Estatus`, `Exp_Principal`, `proj_dirigido`, `proposito`, `prin_func`, `Tipo_lenguaje`, `Dia_registrado`, `Mes_registrado`, `Año_registrado`, `id_cliente`) VALUES
(5, 'Pagina WEB', '5000', 'Nuevo ingreso', 'Gestor de gastos', 'egregrege', 'brebeber', 'rebebebre', 'Python', '12', '8', '2022', 1),
(6, 'IA(Inteligencia Artificial)', '6800', 'Nuevo ingreso', 'Gestor de gastos', 'para usuarios', 'expandir en todos los paises del mundo', 'modificar datos, leer datos, borrar datos', 'JavaScript', '12', '8', '2022', 1),
(7, 'Sistema de escritorio', '60000USD', 'Nuevo ingreso', 'Sistema de ordenamiento de archivo', 'nashee', 'nasheee', 'nasheee', 'C++', '12', '8', '2022', 2),
(8, 'IA(Inteligencia Artificial)', '60000 ARS', 'Nuevo ingreso', 'w,kjergjn', 'wjkrbrjegbojren', 'berberbe', 'l;erkng;ren', 'Python', '13', '8', '2022', 1),
(9, 'Pagina WEB', '67888 USD', 'Nuevo ingreso', 'rgergrg', 'egergreg', 'gregre', 'regregre', 'JAVA', '13', '8', '2022', 3),
(10, 'Pagina WEB', '645654 USD', 'Nuevo ingreso', 'lkwqngoirweignoi', 'wejkbgkwebg', 'gregreger', 'kwebjgkj3bgjn', 'Python', '15', '8', '2022', 3),
(11, 'Videojuego', '65575 EUR', 'Nuevo ingreso', 'kjghrliuergkuh', 'kwjb girug', 'gregre', 'weh iguweiu1', 'C++', '15', '8', '2022', 3),
(12, 'IA(Inteligencia Artificial)', '8000 EUR', 'Nuevo ingreso', 'oiwehw', 'flke hgfiuewh', 'brebebre', 'uweffh iuwhiuf', 'Python', '15', '8', '2022', 1),
(13, 'Sistema de escritorio', '554645 ARS', 'Nuevo ingreso', 'Sistema de ordenamiento', 'kjbwkbe', 'bfrbrnr', 'wbgwb', 'C++', '15', '8', '2022', 3),
(14, 'Pagina WEB', '654654 ARS', 'Nuevo ingreso', 'gregeg', 'regergre', 'gerger', 'gergerger', 'Python', '15', '8', '2022', 3),
(15, 'Videojuego', '6000 USD', 'Nuevo ingreso', 'League of legends', 'mefyvukyevf', 'vfevf', 'vfevef', 'C++', '20', '8', '2022', 6),
(16, 'Pagina WEB', '7500 ARS', 'Nuevo ingreso', 'egreg', 'eergege', 'gergerger', 'gergergerherhre', 'Swift', '20', '8', '2022', 6),
(17, 'Pagina WEB', '4535345 ARS', 'Nuevo ingreso', 'rtrr', 't brtbwfb', 'vwbrwgeg', 'wgqedaew', 'JAVA', '20', '8', '2022', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Mail` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Telefono` int(50) NOT NULL,
  `Direccion` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ultima_modificacion` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`ID`, `Nombre`, `Mail`, `Telefono`, `Direccion`, `ultima_modificacion`) VALUES
(1, 'Nacho Fillol', 'hola', 0, 'fwefew', 'jako'),
(2, 'Altero Tomas', 'llll', 0, 'ggg', 'jako'),
(3, 'Mateo Lopez', 'mateo@gmail.com', 4564, 'Av.Libertador', 'jako'),
(5, 'jorge', 'fdfdfd', 0, 'fddf', 'jako'),
(6, 'Luciano Michallik', 'luchito@gmail.com', 674765, 'Av.Libertador', 'jako'),
(7, 'Tomas Altero', 'tomasaltero@gmail.com', 4538, 'Av.Libertador', 'jako'),
(8, 'Nacho Peralta', 'tomasaltero', 654, 'tohrt', 'jako'),
(9, 'Renzo Prosdocimo', 'renzoprosdo@gmail.com', 564654, '4564', 'jako');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Mail` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Telefono` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tipo_nivel` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Estatus` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Registrado_por` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID`, `Nombre`, `Mail`, `Telefono`, `Username`, `password`, `tipo_nivel`, `Estatus`, `Registrado_por`) VALUES
(1, 'Alejo Vaquero', 'tomasaltero@hotmail.com', '351786', 'tomi07', 'fortnite', 'Administrador', 'Activo', 'tomi07'),
(10, 'Joaquin Lopez', 'holis@hotmail.com', '351786', 'jako', 'messi', 'Capturista', 'Activo', 'tomi07'),
(11, 'Hernesto Perez', 'hernesto@hotmail.com', '6565', 'hernesto', 'boca', 'Tecnico', 'Activo', 'tomi07'),
(12, 'Renzo Lopez', 'renzo01@hotmail.com', '65464', 'renzo01', 'fort1', 'Tecnico', 'Activo', 'tomi07'),
(13, 'Facundo Girardi', 'facu@hotmil.com', '5464', 'facunda', 'facu01', 'Desarrollador', 'Activo', 'tomi07'),
(14, 'Nico Bergliaffa', 'nico@gmail.co', '543453', 'nikin', 'budi', 'Desarrollador', 'Activo', 'tomi07'),
(15, 'Agustin Macias', 'agustin@gmail.com', '64564', 'macita', 'hik', 'Desarrollador', 'Activo', 'tomi07'),
(16, 'Luchito Michalik', 'lucho@gmail.com', '6456', 'lucho01', '123', 'Desarrollador', 'Activo', 'tomi07'),
(18, 'Nacho Peralta', 'tomasaltero', '53454', 'perlta02', '53', 'Desarrollador', 'Activo', 'tomi07'),
(19, 'Pablo Palacios', 'tomasaltero@gmail.com', '6545', 'jytj', 'pablo01', 'Desarrollador', 'Inactivo', 'tomi07'),
(20, 'eroigh', 'renzo', '65465', 'renzo98', '654764', 'Captirista', 'Activo', 'tomi07');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividades`
--
ALTER TABLE `actividades`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividades`
--
ALTER TABLE `actividades`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
