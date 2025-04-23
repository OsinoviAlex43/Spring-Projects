package osinovii.develop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TaskManeger {
    private final Task task;

    public TaskManeger(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void printTask(){
        System.out.println("Current: " + task.toString());
    }

    @Override
    public String toString() {
        return "TaskManeger{" +
                "task=" + task +
                '}';
    }
}
