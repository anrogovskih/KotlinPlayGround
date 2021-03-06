package com.example.rogovskih.kotlinplayground

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.example.rogovskih.kotlinplayground.aquarium.Aquarium
import com.example.rogovskih.kotlinplayground.spices.Curry
import com.example.rogovskih.kotlinplayground.spices.Spice

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        buildAquarium()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

//        val spices1 = listOf(
//            Curry(),
//            Spice("pepper", "medium"),
//            Spice("cayenne", "spicy"),
//            Spice("ginger", "mild"),
//            Spice("red curry", "medium"),
//            Spice("green curry", "mild"),
//            Spice("hot pepper", "extremely spicy")
//        )
//
//        val spice = Spice("cayenne", spiciness = "spicy")
//        val spicelist = spices1.filter {it.heat < 5}
//
    }

//    fun makeSalt() = Spice("Salt")


    private fun buildAquarium() {
        val aquarium = Aquarium(numberOfFish = 10)
        aquarium.height = 80
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
