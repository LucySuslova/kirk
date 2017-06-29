package com.automation.remarks.kirk.conditions

/**
 * Created by sergey on 25.06.17.
 */

class Have {

    fun text(text: String): Text {
        return Text(text)
    }

    fun collectionSize(size: Int): CollectionSize {
        return CollectionSize(size)
    }

    fun exactText(vararg text: String): CollectionExactText {
        return CollectionExactText(text)
    }

    fun attr(name: String, value: String): AttributeValue {
        return AttributeValue(name, value)
    }
}

val have = Have()