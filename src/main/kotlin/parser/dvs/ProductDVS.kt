package gerr.ist.ktrain.test.parser.dvs

import gerr.ist.ktrain.test.parser.ndov.RIPAdministratie
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(strict = true, name = "ReisInformatieProductDVS")
class ProductDVS {
    @field:Element(name = "RIPAdministratie", required = true)
    lateinit var productProperties: RIPAdministratie

    @field:Element(name = "DynamischeVertrekStaat", required = true)
    lateinit var departureProduct: DynamischeVertrekStaat

    @field:Attribute(name = "TimeStamp", required = true)
    lateinit var timestamp: String

    @field:Attribute(name = "Versie", required = true)
    lateinit var version: String
}