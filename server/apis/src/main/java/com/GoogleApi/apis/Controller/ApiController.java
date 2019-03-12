package com.GoogleApi.apis.Controller;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;

@CrossOrigin
@Controller
public class ApiController {

        @ResponseBody
        @PostMapping("/token")
        public  String hfhfhfhhf(@RequestBody String tokenId) throws GeneralSecurityException, IOException {
            CloseableHttpClient client = HttpClients.createDefault();
            System.out.println(tokenId);
            System.out.println("\n");
            String newIdToken=tokenId.substring(8);
            System.out.println(newIdToken);
            HttpPost request = new HttpPost("https://www.googleapis.com/oauth2/v3/tokeninfo?id_token="+newIdToken);
            CloseableHttpResponse response = null;
            try {
                response = client.execute(request);
                int status = response.getStatusLine().getStatusCode();

                if (status >= 200 && status < 300) {
                    BufferedReader br;

                    br = new BufferedReader(new InputStreamReader(response
                            .getEntity().getContent()));

                    String line = "";
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                } else {
                    System.out.println("Unexpected response status: " + status);
                }
            } catch (IOException | UnsupportedOperationException e) {
                e.printStackTrace();
            } finally {
                if(null != response){
                    try {
                        response.close();
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return "received";
        }

    }

