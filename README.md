# Projeto 1 de Estruturas de Dados

No projeto 1 sua equipe deve implementar um sistema de atendimento com prioridades, conforme descrito no Moodle:
* [Descrição do projeto](https://moodle.ifsc.edu.br/mod/assign/view.php?id=257518)
  
## O sistema de atendimento como uma aplicação web

Neste repositório você tem uma aplicação web para acessar seu sistema de atendimento. 

Inicie a implementação pela classe App (_src/java/main/app/App.java_). Essa classe deve implementar os seguintes métodos para realizar as operações do sistema de atendimento: 

|Método|Operação|
|------|--------|
|classes()|Listar classes de atendimento|
|adiciona_cliente(String classe)|Gerar nova senha de cliente e adicioná-la à fila de atendimento|
|proxima_senha()|Extrair da fila a próxima senha a ser atendida|

Leia os comentários escritos no código esqueleto dessa classe ... eles podem ajudar no desenvolvimento. Respeite as assinaturas dos métodos ali existentes: não modifique os parâmetros nem o tipo retornado por cada método. Note que no construtor da classe já há o código para acessar o arquivo _classes.csv_ (localizado em _src/java/resources_), o qual deve conter as descrições das classes de atendimento.

A classe _ClasseAtendimento_ deve ser usada para representar cada classe de atendimento obtida do arquivo _classes.csv_. Você pode implementar novos métodos nessa classe.

Você pode criar novas classes que achar necessárias, as quais devem ficar na package _app_ (junto da classe _App_).

Coloque suas estruturas de dados na package _esd_ (_src/java/main/esd_). 

## Testando seu sistema de atendimento

Para testar seu programa, execute-o e então acesse o seguinte link:
* [Sistema de atendimento](http://localhost:8080/)
