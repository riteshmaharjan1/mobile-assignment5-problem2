package com.example.assignment5_problem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assignment5_problem2.data.Product
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun goToProductListActivity(productList: ArrayList<Product>) {
        val intent = Intent(this, ItemListActivity::class.java)
        intent.putExtra("productList", Gson().toJson(productList))
        startActivity(intent)
    }

    fun onElectronicClicked(view: View) {
        val electronicItemList = ArrayList<Product>()
        val product1 = Product(
            "Epson Printer",
            250.00,
            "White",
            "" + R.drawable.epson,
            "PRT1",
            "4 in one printer with A1 size print"
        )

        val product2 = Product(
            "Apple Tablet",
            128.25,
            "White",
            "" + R.drawable.tablet,
            "Tablet1",
            "Apple Tablet."
        )

        val product3 = Product(
            "Lenovo Thinkpad Laptop",
            950.00,
            "Black",
            "" + R.drawable.lenovo,
            "LEN24",
            "Very thin laptop. Suitable for travellers."
        )
        val product4 = Product(
            "Sony Headphone",
            2800.00,
            "White and Black",
            "" + R.drawable.headphone,
            "SONY101",
            "Sony's intelligent noise-cancelling headphones with premium sound elevate your listening experience with the ability to personalize and control everything you hear."
        )

        val product5 = Product(
            "MackBook Pro",
            2128.25,
            "Silver",
            "" + R.drawable.mackbook,
            "MCK12",
            "8-core CPU with 4 performance cores and 4 efficiency cores"
        )

        electronicItemList.add(product1)
        electronicItemList.add(product2)
        electronicItemList.add(product3)
        electronicItemList.add(product4)
        electronicItemList.add(product5)

        goToProductListActivity(electronicItemList)
    }

    fun onClothingClicked(view: View) {
        val clothingItemList = ArrayList<Product>()
    }

    fun onBeautyClicked(view: View) {
        val beautyItemList = ArrayList<Product>()
    }

    fun onFoodClicked(view: View) {
        val foodItemList = ArrayList<Product>()
    }
}