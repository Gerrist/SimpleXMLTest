package gerr.ist.ktrain.test.parser.dvs

import gerr.ist.ktrain.test.parser.ndov.Station
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

@Root(strict = false, name = "DynamischeVertrekStaat")
class DynamischeVertrekStaat {

    class RitId {
        @field:Text
        var content: String? = null
    }

    class RitDatum {
        @field:Text
        var content: String? = null
    }

    @field:Element(name = "RitId", required = true)
    lateinit var serviceId: RitId

    @field:Element(name = "RitDatum", required = true)
    lateinit var serviceDate: RitDatum

    @field:Element(name = "RitStation", required = true)
    lateinit var departureStation: Station

    @field:Element(name = "Trein", required = true)
    lateinit var train: Trein
}