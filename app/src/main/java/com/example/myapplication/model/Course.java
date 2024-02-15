package com.example.myapplication.model;

public class Course {

    int id, category;
    String img, CourseTitle, date, level, color, text;

    public Course(int id, String img, String CourseTitle, String date, String level, String color, String text, int category) {
        this.id = id;
        this.img = img;
        this.CourseTitle = CourseTitle;
        this.date = date;
        this.level = level;
        this.color = color;
        this.text = text;
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setTitle(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
