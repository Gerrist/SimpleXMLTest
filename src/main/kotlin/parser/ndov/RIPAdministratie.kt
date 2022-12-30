package gerr.ist.ktrain.test.parser.ndov

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

@Root(strict = true, name = "RIPAdministratie")
class RIPAdministratie {
    @field:Element(name = "ReisInformatieProductID")
    lateinit var productId: String

    @field:Element(name = "AbonnementId")
    lateinit var subscriptionId: String

    @field:Element(name = "ReisInformatieTijdstip", required = true)
    lateinit var informationTimestamp: String
}