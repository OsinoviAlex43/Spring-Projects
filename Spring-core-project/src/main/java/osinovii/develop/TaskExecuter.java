package osinovii.develop;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import osinovii.develop.aop.Loggable;

@Component
public class TaskExecuter {

    private final Task task;

    public TaskExecuter(Task task) {
        this.task = task;
    }

    @Loggable(value = "ERROR",times = 2)
    public void executeTask(){
        System.out.printf("Execute task with name %s,duration - %s",task.getName(),task.getDuration());
        System.out.println();
    }
}
