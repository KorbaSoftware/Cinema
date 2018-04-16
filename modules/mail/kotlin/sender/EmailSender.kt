package sender

import email.Email
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Service
import org.springframework.mail.javamail.JavaMailSender

@Service
class EmailSender(val gmailSender: JavaMailSender) {
    fun send(email: Email) {
        val mimeMsg = buildMimeMessage(email)
        gmailSender.send(mimeMsg)
    }

    private fun buildMimeMessage(email: Email): SimpleMailMessage = SimpleMailMessage()
            .apply {
                to(email.getFullReceiver())
                from = email.getFullSender()
                subject = email.body.subject
                text = email.body.html
            }
}