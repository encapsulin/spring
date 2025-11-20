package comexample.demo.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronComponent {
    @Scheduled(cron="* */30 * * * *")
    void task(){
        System.out.println("cron");
    }
}
