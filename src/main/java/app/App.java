package app;

import esd.ListaSequencial;

import java.io.*;

/*
Para testar seu programa, execute-e e então acesse o seguinte link:
http://localhost:8080/
 */

/** Classe que representa a aplicação. O nome dela obrigatoriamente deve ser App
 * @author Marcelo M. Sobral
 * @version 1.0
 */
public class App {

    final String CONFIG_FILE = "classes.csv";

    // adicione aqui atributos necessários para esta aplicação
    // Se achar necessário, você pode criar novas classes ...

    /*
    Construtor da App: processa o arquivo de configuração das classes de atendimento. Esse arquivo é um recurso chamado classes.csv.
    @throws            Dispara uma exceção InvalidParameterException se não puder ler o arquivo, ou seu conteúdo for inválido
     */
    public App() {
        // acessa o arquivo de configurações ... que está na pasta "resources"
        InputStream config = ClassLoader.getSystemResourceAsStream(CONFIG_FILE);

        // processa o arquivo para obter as configurações das classes de atendimento
    }

    /*
    Retorna as classes de atendimento
    @return uma lista contendo os identificadores das classes
     */
    public ListaSequencial<ClasseAtendimento> classes() {
        ListaSequencial<ClasseAtendimento> l_classes = new ListaSequencial<>();

        return l_classes;
    }

    /*
    Adiciona um cliente à fila correspondente à classe informada.
    @param classe  A classe de atendimento do cliente
    @return        A senha desse cliente no formato CXXX, sendo C a letra da classe e XXX um número (ver descrição do projeto)
    @throws        Dispara uma exceção InvalidParameterException se classe for inválida
     */
    public String adiciona_cliente(String classe) {
        return null;
    }

    /*
    Fornece a próxima senha de atendimento, de acordo com as regras do sistema de atendimento
    Essa senha deve ser removida da fila de senhas.
     */
    public String proxima_senha() {
        return null;
    }
}
