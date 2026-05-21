package MainDemo.Demo;

public abstract class Parent {
    public static void main(String[] args) {
      new Child().voice();
    }

    public static void run(){
        System.out.println("Parent run");
    }


}
