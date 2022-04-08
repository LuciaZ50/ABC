package com.example.abc

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.abc.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId){
            R.id.nav_srce->Toast.makeText(this, "Obožavaš stranicu!",Toast.LENGTH_SHORT).show()
            R.id.novosti->Toast.makeText(this, "Svidja ti se stranica!",Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}




