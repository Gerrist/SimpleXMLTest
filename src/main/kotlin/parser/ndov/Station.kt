package gerr.ist.ktrain.test.parser.ndov

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text


@Root(name = "Station", strict = true)
open class Station {
    @field:Element(name = "StationCode")
    lateinit var stationCode: String

    @field:Element(name = "Type")
    lateinit var type: String

    @field:Element(name = "KorteNaam")
    lateinit var shortName: String

    @field:Element(name = "MiddelNaam")
    lateinit var middleName: String

    @field:Element(name = "LangeNaam")
    lateinit var longName: String

    @field:Element(name = "UICCode")
    lateinit var uicCode: String
}