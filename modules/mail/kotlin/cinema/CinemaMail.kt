package cinema

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CinemaMail

fun main(args: Array<String>) {
    runApplication<CinemaMail>(*args)
}