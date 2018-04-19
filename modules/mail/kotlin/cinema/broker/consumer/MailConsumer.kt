package cinema.broker.consumer

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MailConsumer {
    @KafkaListener(topics = ["test-mails.t"])
    fun consume(consumerRecord: ConsumerRecord<out Any, out Any>) {
        println("Msg received")
    }
}