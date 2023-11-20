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

    public void add(int[] rgb){
        for(int i=0;i<3;i++){
            colourTable[currentSize][i]=rgb[i];
        }
        currentSize++;
    }

    public int getSize(){
        return currentSize;
    }

    public boolean contains(int[] rgbColour){
        for(int[] colour:colourTable){
            if (java.util.Arrays.equals(colour, rgbColour)){
                return true;
            }
        }
        return false;
    }
}

