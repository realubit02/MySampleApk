package com.example.mysampleapk

data class ProductsModel(
    var products : ArrayList<Products> = arrayListOf(),
    var total    : Int?                = null,
    var skip     : Int?                = null,
    var limit    : Int?                = null
)

data class Products(
    var id                 : Int?              = null,
    var title              : String?           = null,
    var description        : String?           = null,
    var price              : Int?              = null,
    var discountPercentage : Double?           = null,
    var rating             : Double?           = null,
    var stock              : Int?              = null,
    var brand              : String?           = null,
    var category           : String?           = null,
    var thumbnail          : String?           = null,
    var images             : ArrayList<String> = arrayListOf()
)