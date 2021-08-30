package ru.geekbrains.filmsearcher

import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection

object MovieDB {
    private val authenticationURL = "https://api.themoviedb.org/3/authentication/token/new?" +
            "api_key=${Keys.API}"

    fun connect(): HttpURLConnection {
        val connection = URL(authenticationURL).openConnection() as HttpURLConnection
        connection.setRequestMethod("GET")
        connection.connect()

        return connection
    }

    fun doRequest(requestURL: String) {
        // TODO: Используя класс Request, реализовать GET-запрос с возвратом JSON'а.
        // val request = Request...
        // response = connection...
    }

    fun getList(response: String): MovieList {
        return MovieList() // TODO: Реализовать десериализацию запроса в список.
    }
}