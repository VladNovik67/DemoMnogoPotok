package MainDemo.CallbaleFactorial;

import java.util.concurrent.*;

public class Main {
    static int factorialResult;

    public static void main(String[] args) throws ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Factorial1(5));

        try {
            System.out.println(future.isDone());
            System.out.println("Xotim poluchit resultat");
            factorialResult = future.get();
            System.out.println("Poluchili resultat");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }

    }
}

class Factorial1 implements Callable<Integer> {
    int f;

    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f < 0) {
            throw new Exception("vi vveli nevernoe chislo");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
