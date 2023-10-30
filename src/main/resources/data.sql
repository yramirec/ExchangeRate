CREATE TABLE tipo_de_cambio (
  id INT PRIMARY KEY AUTO_INCREMENT,
  moneda_origen VARCHAR(3),
  moneda_destino VARCHAR(3),
  tipo_de_cambio DECIMAL(10, 4)
);

INSERT INTO tipo_de_cambio (moneda_origen, moneda_destino, tipo_de_cambio) VALUES ('USD', 'EUR', 0.85);
INSERT INTO tipo_de_cambio (moneda_origen, moneda_destino, tipo_de_cambio) VALUES ('EUR', 'USD', 1.18);