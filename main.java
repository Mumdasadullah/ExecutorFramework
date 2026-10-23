import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public static void main(String[] args) {
    // Executor
    ExecutorService executor = Executors.newFixedThreadPool(2);

    for (int i = 1; i <= 8; i++) {

        final int taskId = i;

        executor.execute(() -> {
            System.out.println("Task " + taskId + " is performed by "
                + Thread.currentThread().getName()
            );
        });
    }

    executor.shutdown();;
}