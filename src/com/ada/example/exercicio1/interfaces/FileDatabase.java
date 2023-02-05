package com.ada.example.exercicio1.interfaces;

import com.ada.example.exercicio1.model.MFile;
import com.ada.example.exercicio1.model.MFileAnnotationType;

import java.io.IOException;

public interface FileDatabase {
    void saveFile(String directory, String content, MFileAnnotationType fileType, String fileName);
}
