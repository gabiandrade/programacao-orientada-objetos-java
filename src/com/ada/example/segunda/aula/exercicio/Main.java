package com.ada.example.segunda.aula.exercicio;

import javax.imageio.ImageIO;
import javax.print.DocFlavor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        BufferedImage image;
        try {
            // url que está no github
            URL url =
                    new URL("https://raw.githubusercontent.com/gabiandrade/" +
                            "programacao-orientada-objetos-java/main/src/com/ada/example/" +
                            "segunda/aula/exercicio/File_.jpeg");

            image = ImageIO.read(url);

            // caminho da minha maquina
            ImageIO.write(image, "jpeg", new File("C:\\Users\\gabri\\gabrielaAndrade"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
