package com.example.springrenderdeploy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRenderDeployApplication

fun main(args: Array<String>) {
	runApplication<SpringRenderDeployApplication>(*args)
}
