package ru.geekbrains.filmsearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton;

class MainActivity : AppCompatActivity() {
    val connection = MovieDB.connect()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton: MaterialButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {


            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        connection.disconnect()
    }
}


