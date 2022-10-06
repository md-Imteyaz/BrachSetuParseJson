package com.ParseJSON;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BranchSetupParseJsonApplication {
	static String inputjson = "{\"branchSetup\":{\n" + "    \"resourceDetails\":[{\n" + "        \"name\":\"ajay\",\n"
			+ "        \"designation\":\"surveyer\",\n" + "        \"contactNumber\":990908\n" + "    }],\n"
			+ "    \"branchReadyForOperations\": true,\n" + "    \"comments\":\"good\",\n" + "    \"survey\":[\n"
			+ "        {\n" + "        \"title\":\"HR process setup\",\n" + "        \"particularRecords\":[{\n"
			+ "                \"particular\":\"BM Deployed\",\n" + "                \"records\":[{\n"
			+ "                    \"particular\":\"BM1 Deployed\",\n" + "                    \"value\":true,\n"
			+ "                    \"assetId\":100\n" + "                },\n" + "                {\n"
			+ "                    \"particular\":\"BM2 Deployed\",\n" + "                    \"value\":true,\n"
			+ "                    \"assetId\":200\n" + "                }\n" + "                ]\n" + "        },\n"
			+ "        {\n" + "                \"particular\":\"PM Deployed\",\n" + "                \"records\":[{\n"
			+ "                    \"particular\":\"PM1 Deployed\",\n" + "                    \"value\":true,\n"
			+ "                    \"assetId\":100\n" + "                },\n" + "                {\n"
			+ "                    \"particular\":\"PM2 Deployed\",\n" + "                    \"value\":true,\n"
			+ "                    \"assetId\":200\n" + "                }\n" + "                ]\n" + "        }\n"
			+ "        ]\n" + "\n" + "    },\n" + "    {\n" + "        \"title\":\"IT & SYSTEM\",\n"
			+ "        \"particularRecords\":[{\n" + "                \"particular\":\"COMPUTER\",\n"
			+ "                \"records\":[{\n" + "                    \"particular\":\"COMPUTER 1\",\n"
			+ "                    \"value\":true,\n" + "                    \"assetId\":80\n" + "                },\n"
			+ "                {\n" + "                    \"particular\":\"COMPUTER 2\",\n"
			+ "                    \"value\":true,\n" + "                    \"assetId\":81\n" + "                }\n"
			+ "                ]\n" + "        },\n" + "        {\n" + "                \"particular\":\"PRINTER\",\n"
			+ "                \"records\":[{\n" + "                    \"particular\":\"PRINTER 1\",\n"
			+ "                    \"value\":true,\n" + "                    \"assetId\":90\n" + "                },\n"
			+ "                {\n" + "                    \"particular\":\"PRINTER 2\",\n"
			+ "                    \"value\":true,\n" + "                    \"assetId\":91\n" + "                }\n"
			+ "                ]\n" + "        }\n" + "        ]\n" + "\n" + "    }\n" + "    ]\n" + "    }\n" + "}\n"
			+ "";

	public static void main(String[] args) {
		SpringApplication.run(BranchSetupParseJsonApplication.class, args);

		JSONObject obj = new JSONObject(inputjson);
		String name = obj.getJSONObject("branchSetup").getString("comments");
		System.out.println(name);
		JSONArray arr = obj.getJSONArray(name);
		for (int i = 0; i < arr.length(); i++) {
			String post_id = arr.getJSONObject(i).getString("");
			System.out.println(post_id);
		}
	}
}
