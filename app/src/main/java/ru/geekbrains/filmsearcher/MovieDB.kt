package ru.geekbrains.filmsearcher

import java.net.URL
import java.net.URLConnection

object MovieDB {
    private val authenticationURL = "https://api.themoviedb.org/3/authentication/token/new?" +
            "api_key=${Keys.API}"

    fun connect(): URLConnection {
        return URL(authenticationURL).openConnection()
    }

    fun doRequest(requestURL: String) {
        // TODO: Используя класс Request, реализовать GET-запрос с возвратом JSON'а.
    }

    fun getList(response: String): MovieList {
        return MovieList() // TODO: Реализовать десериализацию запроса в список.
    }
}