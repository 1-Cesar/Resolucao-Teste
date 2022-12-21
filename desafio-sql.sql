
SELECT placa, estado, cidade
FROM Veiculo 
INNER JOIN Proprietario ON Proprietario.id_proprietario = Veiculo.id_proprietario
WHERE nome = 'Joaquim Silva';




