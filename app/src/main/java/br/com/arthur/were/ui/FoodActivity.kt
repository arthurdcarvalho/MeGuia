package br.com.arthur.were.ui

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.arthur.were.R
import br.com.arthur.were.databinding.ActivityFoodBinding

class FoodActivity : AppCompatActivity() {

    private lateinit var bind: ActivityFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_food)


        bind.fastFoodButton.setOnClickListener {
            val fastFood = Intent(this, FastFoodActivity::class.java)
            startActivity(fastFood)
        }

        bind.restaurantButton.setOnClickListener {
            val restaurant = Intent(this, RestaurantActivity::class.java)
            startActivity(restaurant)
        }
    }
}
