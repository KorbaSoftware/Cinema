package sender

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
open class GmailSender {
    @Bean
    open fun getJavaMailSender(): JavaMailSender = JavaMailSenderImpl()
            .apply {
                host = "smtp.gmail.com"
                port = 587
                username = "wukamil@gmail.com"
                password = "*"

                javaMailProperties.put("mail.transport.protocol", "smtp")
                javaMailProperties.put("mail.smtp.auth", "true")
                javaMailProperties.put("mail.smtp.starttls.enable", "true")
                javaMailProperties.put("mail.debug", "true")
            }
}