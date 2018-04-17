package cinema.sender

import cinema.email.Email
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class EmailSenderService(private val mailSender: JavaMailSender) {
    fun send(email: Email) = mailSender
            .send(buildMimeMessage(email))

    private fun buildMimeMessage(email: Email) = SimpleMailMessage()
            .apply {
                setTo(email.receiver.email)
                from = email.sender.email
                subject = email.body.subject
                text = email.body.html
            }
}