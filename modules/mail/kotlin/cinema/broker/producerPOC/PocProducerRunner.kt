package cinema.broker.producerPOC

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class PocProducerRunner(private val pocProducer: PocProducer) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) = send()

    private fun send() = pocProducer
            .send("test-mails.t", "subject: bleble\nmsg: msg123")
            .run { println("msg sent") }
}