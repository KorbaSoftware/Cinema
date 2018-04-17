package cinema.email

class Email(val sender: EmailAddress,
            val receiver: EmailAddress,
            val body: EmailBody)

class EmailAddress(val email: String,
                   val name: String)

class EmailBody(val subject: String,
                val html: String)