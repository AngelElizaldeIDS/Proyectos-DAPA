package com.example.layoutsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botones del menú principal
        val btnLinear: Button = findViewById(R.id.btnLinear)
        val btnRelative: Button = findViewById(R.id.btnRelative)
        val btnGrid: Button = findViewById(R.id.btnGrid)
        val btnTable: Button = findViewById(R.id.btnTable)

        btnLinear.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }

        btnRelative.setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }

        btnGrid.setOnClickListener {
            startActivity(Intent(this, GridLayoutActivity::class.java))
        }

        btnTable.setOnClickListener {
            startActivity(Intent(this, TableLayoutActivity::class.java))
        }
    }
}
