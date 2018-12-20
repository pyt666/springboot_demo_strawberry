package com.jh.strawberry.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


/**
 * @author pyt
 * @createTime 2018年12月4日下午2:50:26
 */
@RestController
@RequestMapping("api")
public class test {
	@RequestMapping("test")
	public String test() {
		
		/*@SuppressWarnings("static-access")
		MongoClient mongoClient = mongoDBUtil.getMongoClientByCredential("localhost", 27017, "jhs_admin", "jh_strawberry", "kyNVQREg");
		System.out.println(mongoClient.toString());
		 MongoCollection<Document> collection = mongoDBUtil.getMongoCollection(mongoClient,"jh_strawberry","device");
         Map<String,Object> insert = new HashMap<>();
            //1、测试增加
         insert.put("name","test");
         insert.put("device_sn", "281908210");
         insert.put("product_id",1);
         insert.put("create_time",new Date());
         mongoDBUtil.insertDoucument(collection,insert);*/
		/*System.out.println(mongoClient);
		MongoDatabase mongoDatabase =  mongoClient.getDatabase("jh_strawberry");
		mongoDatabase.createCollection("device");
		System.out.println(mongoDatabase.getName());*/
		return "Success!!!";
	}
	/*private static String userName="jhs_admin";
	private static String source="jh_strawberry";
	private static String pwd="kyNVQREg";
	
	private static MongoCredential credential = MongoCredential.createScramSha256Credential(userName, source, pwd.toCharArray());
	private static MongoClient mongoClient = MongoClients.create(
	        MongoClientSettings.builder()
	                .applyToClusterSettings(builder -> 
	                        builder.hosts(Arrays.asList(new ServerAddress("127.0.0.1", 27017))))
	                .credential(credential)
	                .build());*/
}

