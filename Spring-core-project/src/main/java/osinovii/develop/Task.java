package osinovii.develop;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;

    public Task() {
        this.name = "task";
        this.duration = 30L;
        System.out.println("call task constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("task post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("task  pre destroy");
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }


}
