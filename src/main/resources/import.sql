--INSERT INTO estado (id_estado, nom_estado) VALUES(1, 'activo');
--INSERT INTO estado (id_estado, nom_estado) VALUES(2, 'inactivo');
--INSERT INTO concepto (cod_concepto, nom_concepto) VALUES(20, 'matrícula');
--INSERT INTO concepto (cod_concepto, nom_concepto) VALUES(30, 'servicios');
--INSERT INTO concepto (cod_concepto, nom_concepto) VALUES(10, 'abono');

INSERT INTO cliente (id_cliente, apellidos, fec_alta, nombre) VALUES(1357012, 'Jimenez', now(), 'Laura');
INSERT INTO cliente (id_cliente, apellidos, fec_alta, nombre) VALUES(789012, 'Perez', now(), 'Ramón');
INSERT INTO cliente (id_cliente, apellidos, fec_alta, nombre) VALUES(123456, 'Dominguez', now(), 'Claudia');

INSERT INTO lote (cod_lote, fec_alta, nom_lote, valor, id_cliente) VALUES('H00L1', now(), 'Segmento las acacias', 800.00, 123456);
INSERT INTO lote (cod_lote, fec_alta, nom_lote, valor, id_cliente) VALUES('H00L2', now(), 'Movimiento libertadores', 850.00, 123456);
INSERT INTO lote (cod_lote, fec_alta, nom_lote, valor, id_cliente) VALUES('H00L3', now(), 'Pueblo rico', 900.00, 789012);
INSERT INTO lote (cod_lote, fec_alta, nom_lote, valor, id_cliente) VALUES('H00L4', now(), 'Alameda', 900.00, 789012);
