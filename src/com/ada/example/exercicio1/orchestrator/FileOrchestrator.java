package com.ada.example.exercicio1.orchestrator;

import com.ada.example.exercicio1.interfaces.FileDatabase;
import com.ada.example.exercicio1.interfaces.ImageFileDatabase;
import com.ada.example.exercicio1.model.MFileAnnotationType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase, FileDatabase {


    @Override
    public void saveImageFile(String directory, String content, String nameFile) {
        try {
            String dir = "imagens";
            BufferedImage image;
            URL url = new URL(content);
            image = ImageIO.read(url);
            String path = directory + "\\" + dir + "\\" + nameFile + ".jpg";
            ImageIO.write(image, "jpg", new File(path));
            System.out.println("Imagem salva com sucesso");
        } catch (Exception e) {
            System.out.println("error generico. imagem não foi salva");
        }

    }


    @Override
    public void saveFile(String directory, String content, MFileAnnotationType fileType, String fileName) {
        String dir;
        switch (fileType) {
            case REMINDER -> dir = "\\reminders";
            case IMPORTANT -> dir = "\\importants";
            case IMAGE -> dir = "\\images";
            default -> dir = "";
        }
        super.createAFolder(directory + dir, fileType);

        String path = directory + dir + "\\" + fileName + ".txt";


        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void listAllFiles(String directory) {
//        System.out.println("[1] REMINDER \t\t[2] IMPORTANT \t\t [3] SIMPLE");
//        Scanner tc = new Scanner(System.in);
//        int op = tc.nextInt();
//
//        if (op == 1) {
//            directory += "/reminder/";
//        } else if (op == 2) {
//            directory += "/important/";
//        } else if (op == 3) {
//            directory += "/";
//        } else {
//            System.out.println("INVALID OPTION");
//            listAllFiles(directory);
//        }
        File file = new File(directory);
        File[] aFile = file.listFiles();

        if (aFile != null) {
            for (File list : aFile) {
                if (list.isFile()) {
                    System.out.println(list.getName());
                }

            }
        } else System.out.println("NOT FOUND FILES");

    }


}
