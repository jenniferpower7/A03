package org.example;

public class ColourTable {
    private int [][] colourTable;
    private int currentSize;
    private int capacity;

    public ColourTable(int capacity){
        this.capacity=capacity;
        this.colourTable=new int[capacity][3];
        this.currentSize=0;
        }
    public int getCapacity(){
        return capacity;
    }
}

