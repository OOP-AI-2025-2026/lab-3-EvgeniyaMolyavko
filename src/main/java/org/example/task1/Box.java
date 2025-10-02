package org.example.task1;

public class Box {
    private int height = 0;
    private int length = 0;
    private int width = 0;

    public Box(int height, int length, int width){
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    public int volume(){
        return height * length * width;
    }

    public int lateralSurfaceArea(){
        return 2 * (length * height +  width * height);
    }

    public int surfaceArea(){
        return 2 * (length * height + width * height + length * width);
    }

    private void setHeight(int height){
        if(height > 0){
            this.height = height;
        }
    }
    private void setLength(int length){
        if(height > 0){
            this.length = length;
        }
    }
    private void setWidth(int width){
        if(width > 0){
            this.width = width;
        }
    }
}
