package osinovii.develop;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TaskExecuter {

    private final Task task;

    public TaskExecuter(Task task) {
        this.task = task;
    }

    public void executeTask(){
        System.out.printf("Execute task with name %s,duration - %s",task.getName(),task.getDuration());
        System.out.println();
    }
}
