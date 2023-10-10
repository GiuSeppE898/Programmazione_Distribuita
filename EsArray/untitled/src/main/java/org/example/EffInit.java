package org.example;

public class EffInit extends Thread{
    private int start;
    private int dim;
    public static int[] data;
    public static final int size = 10000;
    public static final int MAX_THR = 8;
    public static void main(String[] args){
        data = new int[size];
        long begin, end;
        int start, j;
        EffInit[] threads;
        for(int numThread = 1; numThread<=MAX_THR; numThread++){
            begin = System.currentTimeMillis();
            start = 0;
            threads = new EffInit[numThread];
            for(j=0;j<numThread;j++){
                threads[j]  = new EffInit(start, size/ numThread);
                threads[j].start();
                start += size/numThread;
            }
            for(j=0; j< numThread; j++){
                try{
                    threads[j].join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            end = System.currentTimeMillis();
            System.out.println(numThread + "Thread(s) : "+ (end-begin) + "ms");
        }
    }
    public EffInit(int start,int size){
        this.start=start;
        this.dim= size;
    }
    public void run(){
        int j;
        for(int i=0; i<this.dim; i++){
          for(j=0;j<10000; j++)
              data[this.start + 1] = i;
        }
    }
}