package hackerrank.tests.CitizenPracticeTest1;

import netscape.javascript.JSObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class HTTPRequest {
    public static void main(String[] args) {
        topArticles("olalonde", 1);
    }

    public static List<String> topArticles(String username, int limit){
        List<String> list = new ArrayList<>();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonmock.hackerrank.com/api/articles?author=" + username + "&page=" + limit)).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)

//                .thenApply(Parse::parsePlayer)
                .join()
                .toString();

        return list;
    }

    public static void parse(JSObject body){

    }
}
