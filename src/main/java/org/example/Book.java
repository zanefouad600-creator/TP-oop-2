package org.example;

public class Book {
    private String writer;
    private String title;
    private String topic;
    private Integer pages;

    public Book(String writer, String title, String topic, Integer pages) {
        this.writer = writer;
        this.title = title;
        this.topic = topic;
        this.pages = pages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                ", pages=" + pages +
                '}';
    }
}
