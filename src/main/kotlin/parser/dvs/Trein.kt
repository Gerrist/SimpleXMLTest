package gerr.ist.ktrain.test.parser.dvs

import gerr.ist.ktrain.test.parser.ndov.Station
import org.simpleframework.xml.*

class Trein {
    @Root(name = "TreinEindBestemming")
    class TreinEindBestemming : Station() {
        @field:Attribute(name = "InfoStatus")
        lateinit var infoStatus: String
    }

    @Root(name = "TreinVertrekSpoor")
    class TreinVertrekSpoor {
        @field:Attribute(name = "InfoStatus")
        lateinit var infoStatus: String

        @field:Element(name = "SpoorNummer")
        lateinit var spoorNummer: String

        @field:Element(name = "SpoorFase", required = false)
        lateinit var spoorFase: String
    }

    @Root(name = "VertrekTijd")
    class VertrekTijd {
        @field:Attribute(name = "InfoStatus")
        lateinit var infoStatus: String

        @field:Text
        lateinit var value: String
    }

    @Root(name = "VerkorteRoute")
    class VerkorteRoute{
        @field:Attribute(name = "InfoStatus")
        lateinit var infoStatus: String

        @field:ElementList(inline = true, entry = "Station")
        lateinit var stations: List<Station>
    }

    @Root(name = "PresentatieTreinEindBestemming")
    class PresentatieTreinEindBestemming {
        @field:Element(name = "Uitingen")
        lateinit var expressions: Expressions
    }

    @Root(name = "PresentatieTreinVertrekSpoor")
    class PresentatieTreinVertrekSpoor {
        @field:Element(name = "Uitingen")
        lateinit var expressions: Expressions
    }

    @Root(name = "Uitingen")
    class Expressions {
        @field:Element(name = "Uiting")
        lateinit var expression: String
    }

    @field:Element(name = "TreinNummer")
    lateinit var serviceId: String

    @field:Element(name = "TreinSoort")
    lateinit var serviceType: String

    @field:Element(name = "TreinStatus")
    lateinit var status: String

    @field:Element(name = "TreinFormule")
    lateinit var serviceFormula: String

    @field:Element(name = "Vervoerder")
    lateinit var operator: String

    @field:Element(name = "Reserveren")
    lateinit var reservation: String

    @field:Element(name = "Toeslag")
    lateinit var surcharge: String

    @field:Element(name = "NietInstappen")
    lateinit var noBoarding: String

    @field:Element(name = "AchterBlijvenAchtersteTreinDeel")
    lateinit var rearPartStaysBehind: String

    @field:Element(name = "RangeerBeweging")
    lateinit var shuntingMove: String

    @field:Element(name = "SpeciaalKaartje")
    lateinit var specialTicket: String

    @field:ElementList(required = false, inline = true)
    lateinit var treinEindBestemmingList: List<TreinEindBestemming>

    @field:Element(name = "PresentatieTreinEindBestemming")
    lateinit var presentationDestination: PresentatieTreinEindBestemming

    @field:ElementList(required = false, inline = true)
    lateinit var departureTimes: List<VertrekTijd>

    @field:Element(name = "ExacteVertrekVertraging", required = false)
    lateinit var exactDepartureDelay: String

    @field:Element(name = "GedempteVertrekVertraging", required = false)
    lateinit var roundedDepartureDelay: String

    @field:ElementList(required = false, inline = true)
    lateinit var departureTracks: List<TreinVertrekSpoor>

    @field:Element(name = "PresentatieTreinVertrekSpoor")
    lateinit var presentationDepartureTrack: PresentatieTreinVertrekSpoor

    @field:Element(name = "VertrekRichting")
    lateinit var departureDirection: String

    @field:Element(name = "AfstandPerronEindKopVertrekTrein")
    lateinit var distancePlatformDeparture: String

    @field:ElementList(required = false, inline = true)
    lateinit var shortenedRoute: List<VerkorteRoute>
}