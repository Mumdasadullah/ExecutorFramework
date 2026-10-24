import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public static void main(String[] args) {
    // Executor
    // ExecutorService executor = Executors.newFixedThreadPool(2);

    // for (int i = 1; i <= 8; i++) {

    //     final int taskId = i;

    //     executor.execute(() -> {
    //         System.out.println("Task " + taskId + " is performed by "
    //             + Thread.currentThread().getName()
    //         );
    //     });
    // }

    // executor.shutdown();

    // Future And Callable
    // ExecutorService executor = Executors.newFixedThreadPool(2);

    // Future<Integer> f1 = executor.submit(() -> 10 * 20 * 30);

    // try {
    //     System.out.println(f1.get());
    // } catch (Exception e) {
    //     // TODO: handle exception
    // }

    // executor.shutdown();

    // Invoke All Method
    // ExecutorService executor = Executors.newFixedThreadPool(2);

    // List<Callable<Integer>> tasks = List.of(
    //     () -> 10 + 10,
    //     () -> 20 + 20,
    //     () -> 30 + 30,
    //     () -> 40 + 40,
    //     () -> 50 + 50
    // );

    // try {
    //     List<Future<Integer>> futures = executor.invokeAll(tasks);
    //     for (Future<Integer> future : futures) {
    //         System.out.println(future.get());
    //     }
    // } catch (Exception e) {
    //     // TODO: handle exception
    // }

    // executor.shutdown();

    // Execute vs Submit
    ExecutorService executor = Executors.newFixedThreadPool(2);

    // try {
    //     executor.execute(() -> {
    //         System.out.println(10 / 0);
    //     });
    // } catch (Exception e) {
    //     // TODO: handle exception
    // }

    Future<Integer> f1 = executor.submit(() -> 10 / 0);

    try {
        System.out.println(f1.get());
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Exception raised");
    }

    executor.shutdown();
}