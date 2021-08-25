package ru.geekbrains.filmsearcher

import java.net.URLConnection

class Request(val connection: URLConnection, val query: String,
              val language: String = "en_US", val region: String = "", val year: Int = 2021) {

    val requestURL = "https://api.themoviedb.org/3/search/movie?api_key=${Keys.API}" +
            "&language=$language" +
            "&query=$query" +
            "&region=$region" +
            "&year=$year"

    fun getResponse(): Response {
        return Response()
    }
}