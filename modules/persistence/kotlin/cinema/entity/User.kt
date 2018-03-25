package cinema.entity

import org.springframework.data.annotation.Id

class User(@Id val email: String,
           val hash: String)