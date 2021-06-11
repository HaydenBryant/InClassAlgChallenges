//package hackerrank.tests.CitizenPracticeTest1;
//
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class HTTPRequest {
//    public static void main(String[] args) {
//        topArticles("olalonde", 1);
//    }
//
//    public static List<String> topArticles(String username, int limit){
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonmock.hackerrank.com/api/articles?author=" + username + "&page=" + limit)).build();
//        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//
//                .thenApply(HTTPRequest::parse)
////                .thenAccept(System.out::println)
//                .join();
//    }
//
//    public static List<String> parse(String responseBody){
//        List<String> list = new ArrayList<>();
//
//        String regex = "";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//
//        return list;
//    }
//}
