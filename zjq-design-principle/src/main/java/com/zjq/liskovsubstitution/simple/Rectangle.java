package com.zjq.liskovsubstitution.simple;

/**
 * 长方形
 * Created by zjq
 */
public class Rectangle {
    private long height;
    private long width;

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
