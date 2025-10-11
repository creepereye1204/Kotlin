// MessageRepository.kt
package com.example.ex1

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>