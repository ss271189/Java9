package jc.java9.privatemethod;

public class PrivateMethodInInterfaceDemo implements InterfaceWithPrivateMethod{

    public static void main(String[] args) {
        System.out.println("######################### Non static private methods ##########################################");
        PrivateMethodInInterfaceDemo obj=new PrivateMethodInInterfaceDemo();
        obj.m1();
        obj.m2();

        System.out.println("######################### Static private methods ##########################################");
        InterfaceWithPrivateMethod.mS1();
        InterfaceWithPrivateMethod.mS2();
    }
}

interface InterfaceWithPrivateMethod{

    default void m1(){
        System.out.println("Code Specific to M1");
        m3();
    }

    default void m2(){
        System.out.println("Code specific M2");
        m3();
    }

    private void m3(){
        System.out.println("Common code"); // Not accessible to inheriting implementation
    }

    public static void mS1(){
        System.out.println("Code Specific to MS1");
        mS3();
    }

    public static void mS2(){
        System.out.println("Code specific MS2");
        mS3();
    }

    private static void mS3(){
        System.out.println("Common code from static private method"); // Not accessible to inheriting implementation
    }
}
