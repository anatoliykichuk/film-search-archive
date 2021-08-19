package ru.geekbrains.filmsearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleButton: MaterialButton = findViewById(R.id.example_button);
        exampleButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }
        })
    }
}


