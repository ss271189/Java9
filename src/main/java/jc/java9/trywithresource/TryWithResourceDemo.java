package jc.java9.trywithresource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class TryWithResourceDemo {

    public static void main(String[] args) throws Exception{
        MyResource r1= new MyResource();
        MyResource r2= new MyResource();
        //BufferedReader br=new BufferedReader(new FileReader(new File("src/main/resources/input.txt") ));
        try (r1;r2;){
            r1.doProcess();;
            r2.doProcess();
        }
        //br.read();

    }
}


class MyResource implements AutoCloseable{
    // Any resource which need to Auto closed with try block should implement AutoCloseable interface
    // and implement close method

    public MyResource() {
        System.out.println("creating Resource");
    }

    public void doProcess(){
        System.out.println("Processing resource");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing resource");
    }
}
