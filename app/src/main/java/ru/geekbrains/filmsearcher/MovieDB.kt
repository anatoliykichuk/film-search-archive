package ru.geekbrains.filmsearcher

import java.net.URL
import java.net.URLConnection
import javax.net.ssl.HttpsURLConnection

object MovieDB {
    private val authenticationURL = "https://api.themoviedb.org/3/authentication/token/new?" +
            "api_key=${Keys.API}"

    fun connect(): URLConnection {
        return URL(authenticationURL).openConnection()
    }
}