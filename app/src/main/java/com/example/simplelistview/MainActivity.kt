package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayOfStrings = arrayOf<String>("zero","one","two","three","four","five","six","seven","eight","nine","ten")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayOfStrings)
        list_view.adapter = adapter
    }
}
