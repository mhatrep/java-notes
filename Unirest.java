// Ref: https://www.baeldung.com/unirest

Unirest.clearDefaultHeaders();
Unirest.setProxy(new HttpHost("localhost", 8080));
Unirest.shutdown();
Unirest.setTimeouts(20000, 15000);
Unirest.setConcurrency(20, 5);

// File Uploads
HttpResponse<JsonNode> jsonResponse = Unirest.post(
  "http://www.mocky.io/v2/5a9ce7663100006800ab515d")
  .field("file", new File("/path/to/file"))
  .asJson();
      
// Async Call
Future<HttpResponse<JsonNode>> future = Unirest.post(
"http://www.mocky.io/v2/5a9ce37b3100004f00ab5154?mocky-delay=10000ms")
.header("accept", "application/json")
.asJsonAsync(new Callback<JsonNode>() {

  public void failed(UnirestException e) {
      // Do something if the request failed
  }

  public void completed(HttpResponse<JsonNode> response) {
      // Do something if the request is successful
  }

  public void cancelled() {
      // Do something if the request is cancelled
  }
  });
        
      
// Response
jsonResponse.getStatus()
jsonResponse.getHeaders();
jsonResponse.getBody();
sonResponse.getRawBody();

// Request Methods
POST:
Unirest.post("http://www.mocky.io/v2/5a9ce7663100006800ab515d")

PUT:
Unirest.put("http://www.mocky.io/v2/5a9ce7663100006800ab515d")

GET:
Unirest.get("http://www.mocky.io/v2/5a9ce7663100006800ab515d")

DELETE:
Unirest.delete("http://www.mocky.io/v2/5a9ce7663100006800ab515d")

PATCH:
Unirest.patch("http://www.mocky.io/v2/5a9ce7663100006800ab515d")

OPTIONS:
Unirest.options("http://www.mocky.io/v2/5a9ce7663100006800ab515d")
  
// Request
Article article = new Article("ID1213", "Guide to Rest", "baeldung");
HttpResponse<JsonNode> jsonResponse 
= Unirest.post("http://www.mocky.io/v2/5a9ce7663100006800ab515d")
.body(article)
.asJson();
assertEquals(201, jsonResponse.getStatus());  
  
HttpResponse<JsonNode> jsonResponse 
= Unirest.post("http://www.mocky.io/v2/5a9ce7663100006800ab515d")
.body("{\"name\":\"Sam Baeldung\", \"city\":\"viena\"}")
.asJson();

HttpResponse<JsonNode> jsonResponse 
= Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154/{userId}")
.routeParam("userId", "123")

HttpResponse<JsonNode> jsonResponse 
= Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154")
.queryString("apiKey", "123")

//////////////////////////////////////////////////////////
Map<String, String> headers = new HashMap<>();
headers.put("accept", "application/json");
headers.put("Authorization", "Bearer 5a9ce37b3100004f00ab5154");

Map<String, Object> fields = new HashMap<>();
fields.put("name", "Sam Baeldung");
fields.put("id", "PSP123");

HttpResponse<JsonNode> jsonResponse 
= Unirest.put("http://www.mocky.io/v2/5a9ce7853100002a00ab515e")
.headers(headers).fields(fields)
.asJson();

assertNotNull(jsonResponse.getBody());
assertEquals(202, jsonResponse.getStatus());


HttpResponse<JsonNode> jsonResponse 
= Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154")
.header("accept", "application/json").queryString("apiKey", "123")
.asJson();
