package com.app.htmlbuilder_kotlin






val html = html {
    text("Hello Kotlin")
}






fun main() {
    println(html.render(""))
}