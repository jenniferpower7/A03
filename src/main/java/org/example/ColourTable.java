package org.example;

public class ColourTable {
    private int [][] colourTable;
    private int currentSize;
    private int capacity;

    public ColourTable(int capacity){

        if(!isValidCapacity(capacity)){
            throw new IllegalStateException("Invalid Capacity: " +capacity);
        }

        this.capacity=capacity;
        this.colourTable=new int[capacity][3];
        this.currentSize=0;
        }
    public int getCapacity(){
        return capacity;
    }

    public void add(int[] rgb){
        if(!isValidRGB(rgb)){
            throw new ArrayIndexOutOfBoundsException("Invalid RGB value: " + rgb);
        }


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

    private boolean isValidRGB(int[] rgb) {
        // Check the length first
        if (rgb.length != 3) {
            return false;
        }

        // Check each value
        for (int value : rgb) {
            if (!(value >= 0 && value < 256)) {
                return false;
            }
        }

        // All checks passed, return true
        return true;}

    private boolean isValidCapacity(int capacity){
        if(capacity>=2 && capacity <=1025 && ((capacity & (capacity - 1)) == 0)){
            return true;
        }
        return false;
    }



}

