import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CreateTask {
    static int a = (int) (Math.random()*(900000000+1)) + 100000000;
    public static String doc_id_auto = Integer.toString(a)+-123;

    public static void requestToSts() throws Exception {
        //public static void main(String[] args) throws Exception{
        URL url = new URL("http://192.168.190.37/integration/api/la/dictionary/statistics/filtered/send");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String jsonInputString = "{\"PRECHECK\": \"FALSE\",\"USER_ID\": \"81569\",\"DOC_TYPE\": \"doc_test\",\"DOC_SOURCE\": \"SA\",\"DOC_ID\": \"" + doc_id_auto + "\",\"AMOUNT_BYN\": \"10000\",\"CURRENCY\": \"BYN\",\"TEST_FIELD\": \"1234567838161233\"}";

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = conn.getResponseCode();
        System.out.println("Response Code : " + responseCode);
        System.out.println(doc_id_auto);

    }

}

