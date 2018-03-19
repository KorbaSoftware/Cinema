package pl.korbasoftware.cinema.persistence

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CinemaPersistence

fun main(args: Array<String>) {
    runApplication<CinemaPersistence>(*args)
}