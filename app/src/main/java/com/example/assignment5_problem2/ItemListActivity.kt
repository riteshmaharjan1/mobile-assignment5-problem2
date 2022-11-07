package com.example.assignment5_problem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment5_problem2.data.Product
import com.example.assignment5_problem2.listeners.ProductListener
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class ItemListActivity : AppCompatActivity(), ProductListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        val type: Type = object : TypeToken<List<Product?>?>() {}.type

        val productList: ArrayList<Product> = Gson().fromJson(
            intent.getStringExtra("productList"),
            type
        )
        val recyclerProductItem: RecyclerView = findViewById(R.id.recyclerCategoryItem)

        val adapter = ProductAdapter(productList, this)
        recyclerProductItem.adapter = adapter
    }

    override fun onProductItemClicked(product: Product) {
        val intent = Intent(this, ProductDetailActivity::class.java)
        intent.putExtra("product", Gson().toJson(product))
        startActivity(intent)
    }

}