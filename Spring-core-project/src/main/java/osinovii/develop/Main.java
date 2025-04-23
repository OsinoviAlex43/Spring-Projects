package osinovii.develop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("osinovii.develop");
        Task task1 = context.getBean(Task.class);
        Task task2 = context.getBean(Task.class);
        System.out.println(task1 == task2);
        TaskManager taskManager1 = context.getBean(TaskManager.class);
        taskManager1.printTask();
        TaskManager taskManager2 = context.getBean(TaskManager.class);
        TaskExecuter taskExecuter = context.getBean(TaskExecuter.class);
        taskExecuter.executeTask();
        context.close();
    }
}