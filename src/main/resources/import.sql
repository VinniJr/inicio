INSERT INTO perfil(id_perfil,desc_perfil, status_perfil) VALUES (1,'adm','a');
INSERT INTO perfil(id_perfil,desc_perfil, status_perfil) VALUES (2,'comum','a');

INSERT INTO usuario(id_usuario, cpf_usuario, senha_usuario,status_usuario) VALUES (1,'12312312387','adm','a');

INSERT INTO usuario_perfil(id_usuario,id_perfil ) VALUES (1,1);