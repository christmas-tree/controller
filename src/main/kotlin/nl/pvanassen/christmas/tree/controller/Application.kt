package nl.pvanassen.christmas.tree.controller

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("christmas.tree.controller")
                .mainClass(Application.javaClass)
                .start()
    }
}