package com.ada.example.exercicio1;

import com.ada.example.exercicio1.interfaces.FileDatabase;
import com.ada.example.exercicio1.interfaces.FolderManagement;
import com.ada.example.exercicio1.interfaces.ImageFileDatabase;
import com.ada.example.exercicio1.model.MFile;
import com.ada.example.exercicio1.orchestrator.FileOrchestrator;
import com.ada.example.exercicio1.orchestrator.FolderOrchestrator;

public class HandlerFile {


    ImageFileDatabase imageFileDatabase;
    FileDatabase fileDatabase;
    FolderManagement folderManagement;

    public HandlerFile() {
        imageFileDatabase = new FileOrchestrator();
        fileDatabase = new FileOrchestrator();
        folderManagement = new FolderOrchestrator();
    }


    public void salvarComDiretorio(MFile mFile) {
        fileDatabase.saveFile(mFile.getPath(), mFile.getContent(), mFile.getType(), mFile.getFileName());
    }

    public void salvarImagemComDiretorio(MFile mFile) {
        imageFileDatabase.saveImageFile(mFile.getPath(), mFile.getContent(), mFile.getFileName());
    }

    public void listarArquivos(String directory){
        fileDatabase.listAllFiles(directory);
    }
}
