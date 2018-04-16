package sender

import email.Email
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.stereotype.Service
import javax.mail.internet.MimeMessage

@Service
class EmailSender(val gmailSender: JavaMailSenderImpl) {
    fun send(email: Email) {
        val mimeMsg = buildMimeMessage(email)
        gmailSender.send(mimeMsg)
    }

    private fun buildMimeMessage(email: Email): MimeMessage {
        TODO()
    }
}