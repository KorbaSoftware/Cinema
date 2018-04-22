package cinema

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CinemaSecurity

fun main(args: Array<String>) {
    runApplication<CinemaSecurity>(*args)
}