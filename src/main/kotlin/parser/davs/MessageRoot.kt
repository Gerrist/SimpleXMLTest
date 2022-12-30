package gerr.ist.ktrain.test.parser.davs

import gerr.ist.ktrain.test.parser.dvs.ProductDVS
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(strict = false, name = "PutReisInformatieBoodschapIn")
class MessageRoot {
    @field:Element(name = "ReisInformatieProductDVS", required = true)
    var productDVS: ProductDVS? = null
}