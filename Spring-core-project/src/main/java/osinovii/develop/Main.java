package osinovii.develop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.lang.model.element.AnnotationValue;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("osinovii.develop");
        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println(task1 == task2);
        TaskManeger taskManeger = context.getBean(TaskManeger.class);
        taskManeger.printTask();

    }
}