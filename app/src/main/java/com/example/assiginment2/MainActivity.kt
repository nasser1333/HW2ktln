package com.example.assiginment2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.first_menu, menu)
           return super.onCreateOptionsMenu(menu)    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
          when(item.itemId){
                        R.id.item1 ->{val frag1 = FirstFragment()
                         frag1.show(supportFragmentManager,"firstfragment")}
                        R.id.item2 ->{val frag2 = SecondFragment()
                            frag2.show(supportFragmentManager,"secondfragment")}
                   }
           return true;}

}