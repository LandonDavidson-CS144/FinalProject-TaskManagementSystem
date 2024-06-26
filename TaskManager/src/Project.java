import java.util.ArrayList;
import java.util.Date;

public class Project {
    protected ArrayList<Task> tasks = new ArrayList<>();
    protected String name;

    public Project(String name) {
        this.name = name;
    }

    public void addTask(String taskName, boolean priority) {
        tasks.add(new DefaultTask(taskName, priority));
    }

    public Task findTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                return task;
            }
        }
        return new DefaultTask("Blank", false);
    }

    public int findTaskIndex(String name) {
        int i = 0;
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void print() {
        ArrayList<Task> temp = new ArrayList<>();
        System.out.println("\nProject: " + name);
        for (Task task : tasks) {
            if (task.getPriority()) {
                task.printTask();
            } else {
                temp.add(task);
            }
        }
        for (Task task : temp) {
            task.printTask();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
