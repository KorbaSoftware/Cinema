package cinema.sender

import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.stereotype.Component

@Component
class CinemaMailSender {
    fun getYahooMailSender() = JavaMailSenderImpl()
            .apply {
                host = "smtp.mail.yahoo.com"
                port = 465
                username = "cinema.tester@yahoo.com"
                password = "dupa123456"

                javaMailProperties.put("mail.transport.protocol", "smtp")
                javaMailProperties.put("mail.smtp.auth", "true")
                javaMailProperties.put("mail.smtp.ssl.enable", "true")
                javaMailProperties.put("mail.smtp.starttls.enable", "true")
                javaMailProperties.put("mail.debug", "true")
            }
}