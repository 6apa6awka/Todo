package com.first.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.ArrayAdapter



class MainActivity : AppCompatActivity() {

    var names = arrayOf("Иван", "Марья", "Петр", "Антон", "Даша", "Борис", "Костя", "Игорь", "Анна", "Денис", "Андрей")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView = findViewById<ListView>(R.id.qqq)
        var button = findViewById<FloatingActionButton>(R.id.floating_action_button);
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, names
        )
        listView.adapter = adapter;


        button.setOnClickListener {
            adapter.add("new Test")
        }
    }
}
