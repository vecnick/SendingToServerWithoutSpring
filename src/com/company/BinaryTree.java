package com.company;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class BinaryTree {

    public static void main(String[] args) throws IOException {

        String [] param = { "1", "34", "Male", "DigitalOcean", "DigitalOcean2", "DigitalOcean3"};
        String [] gift1 = new String[3];
        String [] gift2 = new String[3];
        String [] gift3 = new String[3];
        int n = 0;


        String send_param = "http://022a8ce0b6c6.ngrok.io/Posts/param?id=" + param[0] + "&age=" + param[1] + "&gender=" + param[2] + "&text=" + param[3] + "&text2=" + param[4] + "&text3=" + param[5];
        //System.out.println(send_param);

        URL obj = new URL(send_param);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        in.close();


        String get_gift1 = "http://022a8ce0b6c6.ngrok.io/Posts/gifts?id=1&number=1";

        URL obj1 = new URL(get_gift1);
        HttpURLConnection connection1 = (HttpURLConnection) obj1.openConnection();

        connection1.setRequestMethod("GET");

        BufferedReader in1 = new BufferedReader(new InputStreamReader(connection1.getInputStream()));
        String inputLine;

        while ((inputLine = in1.readLine()) != null) {

            //response.append(inputLine);
            gift1[n] = inputLine;

            //System.out.println(n);
            n = n + 1;

        }
        in1.close();
        n = 0;

        String get_gift2 = "http://022a8ce0b6c6.ngrok.io/Posts/gifts?id=1&number=2";

        URL obj2 = new URL(get_gift2);
        HttpURLConnection connection2 = (HttpURLConnection) obj2.openConnection();

        connection2.setRequestMethod("GET");

        BufferedReader in2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
        String inputLine2;

        while ((inputLine2 = in2.readLine()) != null) {

            gift2[n] = inputLine2;
            //System.out.println(n);
            n = n + 1;

        }
        in2.close();
        n = 0;


        String get_gift3 = "http://022a8ce0b6c6.ngrok.io/Posts/gifts?id=1&number=3";

        URL obj3 = new URL(get_gift3);
        HttpURLConnection connection3 = (HttpURLConnection) obj3.openConnection();

        connection3.setRequestMethod("GET");

        BufferedReader in3 = new BufferedReader(new InputStreamReader(connection3.getInputStream()));
        String inputLine3;

        while ((inputLine3 = in3.readLine()) != null) {

            gift3[n] = inputLine3;
            //System.out.println(n);
            n = n + 1;

        }
        in3.close();


        System.out.println(gift1[0]);
        System.out.println(gift1[1]);
        System.out.println(gift1[2]);
    }
}