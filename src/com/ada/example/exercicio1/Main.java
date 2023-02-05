package com.ada.example.exercicio1;

import com.ada.example.exercicio1.model.MFile;
import com.ada.example.exercicio1.model.MFileAnnotationType;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HandlerFile handlerFile = new HandlerFile();

        System.out.println("####### BEM VINDO AO MANIPULADOR DE ARQUIVOS VERSÃO 0.2.1 ####### ");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("MENU: ");
        System.out.println("Digite: (1) - Salvar Arquivo TXT, (2) - Salvar Imagem, (3) - Deletar Arquivo TXT, (4) Deletar Imagem," + "(5) Criar diretórios " +
                "  (6) Recuperar Arquivo TXT, (7) - Salvar Conjunto de Arquivos TXT");

        System.out.println("Obs: Para as operações (1),(2),(3),(4) é necessário criar os diretorios iniciais (5) ");
        boolean loop = true;
        while (loop) {
            int inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1 -> {
                    System.out.println("Opção Salvar Arquivo TXT");
                    System.out.println("Você pode criar 3 tipos de arquivos TXT");
                    System.out.println("(1) - REMINDER");
                    System.out.println("(2) - IMPORTANT");
                    System.out.println("(3) - SIMPLE");
                    System.out.println("Digite o número da opção desejada");
                    int typeNumberCreateDir = scanner.nextInt();
                    switch (typeNumberCreateDir) {
                        case 1 -> loop = createFile(scanner, handlerFile, MFileAnnotationType.REMINDER);
                        case 2 -> loop = createFile(scanner, handlerFile, MFileAnnotationType.IMPORTANT);
                        case 3 -> loop = createFile(scanner, handlerFile, MFileAnnotationType.SIMPLE);
                    }
                }
                case 2 -> {
                    System.out.println("Opção Salvar Imagem");
                    System.out.println("Digite agora o caminho do diretório");
                    String path = scanner.next();
                    System.out.println("Digite agora o nome do arquivo");
                    String nameFile = scanner.next();
                    System.out.println("Digite a URL da Imagem");
                    String urlFile = scanner.next();

                    MFile mFile = new MFile();
                    mFile.setFileName(nameFile);
                    mFile.setPath(path);
                    mFile.setContent(urlFile);

                    handlerFile.salvarImagemComDiretorio(mFile);

                    System.out.println("Programa Finalizado");
                    loop = false;
                }
            }
        }

    }

    public static Boolean createFile(Scanner scanner, HandlerFile handlerFile, MFileAnnotationType fileType) {
        System.out.println("Opção:" + fileType.name());
        System.out.println("Digite o caminho do diretório: ");
        String path = scanner.next();
        System.out.println("Digite o conteúdo do arquivo");
        String contentArq = scanner.next();
        System.out.println("Digite o nome do arquivo");
        String nameArq = scanner.next();

        MFile mFile = new MFile();
        mFile.setType(fileType);
        mFile.setPath(path);
        mFile.setContent(contentArq);
        mFile.setFileName(nameArq);

        handlerFile.salvarComDiretorio(mFile);

        System.out.println("Programa Finalizado!");
        return false;
    }


}
