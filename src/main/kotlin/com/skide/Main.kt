package com.skide

object Info {
    const val version = "2020.1-not-corona"
    var prodMode = false
    var indpendentInstall = false
}

fun main(args: Array<String>) {
    CoreManager().bootstrap(args)
}