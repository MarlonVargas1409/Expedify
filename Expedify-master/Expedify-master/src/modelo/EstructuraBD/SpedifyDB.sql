/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Marlon Vargas
 * Created: Dec 2, 2024
 */

-- crear la base de datos
create database gestor_archivo;
 drop database gestor_archivo;

use gestor_archivo;

-- crear tabla de login
create table login (
id int not null primary key,
usuario varchar(20) not null,
contraseña varchar(20)
);

insert into login 
values (1, 'MVARGAS',M1234);
values (2, 'RURBAEZ',R456);
values (3, 'DCASTILLO',D789);
values (4, 'PRAMIREZ',P101112);

-- crear tabla de los datos del expediente
create table expediente(
id_expediente int not null primary key auto_increment,
expediente bigint not null unique,
tipo_expediente varchar(50) ,
tribunal varchar(50),
sala varchar(10),
propietario varchar(50),
fecha date
);

insert into EXPEDIENTE 
values (1,'123424234', 'CONTENCIOSO',JTO,);
values (2,'21234', 'REFERIMIENTO',,);
values (3,'312342134', 'ADMINISTRATIVO',D789,);
values (4,'412342342', 'ADMINISTRATIVO',P101112,);

-- crear tabla para guardar expediente en caja
create table caja(
id_caja int not null primary key auto_increment,
estado varchar(20),
expediente bigint not null,
sala varchar(10),
caja int not null,
departamento varchar(50),
usuario varchar(50),
fecha date, 
comentario varchar(150),
foreign key (expediente) references expediente(expediente)
on delete cascade
on update cascade
);

-- Cambiar el delimitador temporalmente
DELIMITER //

-- Crear el procedimiento almacenado
CREATE PROCEDURE RegistrarExpedienteYCaja(
    IN p_Expediente BIGINT,
    IN p_TipoExpediente VARCHAR(50),
    IN p_Tribunal VARCHAR(50),
    IN p_Sala VARCHAR(10),
    IN p_Propietario VARCHAR(50),
    IN p_Fecha DATE,
    IN p_EstadoCaja VARCHAR(20),
    IN p_Caja INT,
    IN p_Departamento VARCHAR(50),
    IN p_UsuarioCaja VARCHAR(50),
    IN p_Comentario VARCHAR(150)
)
BEGIN
    -- Definir un manejador de errores
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        -- Si ocurre un error, se retorna un mensaje
        SELECT 'Error en la operación. No se pudo registrar el expediente y la caja.' AS mensaje;
    END;

    -- Insertar el expediente en la tabla expediente
    INSERT INTO expediente (expediente, tipo_expediente, tribunal, sala, propietario, fecha)
    VALUES (p_Expediente, p_TipoExpediente, p_Tribunal, p_Sala, p_Propietario, p_Fecha);

    -- Insertar el registro en la tabla caja
    INSERT INTO caja (estado, expediente, sala, caja, departamento, usuario, fecha, comentario)
    VALUES (p_EstadoCaja, p_Expediente, p_Sala, p_Caja, p_Departamento, p_UsuarioCaja, CURDATE(), p_Comentario);

    -- Mensaje de éxito
    SELECT 'Expediente y Caja registrados correctamente.' AS mensaje;
END//

-- Restaurar el delimitador a ;
DELIMITER ;
DELIMITER $$

CREATE PROCEDURE ObtenerExpedientePorID(
    IN p_Expediente BIGINT
)
BEGIN
    -- Consultar el expediente por número de expediente
    SELECT * FROM expediente WHERE expediente = p_Expediente;
END $$

DELIMITER ;
DELIMITER $$

CREATE PROCEDURE ActualizarExpediente(
    IN p_Expediente BIGINT,
    IN p_NuevoTribunal VARCHAR(50),
    IN p_NuevaSala VARCHAR(10),
    IN p_NuevoPropietario VARCHAR(50)
)
BEGIN
    -- Actualizar el expediente
    UPDATE expediente
    SET tribunal = p_NuevoTribunal,
        sala = p_NuevaSala,
        propietario = p_NuevoPropietario
    WHERE expediente = p_Expediente;

    SELECT 'Expediente actualizado correctamente.' AS mensaje;
END $$

DELIMITER ;
DELIMITER $$

CREATE PROCEDURE EliminarExpediente(
    IN p_Expediente BIGINT
)
BEGIN
    -- Eliminar registros en la tabla caja relacionados con el expediente
    DELETE FROM caja WHERE expediente = p_Expediente;

    -- Eliminar el expediente de la tabla expediente
    DELETE FROM expediente WHERE expediente = p_Expediente;

    SELECT 'Expediente y registros relacionados eliminados correctamente.' AS mensaje;
END $$

DELIMITER ;

