package com.skide

object Info {
    const val version = "2019.3.2"
    var prodMode = false
    var indpendentInstall = false
}

fun main(args: Array<String>) {
    CoreManager().bootstrap(args)
}