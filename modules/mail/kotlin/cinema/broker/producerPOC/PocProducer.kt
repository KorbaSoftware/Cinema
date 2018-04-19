package cinema.broker.producerPOC

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class PocProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {
    fun send(topic: String, email: String) {
        kafkaTemplate.send(topic, email)
    }
}