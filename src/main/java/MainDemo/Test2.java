package MainDemo;

public class Test2 extends Thread {

    public void go() { System.out.println( "Go!" ); }

    public void run() { System.out.println( "Run!" ); }

    public void begin() { System.out.println( "Begin!" ); }

    public void execute() { System.out.println( "Execute!" ); }



    public static void main( String[] args ) {

        Test2 myTest = new Test2();

        myTest.start();

    }

}
