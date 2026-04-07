package net.sumityouhub.journalApp.cron;

import net.sumityouhub.journalApp.scheduler.UserScheduler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserSchedulerTests {

    @Autowired
    private UserScheduler userScheduler;

    @Test
    public void testFetchUserAndSendSaMail2() {
        userScheduler.fetchUsersAndSendSaMail();
    }
}
