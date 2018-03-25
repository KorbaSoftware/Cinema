package cinema

import cinema.entity.User
import cinema.repository.UserRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class MongoInitialTestData(val userRepository: UserRepository) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        userRepository.saveAll(listOf(
                User("stefek@email.com", "hash1234"),
                User("zenio@gmail.pl", "1235hash"),
                User("zbynio@bleble.com", "abecadlozdupyspadlo")))
    }
}