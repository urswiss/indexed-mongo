package ch.tripleap.indexed.mongo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IndexMongoApplication

fun main(args: Array<String>) {
    runApplication<IndexMongoApplication>(*args)
}
