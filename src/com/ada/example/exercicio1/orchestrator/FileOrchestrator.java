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

public class FileOrchestrator implements ImageFileDatabase, FileDatabase {

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
            case REMINDER -> dir = "reminders";
            case IMPORTANT -> dir = "importants";
            case IMAGE -> dir = "images";
            default -> dir = "";
        }

        String path = directory + "\\" + dir + "\\" + fileName + ".txt";
        try (FileWriter writer = new FileWriter(directory + "\\" + fileName + path)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
