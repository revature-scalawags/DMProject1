package Project1


trait VGSaleDAO {
    def getAllVGSales(): List[VGSale]
    def getVGSalesByName(name: String): List[VGSale]
    def getVGSalesByPlatform(platform: String): List[VGSale]
    def getVGSalesByYear(year: Int): List[VGSale]
    def getVGSalesByGenre(genre: String): List[VGSale]
    def getVGSalesByPublisher(publisher: String): List[VGSale]
    def getVGSalesByLessThanEqualNA_Sales(na_Sales: Double)
    def getVGSalesByGreaterThanEqualNA_Sales(na_Sales: Double)
    def getVGSalesByLessThanEqualEU_Sales(eu_Sales: Double)
    def getVGSalesByGreaterThanEqualEU_Sales(eu_Sales: Double)
    def getVGSalesByLessThanEqualJP_Sales(jp_Sales: Double)
    def getVGSalesByGreaterThanEqualJP_Sales(jp_Sales: Double)
    def getVGSalesByLessThanEqualOther_Sales(other_Sales: Double)
    def getVGSalesByGreaterThanEqualOther_Sales(other_Sales: Double)
    def getVGSalesByLessThanEqualGlobal_Sales(na_Sales: Double)
    def getVGSalesByGreaterThanEqualGlobal_Sales(na_Sales: Double)
    def getVGsaleByRank(id: Int): VGSale

    def createVGSale(sale: VGSale): Boolean
    def UudateVGSale(sale: VGSale): Boolean
    def deleteVGSale(sale: VGSale): Boolean
}