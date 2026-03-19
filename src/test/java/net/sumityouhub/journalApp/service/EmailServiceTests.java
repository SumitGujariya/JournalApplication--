package net.sumityouhub.journalApp.service;

import net.sumityouhub.journalApp.services.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    public void testSendEmail() {
        emailService.sendEmail("gujariyasumit96@gmail.com", "Java mail sender", "Hii how are you you got the mail ??");
    }
}
