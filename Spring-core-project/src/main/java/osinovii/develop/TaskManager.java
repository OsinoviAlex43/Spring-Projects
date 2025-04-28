package osinovii.develop;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import osinovii.develop.aop.Loggable;

@Component
public class TaskManager {
    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstruct(){
//        System.out.println("task manager post construct");
    }

    @PreDestroy
    public void preDestroy(){
//        System.out.println("task manager  pre destroy");
    }
    public Task getTask() {
        return task;
    }

    @Loggable(times = 3)
    public Long printTask(){
        System.out.println("Current: " + task.toString());
//        throw new RuntimeException("Exception in taskmanager");
            return task.getDuration();
    }

    @Override
    public String toString() {
        return "TaskManeger{" +
                "task=" + task +
                '}';
    }
}
