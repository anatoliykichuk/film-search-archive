package ru.geekbrains.filmsearcher

import java.net.URLConnection

class Request(val connection: URLConnection, val query: String,
              val language: String = "en_US", val region: String = "", val year: Int = 2021) {

    fun getURL(): String {
        return "https://api.themoviedb.org/3/search/movie?api_key=${Keys.API_KEY}" +
                "&language=$language" +
                "&query=$query" +
                "&region=$region" +
                "&year=$year"
    }
}