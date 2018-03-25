package cinema

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CinemaPersistence

fun main(args: Array<String>) {
    try {
        runApplication<CinemaPersistence>(*args)
    } catch(e: Exception) {

    }
}