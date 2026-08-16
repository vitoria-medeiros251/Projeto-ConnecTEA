-- Limpeza (ordem importa por causa das FKs)
DELETE FROM servicos;
DELETE FROM estabelecimento;
DELETE FROM users;
DELETE FROM connecTEA;

-- =========================
-- CONNECT TEA
-- Tabela: connecTEA
-- =========================
INSERT INTO connecTEA (id, name, email, password, phone, tipo) VALUES
                                                                   (1, 'Ana Souza', 'ana.souza@connectea.com', '123456', '11999990001', 'RESPONSAVEL'),
                                                                   (2, 'Carlos Lima', 'carlos.lima@connectea.com', '123456', '11999990002', 'RESPONSAVEL'),
                                                                   (3, 'Marina Alves', 'marina.alves@connectea.com', '123456', '11999990003', 'AUTISTA'),
                                                                   (4, 'Rafael Costa', 'rafael.costa@connectea.com', '123456', '11999990004', 'AUTISTA'),
                                                                   (5, 'Juliana Mendes', 'juliana.mendes@connectea.com', '123456', '11999990005', 'RESPONSAVEL');

-- =========================
-- USERS (profissionais)
-- Tabela: users
-- =========================
INSERT INTO users (id, first_name, last_name, username, password, email, phone) VALUES
                                                                                    (1, 'Fernanda', 'Silva', 'ferpsico', '123456', 'fernanda.psico@email.com', '11988880001'),
                                                                                    (2, 'Bruno', 'Rocha', 'brunofono', '123456', 'bruno.fono@email.com', '11988880002'),
                                                                                    (3, 'Patricia', 'Nunes', 'pati.to', '123456', 'patricia.to@email.com', '11988880003'),
                                                                                    (4, 'Diego', 'Moraes', 'diego.neuro', '123456', 'diego.neuro@email.com', '11988880004'),
                                                                                    (5, 'Aline', 'Pereira', 'aline.ped', '123456', 'aline.ped@email.com', '11988880005');

-- =========================
-- ESTABELECIMENTOS
-- Tabela: estabelecimento
-- =========================
INSERT INTO estabelecimento
(id_estabelecimento, nome, tipo, endereco, cidade, cep, complemento, bairro, numero) VALUES
                                                                                         (1, 'Clinica Harmonia TEA', 'CLINICA', 'Rua das Flores', 'Sao Paulo', '01001000', 'Sala 12', 'Centro', 100),
                                                                                         (2, 'Espaco Evoluir', 'CENTRO_TERAPEUTICO', 'Av. Paulista', 'Sao Paulo', '01311000', 'Conj 45', 'Bela Vista', 1500),
                                                                                         (3, 'Instituto Mundo Azul', 'INSTITUTO', 'Rua Afonso Pena', 'Campinas', '13010010', 'Bloco B', 'Cambuí', 220),
                                                                                         (4, 'Clinica Ser e Crescer', 'CLINICA', 'Rua XV de Novembro', 'Curitiba', '80020000', 'Sala 8', 'Centro', 350),
                                                                                         (5, 'Centro Integrar TEA', 'CENTRO_TERAPEUTICO', 'Av. Brasil', 'Rio de Janeiro', '20040002', 'Andar 3', 'Centro', 900);

-- =========================
-- SERVICOS
-- Tabela: servicos
-- FK: profissional_id -> users.id
-- FK: estabelecimento_id -> estabelecimento.id_estabelecimento
-- =========================
INSERT INTO servicos
(id, nome, descricao, categoria, tipo, faixa_etaria, atende_online, atende_presencial, valor_consulta, profissional_id, estabelecimento_id) VALUES
                                                                                                                                                (1, 'Avaliacao Neuropsicologica', 'Avaliacao inicial para plano terapeutico', 'NEUROPSICOLOGIA', 'AVALIACAO', '3-12', TRUE, TRUE, 350.00, 4, 1),
                                                                                                                                                (2, 'Terapia Ocupacional', 'Intervencao em habilidades sensoriais e rotina', 'TERAPIA_OCUPACIONAL', 'TERAPIA', '4-14', TRUE, TRUE, 220.00, 3, 2),
                                                                                                                                                (3, 'Fonoaudiologia Infantil', 'Estimulo de linguagem e comunicacao funcional', 'FONOAUDIOLOGIA', 'TERAPIA', '2-10', FALSE, TRUE, 200.00, 2, 2),
                                                                                                                                                (4, 'Psicoterapia TCC', 'Apoio emocional e habilidades sociais', 'PSICOLOGIA', 'TERAPIA', '8-18', TRUE, TRUE, 180.00, 1, 3),
                                                                                                                                                (5, 'Orientacao Parental', 'Treinamento para familiares e cuidadores', 'PSICOLOGIA', 'ORIENTACAO', 'ADULTO', TRUE, FALSE, 160.00, 1, 1),
                                                                                                                                                (6, 'Atendimento Pedagogico Especializado', 'Apoio escolar adaptado ao TEA', 'PEDAGOGIA', 'SUPORTE_ESCOLAR', '6-14', TRUE, TRUE, 150.00, 5, 4),
                                                                                                                                                (7, 'Grupo de Habilidades Sociais', 'Grupo terapeutico para socializacao', 'PSICOLOGIA', 'GRUPO', '7-16', FALSE, TRUE, 120.00, 1, 5),
                                                                                                                                                (8, 'Plano Sensorial Individual', 'Plano para regulacao sensorial em casa/escola', 'TERAPIA_OCUPACIONAL', 'PLANO_TERAPEUTICO', '3-12', TRUE, TRUE, 240.00, 3, 3);
