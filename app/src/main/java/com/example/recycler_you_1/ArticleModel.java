package com.example.recycler_you_1;

public class ArticleModel {
    private int MainImage;
    private String header;
    private String MainHeading;
    private String content;
    private String author;

    public ArticleModel(int MainImage,String header,String MainHeading,String content,String author){
        this.MainImage = MainImage;
        this.header = header;
        this.MainHeading = MainHeading;
        this.content = content;
        this.author = author;
    }

    public int getMainImage() {
        return MainImage;
    }


    public String getHeader() {
        return header;
    }

    public String getMainHeading() {
        return MainHeading;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
