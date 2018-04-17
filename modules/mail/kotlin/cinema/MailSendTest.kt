package cinema

import cinema.email.Email
import cinema.email.EmailAddress
import cinema.email.EmailBody
import cinema.sender.EmailSenderService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class MailSendTest(private val emailSender: EmailSenderService) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) = emailSender.send(Email(
                    EmailAddress("cinema.tester@yahoo.com", "Cinema"),
                    EmailAddress("cinema.tester@yahoo.com", "Test"),
                    EmailBody("subject test", "body test")))
}