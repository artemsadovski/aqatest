//// Import classes:
//import ru.testit.client.invoker.ApiClient;
//import ru.testit.client.invoker.ApiException;
//import ru.testit.client.invoker.Configuration;
//import ru.testit.client.invoker.auth.*;
//import ru.testit.client.api.AutoTestsApi;
//import ru.testit.client.model.AutoTestModel;
//import ru.testit.client.model.AutoTestPostModel;
//
//public class Example {
//    public static void main(String[] args) {
//        ApiClient defaultClient = Configuration.getDefaultApiClient();
//        defaultClient.setBasePath("https://testit.softclub.by");
//
//        // Configure API key authorization: Bearer or PrivateToken
//        ApiKeyAuth PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("PrivateToken");
//        PrivateToken.setApiKey("NlFvcnhoZW9ZdUdtdjdlSFNn");
//        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//        PrivateToken.setApiKeyPrefix("PrivateToken");
//
//        AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
//        AutoTestPostModel autoTestPostModel = new AutoTestPostModel(); // AutoTestPostModel |
//        try {
//            AutoTestModel result = apiInstance.createAutoTest(autoTestPostModel);
//            System.out.println(result);
//        } catch (ApiException e) {
//            System.err.println("Exception when calling AutoTestsApi#createAutoTest");
//            System.err.println("Status code: " + e.getCode());
//            System.err.println("Reason: " + e.getResponseBody());
//            System.err.println("Response headers: " + e.getResponseHeaders());
//            e.printStackTrace();
//        }
//    }
//}