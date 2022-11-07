package com.example.assignment5_problem2.listeners

import com.example.assignment5_problem2.data.Product

interface ProductListener {
    fun onProductItemClicked(product: Product)
}