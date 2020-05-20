package org.example

import com.typesafe.config.ConfigFactory
import java.util.*

const val PROPERTY_KEY1 = "k1"
const val PROPERTY_KEY2 = "k2"

fun main(args: Array<String>) {
    val property = Properties()
    property.setProperty(PROPERTY_KEY1, "100")
    property.setProperty(PROPERTY_KEY2, "-100")
    val conf = ConfigFactory.parseProperties(property)

    assert(conf.getInt(PROPERTY_KEY1) == 100)
    assert(conf.getLong(PROPERTY_KEY1) == 100L)

    assert(conf.getInt(PROPERTY_KEY2) == -100)
    assert(conf.getLong(PROPERTY_KEY2) == -100L)
}

