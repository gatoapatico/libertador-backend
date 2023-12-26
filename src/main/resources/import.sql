INSERT INTO usuario (nombre, apellido, email, password, dni, telefono, tipo) VALUES ('Alvaro', 'Fernandez', 'afernandez@gmail.com', 'afernandez123', '42356967', '963852741', 'Administrador');
INSERT INTO usuario (nombre, apellido, email, password, dni, telefono, tipo) VALUES ('Miguel', 'Zuloeta', 'mzuloeta@gmail.com', 'mzuloeta123', '45285963', '987654321', 'Recepcionista');
INSERT INTO usuario (nombre, apellido, email, password, dni, telefono, tipo) VALUES ('Diego', 'Fernandez', 'dfernandez@gmail.com', 'dfernandez123', '47185963', '951247856', 'Cliente');
INSERT INTO usuario (nombre, apellido, email, password, dni, telefono, tipo) VALUES ('Brenda', 'Gonzales', 'bgonzales@gmail.com', 'bgonzales123', '42365951', '965214856', 'Cliente');
INSERT INTO usuario (nombre, apellido, email, password, dni, telefono, tipo) VALUES ('Javier', 'Daum', 'jdaum@gmail.com', 'jdaum123', '42312693', '941258369', 'Cliente');

INSERT INTO categoria (nombre, descripcion_breve, descripcion_larga, precio) VALUES ('Suite Imperial', 'Suite de lujo caracterizada por decoración palaciega, mayordomo personal, jacuzzi privado y acceso a la Sala de Épocas.', 'Nuestra habitación de mayor clase, cuenta con un amplio dormitorio de suma elegancia y un salón con cortinados de terciopelo, rica tapicería, boiserie y molduras. Incluye un mayordomo de servicio permanente, jacuzzi privado con sales y un desayuno gourmet. También permite el acceso a la Sala de Épocas con música en vivo y shows de aires victorianos.', 300);
INSERT INTO categoria (nombre, descripcion_breve, descripcion_larga, precio) VALUES ('Suite Clásica', 'Hermosa suite decorada en estilo clásico, atención personalizada, mini bar de lujo y beneficios gastronómicos.', 'Su decoración clásica con mobiliario Luis XV, cuadros de época y arañas de cristal le dan un ambiente del más alto estilo. Cuenta con un minibar exclusivo con vinos importados y champagne, late check-out según disponibilidad y una cena para dos en nuestro Restaurante Retro con selección de menú.', 250);
INSERT INTO categoria (nombre, descripcion_breve, descripcion_larga, precio) VALUES ('Habitación Retro', 'Habitación temática vintage, con radio reloj antiguo, acceso a entretenimiento vintage y descuentos en tratamientos spa.', 'Nuestras Habitaciones Retro poseen una deliciosa decoración vintage que evoca décadas pasadas. Mobiliario de mediados de siglo, radio reloj de época, papel tapiz floral y lámparas art déco componen su encanto old school. Los huéspedes obtienen un 10% de descuento en todos los tratamientos de nuestro Spa Vintage.', 180);
INSERT INTO categoria (nombre, descripcion_breve, descripcion_larga, precio) VALUES ('Loft Relojero', 'Moderno loft con temática steampunk y relojes de época, café express, desayuno continental a la habitación.', 'El Loft Relojero ofrece una estadía contemporánea con un toque steam. Sus paredes de ladrillo y vigas de acero con terminaciones oxidadas se combinan con antiguos relojes de pie y engranajes decorativos. El mobiliario moderno y una máquina de café express le dan un toque industrial. Los huéspedes pueden tener su desayuno continental servido en la intimacy de la suite.', 200);
INSERT INTO categoria (nombre, descripcion_breve, descripcion_larga, precio) VALUES ('Vista al Ayer', 'Habitación nostálgica con balcón y buena vista panorámica, decoración vintage.', 'Las habitaciones Vista al Ayer ubicadas en los pisos superiores son una invitación a mirar hacia atrás en el tiempo. Sus balcones y ventanales ofrecen hermosas vistas panorámicas mientras que en el interior nos rodea una cálida decoración de antaño con céfiro en las cortinas, un reloj de péndulo y mobiliario francés pintado a mano que le dará la bienvenida.', 220);
INSERT INTO categoria (nombre, descripcion_breve, descripcion_larga, precio) VALUES ('El Ático', 'Exclusivo ático de estilo señorial en el último piso, con mayordomo privado.', 'Situado en el último piso del edificio histórico, El Ático es la joya arquitectónica del Libertador. Un mayordomo personal estará al servicio permanente en esta suite señorial de corte inglés, con biblioteca privada, chimenea, fina cristalería y piezas de decoración que evocan la realeza europea. El acceso a la terraza superior le permitirá disfrutar de la ciudad desde las alturas mientras saborea una copa de nuestro mejor coñac.', 350);


INSERT INTO imagen (categoria_id, path) VALUES (1, 'suite-imperial-1.png');
INSERT INTO imagen (categoria_id, path) VALUES (1, 'suite-imperial-2.png');
INSERT INTO imagen (categoria_id, path) VALUES (1, 'suite-imperial-3.png');
INSERT INTO imagen (categoria_id, path) VALUES (2, 'suite-clasica-1.png');
INSERT INTO imagen (categoria_id, path) VALUES (2, 'suite-clasica-2.png');
INSERT INTO imagen (categoria_id, path) VALUES (3, 'habitacion-retro-1.png');
INSERT INTO imagen (categoria_id, path) VALUES (3, 'habitacion-retro-2.png');
INSERT INTO imagen (categoria_id, path) VALUES (4, 'loft-relojero-1.png');
INSERT INTO imagen (categoria_id, path) VALUES (4, 'loft-relojero-2.png');
INSERT INTO imagen (categoria_id, path) VALUES (5, 'vista-al-ayer-1.png');
INSERT INTO imagen (categoria_id, path) VALUES (5, 'vista-al-ayer-2.png');
INSERT INTO imagen (categoria_id, path) VALUES (5, 'vista-al-ayer-3.png');
INSERT INTO imagen (categoria_id, path) VALUES (6, 'atico-1.png');
INSERT INTO imagen (categoria_id, path) VALUES (6, 'atico-2.png');
INSERT INTO imagen (categoria_id, path) VALUES (6, 'atico-3.png');


INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (1, 'Disponible', '101');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (1, 'Disponible', '102');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (1, 'Disponible', '103');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (2, 'Disponible', '201');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (2, 'Disponible', '202');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (2, 'Disponible', '203');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (3, 'Disponible', '301');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (3, 'Disponible', '302');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (3, 'Disponible', '303');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (4, 'Disponible', '401');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (4, 'Disponible', '402');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (4, 'Disponible', '403');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (5, 'Disponible', '501');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (5, 'Disponible', '502');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (5, 'Disponible', '503');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (6, 'Disponible', '601');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (6, 'Disponible', '602');
INSERT INTO habitacion (categoria_id, disponibilidad, numero_habitacion) VALUES (6, 'Disponible', '603');


INSERT INTO servicio (costo, nombre) VALUES (0, 'Wifi');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Desayuno buffet');
INSERT INTO servicio (costo, nombre) VALUES (50, 'Mayordomo personal 24h');
INSERT INTO servicio (costo, nombre) VALUES (20, 'Desayuno gourmet en la habitación');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Habitación Bar privado de licores premium');
INSERT INTO servicio (costo, nombre) VALUES (10, 'Acceso a Salas de Épocas');
INSERT INTO servicio (costo, nombre) VALUES (30, 'Atención personalizada de botones');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Minibar surtido con vinos y champagne');
INSERT INTO servicio (costo, nombre) VALUES (20, 'Late check-out sujeto a disponibilidad');
INSERT INTO servicio (costo, nombre) VALUES (100, 'Cena para 2 en Restaurante Retro');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Radio reloj vintage');
INSERT INTO servicio (costo, nombre) VALUES (5, 'Centro de Entretenimiento Antiguo');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Descuento del 10% en Spa Vintage');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Máquina de café express');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Ambientación steampunk');
INSERT INTO servicio (costo, nombre) VALUES (12, 'Desayuno continental en la habitación');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Balcón con vista panorámica');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Acceso a terraza exterior privada');
INSERT INTO servicio (costo, nombre) VALUES (0, 'Conferencias');


INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (1,1);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (1,2);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (1,3);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (1,4);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (1,5);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (1,6);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (2,1);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (2,2);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (2,7);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (2,8);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (2,9);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (2,10);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (3,1);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (3,2);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (3,11);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (3,12);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (3,13);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (4,1);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (4,2);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (4,14);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (4,15);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (4,16);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (5,1);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (5,2);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (5,17);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,1);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,2);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,18);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,14);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,4);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,3);
INSERT INTO categoria_servicios (categoria_id, servicio_id) VALUES (6,19);


INSERT INTO reserva (check_in, check_out, fecha_reserva, habitacion_id, usuario_id, codigo_reserva) VALUES ('2023-12-26', '2023-12-30', '2023-12-25', 1, 1, 'qwertyui');
INSERT INTO reserva (check_in, check_out, fecha_reserva, habitacion_id, usuario_id, codigo_reserva) VALUES ('2024-01-10', '2024-01-15', '2023-12-25', 4, 1, 'asdfghjk');
INSERT INTO reserva (check_in, check_out, fecha_reserva, habitacion_id, usuario_id, codigo_reserva) VALUES ('2024-01-20', '2024-01-25', '2023-12-25', 7, 1, 'zxcvbnmq');