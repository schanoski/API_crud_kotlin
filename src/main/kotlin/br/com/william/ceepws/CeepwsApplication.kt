package br.com.william.ceepws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CeepwsApplication

fun main(args: Array<String>) {
	runApplication<CeepwsApplication>(*args)
}
