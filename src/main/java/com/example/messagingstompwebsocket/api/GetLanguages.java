package com.example.messagingstompwebsocket.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class GetLanguages {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("x-rapidapi-host", "google-translate1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "719aa7f967msh8885dbeae712cc0p141f2fjsn86e293c1ad24")
                .addHeader("accept-encoding", "application/gzip")
                .build();


        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        GetLanguages example = new GetLanguages();
        String response = example.run("https://google-translate1.p.rapidapi.com/language/translate/v2/languages?target=en&model=nmt");
        System.out.println(response);
    }
}