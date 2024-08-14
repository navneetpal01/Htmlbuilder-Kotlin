package com.app.htmlbuilder_kotlin


fun html(configure: HtmlTag.Builder.() -> Unit) : HtmlElement{
    val builder = HtmlTag.Builder("html")
    builder.configure()
    return builder.build()
}