-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2020-04-27 03:22:08.219

-- tables
-- Table: COMIDA
CREATE TABLE COMIDA (
    IDCOM int NOT NULL COMMENT 'ID de la comida
',
    NOMCOM char(30) NOT NULL COMMENT 'nombre de la comida
',
    CSTCOM decimal(10,2) NOT NULL COMMENT 'costo del plato',
    ESTADO char(1) NOT NULL COMMENT 'estado del plato',
    IDINV int NOT NULL COMMENT 'id del inventario',
    CONSTRAINT COMIDA_pk PRIMARY KEY (IDCOM)
) COMMENT 'platos que se declaran a vender';

-- Table: INVENTARIO
CREATE TABLE INVENTARIO (
    IDINV int NOT NULL COMMENT 'ID del inventario',
    FECINV time NOT NULL COMMENT 'Fecha del inventario',
    TIPINV char(5) NOT NULL COMMENT 'Tipo de inventario',
    CSTPRO numeric(3,2) NOT NULL COMMENT 'Costo del producto',
    PREVENINV numeric(3,2) NOT NULL COMMENT 'precio de venta del producto inventariado
',
    CONSTRAINT INVENTARIO_pk PRIMARY KEY (IDINV)
) COMMENT 'NO vender mas de lo que se tiene 
';

-- Table: PERSONA
CREATE TABLE PERSONA (
    IDPER int NOT NULL COMMENT 'ID de la pesona',
    NOMPER char(20) NOT NULL COMMENT 'nombre de la persona',
    APEPER char(20) NOT NULL COMMENT 'apellido de la persona',
    TIPPER char(10) NOT NULL COMMENT 'tipo de persona',
    DNIPER numeric(8,0) NOT NULL COMMENT 'DNI de la persona',
    TELPER int NOT NULL COMMENT 'telefono de la persona',
    SEXPER char(1) NOT NULL COMMENT 'sexo de la persona',
    ESTPER char(1) NOT NULL COMMENT 'Estado de la persona',
    CONSTRAINT PERSONA_pk PRIMARY KEY (IDPER)
);

-- Table: PRODUCTO
CREATE TABLE PRODUCTO (
    IDPRO int NOT NULL COMMENT 'ID del producto',
    NOMPRO char(10) NOT NULL COMMENT 'Nombre del producto',
    CSTPRO int NOT NULL COMMENT 'costo del producto',
    ESTADO char(1) NOT NULL COMMENT 'Estado del producto',
    IDINV int NOT NULL COMMENT 'id del inventario',
    CONSTRAINT PRODUCTO_pk PRIMARY KEY (IDPRO)
) COMMENT 'productos envasados que se venderan';

-- Table: VENTA
CREATE TABLE VENTA (
    IDVEN int NOT NULL COMMENT 'ID de la venta',
    IDPER int NOT NULL COMMENT 'Id de la persona
',
    TIPVEN char(10) NOT NULL COMMENT 'tipo de venta',
    NOMPER char(20) NOT NULL COMMENT 'nombre de la persona a la que se le vende',
    FECVEN date NOT NULL COMMENT 'FECHA de venta
',
    RUC char(11) NOT NULL COMMENT 'ruc de la empresa
',
    CONSTRAINT VENTA_pk PRIMARY KEY (IDVEN)
) COMMENT 'tabla de la cabecera de la boleta';

-- Table: VENTA_DETALLE
CREATE TABLE VENTA_DETALLE (
    IDVENDET int NOT NULL COMMENT 'ID venta detalle
',
    IDVEN int NOT NULL COMMENT 'id de la venta',
    IDINV int NOT NULL COMMENT 'id del inventario',
    NOMPRO char(20) NOT NULL COMMENT 'nombre del producto envasdo',
    NOMCOM char(20) NOT NULL COMMENT 'nombre del plato que consumio',
    IDPRO int NOT NULL COMMENT 'id del producto',
    IDCOM int NOT NULL COMMENT 'id de la compra',
    CANVENDET char(2) NOT NULL COMMENT 'cantidad de la venta
',
    HORVENDET time NOT NULL COMMENT 'hora de la venta',
    COMVENDET char(50) NOT NULL COMMENT 'comentario de la venta',
    TIPPER char(10) NOT NULL COMMENT 'tipo de persona',
    CONSTRAINT VENTA_DETALLE_pk PRIMARY KEY (IDVENDET)
) COMMENT 'cuerpo de la boleta';

-- foreign keys
-- Reference: COMIDA_INVENTARIO (table: COMIDA)
ALTER TABLE COMIDA ADD CONSTRAINT COMIDA_INVENTARIO FOREIGN KEY COMIDA_INVENTARIO (IDINV)
    REFERENCES INVENTARIO (IDINV);

-- Reference: PRODUCTO_INVENTARIO (table: PRODUCTO)
ALTER TABLE PRODUCTO ADD CONSTRAINT PRODUCTO_INVENTARIO FOREIGN KEY PRODUCTO_INVENTARIO (IDINV)
    REFERENCES INVENTARIO (IDINV);

-- Reference: VENTA_DETALLE_COMIDA (table: VENTA_DETALLE)
ALTER TABLE VENTA_DETALLE ADD CONSTRAINT VENTA_DETALLE_COMIDA FOREIGN KEY VENTA_DETALLE_COMIDA (IDCOM)
    REFERENCES COMIDA (IDCOM);

-- Reference: VENTA_DETALLE_INVENTARIO (table: VENTA_DETALLE)
ALTER TABLE VENTA_DETALLE ADD CONSTRAINT VENTA_DETALLE_INVENTARIO FOREIGN KEY VENTA_DETALLE_INVENTARIO (IDINV)
    REFERENCES INVENTARIO (IDINV);

-- Reference: VENTA_DETALLE_PRODUCTO (table: VENTA_DETALLE)
ALTER TABLE VENTA_DETALLE ADD CONSTRAINT VENTA_DETALLE_PRODUCTO FOREIGN KEY VENTA_DETALLE_PRODUCTO (IDPRO)
    REFERENCES PRODUCTO (IDPRO);

-- Reference: VENTA_DETALLE_VENTA (table: VENTA_DETALLE)
ALTER TABLE VENTA_DETALLE ADD CONSTRAINT VENTA_DETALLE_VENTA FOREIGN KEY VENTA_DETALLE_VENTA (IDVEN)
    REFERENCES VENTA (IDVEN);

-- Reference: VENTA_PERSONA (table: VENTA)
ALTER TABLE VENTA ADD CONSTRAINT VENTA_PERSONA FOREIGN KEY VENTA_PERSONA (IDPER)
    REFERENCES PERSONA (IDPER);

-- End of file.

