import java.util.*;

class ListMerger {
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) result.add(list1.get(i));
            if (i < list2.size()) result.add(list2.get(i));
        }
        return result;
    }
}

class MapPrinter {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "," + " Value: " + entry.getValue());
        }
    }
}


class Task implements Comparable<Task> {
    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() { return taskName; }
    public int getPriority() { return priority; }
    public int getDuration() { return duration; }

    @Override
    public int compareTo(Task other) {
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority); // higher priority first
        } else {
            return Integer.compare(this.duration, other.duration); // shorter duration first
        }
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

class TaskScheduler {
    private PriorityQueue<Task> scheduledTasks = new PriorityQueue<>();
    private Queue<Task> pendingTasks = new LinkedList<>();

    public void addTask(Task task) {
        scheduledTasks.add(task);
        System.out.println("Added: " + task);
    }

    public void delayTask(String taskName) {
        Task toDelay = null;
        for (Task task : scheduledTasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                toDelay = task;
                break;
            }
        }
        if (toDelay != null) {
            scheduledTasks.remove(toDelay);
            pendingTasks.add(toDelay);
            System.out.println("Delaying Task: " + toDelay.getTaskName());
        }
    }

    public void processNext() {
        if (!scheduledTasks.isEmpty()) {
            Task next = scheduledTasks.poll();
            System.out.println("Processing Task: " + next);
        } else if (!pendingTasks.isEmpty()) {
            Task next = pendingTasks.poll();
            System.out.println("Processing Task: [Priority " + next.getPriority() + "] " + next.getTaskName() + " (Duration: " + next.getDuration() + " mins)");
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void displayScheduledTasks() {
        System.out.println("Scheduled Tasks (sorted by priority):");
        if (scheduledTasks.isEmpty()) System.out.println("(No priority tasks)");
        else {
            List<Task> copy = new ArrayList<>(scheduledTasks);
            Collections.sort(copy);
            int index = 1;
            for (Task task : copy) {
                System.out.println(index++ + ". " + task);
            }
        }
    }

    public void displayPendingTasks() {
        System.out.println("Pending Tasks (FIFO Order):");
        if (pendingTasks.isEmpty()) System.out.println("(No pending tasks)");
        else {
            int index = 1;
            for (Task task : pendingTasks) {
                System.out.println(index++ + ". " + task.getTaskName() + " (Priority: " + task.getPriority() + "," + "wa Duration: " + task.getDuration() + " mins)");
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("1", "2", "3", "4");
        System.out.println("Merged List: " + ListMerger.mergeAlternating(list1, list2));

        Map<Integer, String> map = Map.of(1, "One", 2, "Two", 3, "Three");
        MapPrinter.printMap(map);

        TaskScheduler scheduler = new TaskScheduler();
        System.out.println("\nTasks Added:");
        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database Backup", 2, 30));
        scheduler.addTask(new Task("Deploy New Feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        scheduler.displayScheduledTasks();

        scheduler.processNext();
        scheduler.delayTask("Code Review");

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.delayTask("Database Backup");

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processNext();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processNext();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processNext();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processNext();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();
    }
}
