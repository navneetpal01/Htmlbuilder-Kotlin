package com.app.htmlbuilder_kotlin


fun html(configure: HtmlTag.Builder.() -> Unit) : HtmlElement{
    val builder = HtmlTag.Builder("html")
    builder.configure()
    return builder.build()
}


fun HtmlTag.Builder.addAttribute(attribute: Pair<String, String>) {
    attributes = attributes.plus(attribute)
}

fun HtmlTag.Builder.addChild(child: HtmlElement) {
    children = children.plus(child)
}


fun HtmlTag.Builder.text(text: String) {
    addChild(object : HtmlElement {
        override fun render(indent: String) = "$indent$text"
    })
}

/**
 * fun HtmlTag.Builder.addAttribute(attribute: Pair<String, String>) {
 *     attributes = attributes.plus(attribute)
 * }
 *
 * fun HtmlTag.Builder.addChild(child: HtmlElement) {
 *     children = children.plus(child)
 *}
 * fun HtmlTag.Builder.text(text: String) = addChild { indent -> "$indent$text" }
 */