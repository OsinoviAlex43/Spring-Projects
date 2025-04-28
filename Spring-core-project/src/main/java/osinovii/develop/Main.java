package osinovii.develop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("osinovii.develop");

        TaskManager taskManager1 = context.getBean(TaskManager.class);
        taskManager1.printTask();

        TaskExecuter executer = context.getBean(TaskExecuter.class);
        executer.executeTask();

        context.close();


    }
}