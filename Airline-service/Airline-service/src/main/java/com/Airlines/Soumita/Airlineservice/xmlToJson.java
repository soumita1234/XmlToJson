package com.Airlines.Soumita.Airlineservice;


import org.json.JSONObject;
import org.json.XML;

public class xmlToJson {
    public static void main(String[] args) {
        String xmlStr = "<student>\r\n" +
                "<firstname> Soumita </firstname>\r\n" +
                "<lastname> Biswas </lastname>\r\n" +
                "<id> 2134060 </id>" +
                "</student>";

        JSONObject json= XML.toJSONObject(xmlStr);
        System.out.println(json);

    }

}
