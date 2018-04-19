package cinema.sender

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
open class CinemaMailSender {
    @Bean
    open fun getYahooMailSender(): JavaMailSender = JavaMailSenderImpl()
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