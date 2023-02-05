package com.ada.example.exercicio1.model;

public class MFile {

    private String content;
    private String fileName;
    private MFileAnnotationType type;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MFileAnnotationType getType() {
        return type;
    }

    public void setType(MFileAnnotationType type) {
        this.type = type;
    }
}
