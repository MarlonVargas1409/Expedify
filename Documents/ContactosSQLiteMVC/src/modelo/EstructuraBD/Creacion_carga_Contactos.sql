CREATE TABLE tbl_redes_sociales(
   ID INTEGER PRIMARY KEY AUTOINCREMENT,
   Nombre     TEXT  NOT NULL,
   Direccion  TEXT  NOT NULL
);

INSERT INTO `tbl_redes_sociales` (`Id`, `Nombre`, `Direccion`) VALUES
	(1, 'facebook', 'http://wwww.facebook.com/rosannarosario');


CREATE TABLE IF NOT EXISTS `tbl_usuarios` (
  Id INTEGER PRIMARY KEY AUTOINCREMENT,
  Nombres char(50) DEFAULT NULL,
  Apellidos char(50) DEFAULT NULL,
  Telefonos char(13) DEFAULT NULL,
  Correo char(50) DEFAULT NULL
)

INSERT INTO `tbl_usuarios` (`Id`, `Nombres`, `Apellidos`, `Telefonos`, `Correo`) VALUES
	(1, 'Jessica', 'Feliz', '809-567-8900', 'jess@gmail.com'),
	(2, 'Miguel', 'Perez', '809-567-8900', 'mperez@gmail.com'),
	(3, 'Jose', 'Mojica', '809-567-8923', 'jomojica@gmail.com'),
	(4, 'Alexander', 'Fleming', '809-567-5678', 'jalex@gmail.com'),
	(5, 'Angel', 'Estevez', '809-566-3067', 'esteveza@gmail.com'),
	(6, 'Jesus Manuel', 'Quezada', '809-567-8900', 'jeque@gmail.com'),
	(7, 'Schaquile', 'Oneill', '890-678-4573', 'chaq@correo.com');