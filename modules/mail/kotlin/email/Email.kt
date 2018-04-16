package email

class Email(val sender: EmailAddress,
            val receiver: EmailAddress,
            val body: EmailBody) {

    fun getFullSender() = sender.name + " " + sender.email
    fun getFullReceiver() = receiver.name + " " + receiver.email
}

class EmailAddress(val email: String,
                   val name: String)

class EmailBody(val subject: String,
                val html: String)