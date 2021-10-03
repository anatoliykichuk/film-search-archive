package ru.geekbrains.filmsearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.button.MaterialButton;
import ru.geekbrains.filmsearcher.model.MovieDB

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //val connection = MovieDB.connect()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val queryText: EditText = findViewById(R.id.query_text)

        val searchButton: MaterialButton = findViewById(R.id.search_button);
        searchButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                try {
                    val connection = MovieDB.connect()
                }
                finally {
                    //connection.close()
                    val a = 0
                }

                val query = queryText.text;

            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        //connection.disconnect()
    }
}


