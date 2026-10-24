import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class main {
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
        // ExecutorService executor = Executors.newFixedThreadPool(2);
    
        // try {
        //     executor.execute(() -> {
        //         System.out.println(10 / 0);
        //     });
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
    
        // Future<Integer> f1 = executor.submit(() -> 10 / 0);
    
        // try {
        //     System.out.println(f1.get());
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("Exception raised");
        // }
    
        // executor.shutdown();
    
        // Thread Pool Executor
    
        // ThreadPoolExecutor executor =
        // new ThreadPoolExecutor(
        //     2,
        //     5,
        //     10,
        //     TimeUnit.SECONDS,
        //     new ArrayBlockingQueue<>(2));
    
        // for (int i = 1; i <= 5; i++) {
            
        //     final int taskId = i;
    
        //     executor.execute(() -> {
        //         System.out.println("Task " + taskId + " is performed by "
        //         + Thread.currentThread().getName());
                
        //         try {
        //             Thread.sleep(2000);
        //         } catch (Exception e) {
        //             // TODO: handle exception
        //         }
    
        //     });
    
        // }
    
        // executor.shutdown();
    
        // Scheduled Thread Pool
        // ScheduledExecutorService schedulor = Executors.newScheduledThreadPool(2);
    
        // // for (int i = 1; i <= 10; i++) {
            
        // //     final int taskId = i;
    
        // schedulor.schedule(() -> {
        //     System.out.println("Task is performed");
        // }, 2, TimeUnit.SECONDS);
    
        // schedulor.scheduleAtFixedRate(() -> {
        //     System.out.println("Task is performed");
        // }, 0, 2, TimeUnit.SECONDS);
        // // }
    
        // schedulor.shutdown();
    
        // Cached Thread Pool
        // ExecutorService executor = Executors.newCachedThreadPool();
    
        // for (int i = 1; i <= 5; i++) {
            
        //     final int taskId = i;
    
        //     executor.execute(() -> {
        //         System.out.println("Task " + taskId + " is performed by " +
        //             Thread.currentThread().getName()
        //         );
        //     });
        // }
    
        // executor.shutdown();
    
        // Single Thread Pool
        // ExecutorService executor = Executors.newSingleThreadExecutor();
    
        // for (int i = 1; i <= 5; i++) {
            
        //     final int taskId = i;
    
        //     executor.execute(() -> {
        //         System.out.println("Task " + taskId + " is performed by"
        //             + Thread.currentThread().getName()
        //         );
        //     });
        // }
    
        // executor.shutdown();
    
        // Completable Future Code
        // CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10 * 20);
    
        // try {
        //     System.out.println(future.get());
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
    
        // CompletableFuture thenApply Method
        // CompletableFuture<Integer> future =
        //     CompletableFuture
        //         .supplyAsync(() -> 10 * 20)
        //         .thenApply(result -> result + 50)
        //         .thenApply(result -> result + 50);
    
        // try {
        //     System.out.println(future.get());
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
    
    
        // CompletableFuture thenAccept Method
        // CompletableFuture<Void> future =
        //     CompletableFuture
        //         .supplyAsync(() -> 10 * 20)
        //         .thenApply(result -> result + 50)
        //         .thenApply(result -> result + 50)
        //         .thenAccept(result -> System.out.println(result / 2));
    
    
        // CompletableFuture thenRun Method
        // CompletableFuture<Void> future =
        //     CompletableFuture
        //         .supplyAsync(() -> 10 + 10)
        //         .thenRun(() -> System.out.println("Done"));
    
    
        // then Combine Method
    
        // CompletableFuture<Integer> future1 = 
        //     CompletableFuture.supplyAsync(() -> 10 + 15);
    
        // CompletableFuture<Integer> future2 = 
        //     CompletableFuture.supplyAsync(() -> 20 + 5);
    
        // future1.thenCombine(future2, (a, b) -> a + b).thenAccept(result -> System.out.println(result));
    
        // Fork Join Problem
    
        int[] arr = {1, 20, 60, 50, 30, 80};
    
        ForkJoinPool pool = new ForkJoinPool();
    
        SumTask task = new SumTask(arr, 0, arr.length - 1);
    
        int result = pool.invoke(task);

        System.out.println(result);

        pool.shutdown();
    }
}

/**
 * main
 */
class SumTask extends RecursiveTask<Integer> {

    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute(){

        if ((end - start) <= 2) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }

            return sum;
        }

        int mid = (end + start) / 2;
        SumTask leftTask = new SumTask(arr, start, mid);
        SumTask rightTask = new SumTask(arr, mid + 1, end);

        leftTask.fork();
        int sum2 = rightTask.compute();

        int sum1 = leftTask.join();

        return sum1 + sum2;
    }
    
}