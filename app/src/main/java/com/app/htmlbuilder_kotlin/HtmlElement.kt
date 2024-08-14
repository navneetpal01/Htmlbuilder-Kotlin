package com.app.htmlbuilder_kotlin


interface HtmlElement {
    fun render(indent: String): String
}

class HtmlTag private constructor(
    val name : String,
    val attributes : Map<String,String>,
    val children : List<HtmlElement>
): HtmlElement{
    override fun render(indent: String): String {
        val attributeString = attributes.entries.joinToString(separator = " "){(key,value) ->
            "$key=\"$value\""
        }

        return if (children.isEmpty()){
            "$indent<$name $attributeString/>"
        }else{
            val childrenString = children.joinToString("\n") {
                it.render("$indent    ")
            }


        }
    }


}