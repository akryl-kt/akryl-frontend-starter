package app

import io.akryl.component
import io.akryl.dom.html.h1
import react_dom.ReactDom
import kotlin.browser.document

fun app() = component {
  h1(text = "Hello, World!")
}

fun main() {
  ReactDom.render(app(), document.getElementById("app"))
}
