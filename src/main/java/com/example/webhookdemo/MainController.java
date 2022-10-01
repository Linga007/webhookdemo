package com.example.webhookdemo;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping
public class MainController {
    @Value("${secret}")
    String secret;




//    public ResponseEntity<Object> hub(@RequestBody Object obj) {
//        Query query=null;
//        if (
//                obj.query['hub.mode'] == 'subscribe' &&
//                        obj.query['hub.verify_token'] == secret
//        ) {
//            res.send(obj.query['hub.challenge']);
//        } else {
//            res.sendStatus(400);
//        }
//        return  Object;
//    }
//    @PostMapping("/webhook")
//    public ResponseEntity<String> postjsonObject(@RequestParam  String object  ){
//        System.out.println("============"+object);
//        return new ResponseEntity<String>(object, HttpStatus.OK);
//
//    }

//    @PostMapping("/webhook")
//    public ResponseEntity<String> postjsonObject(@RequestBody String object){
//        System.out.println("============"+object);
//        return new ResponseEntity<String>(object, HttpStatus.OK);
//
//    }
//    @Controller
//    public class TestRequestController {
//        @RequestMapping(path = "/testrequest", method = RequestMethod.POST)
//        public String testGetRequest(@RequestBody String request) throws IOException {
//            final byte[] requestContent;
//            requestContent=I
//            requestContent = IOUtils.toByteArray(request.getBytes(StandardCharsets.UTF_8));
//            return new String(requestContent, StandardCharsets.UTF_8);
//        }
//    }




    @GetMapping("/console")
    public ResponseEntity<String> getjsonObject(@RequestParam String name) {
        System.out.println("============" + name);
        return new ResponseEntity<String>(name, HttpStatus.OK);
    }
    @GetMapping("/console1")
    public ResponseEntity<Object> getjsonObject(@RequestParam Map<String,String> object) {
        System.out.println("============" + object.toString());
        object.keySet();
        object.values();
        System.out.println(getjsonObject(object));
        return new ResponseEntity<Object>(getjsonObject(object), HttpStatus.OK);
//        return new ResponseEntity<Object>(Map<String,String>Object, HttpStatus.OK);


    }
    @RequestMapping(path = "/testrequest", method = RequestMethod.POST)
    public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
        Map<String, String> query_pairs = new LinkedHashMap<>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
        }
        return query_pairs;
    }

    @PostMapping(path = {"/webhook"})
    public ResponseEntity<Object> userpost(@RequestParam(required=false) Map<String,String> qparams) {
        qparams.forEach((a,b) -> {
                    System.out.println(String.format("%s -> %s", a, b));
                });
        return new ResponseEntity<Object>(qparams,HttpStatus.OK);

    }
    @GetMapping(path = {"/webhook"})
    public ResponseEntity<Object> getpost(@RequestParam(required=false) Map<String,String> qparams) {
        qparams.forEach((a,b) -> {
            System.out.println(String.format("%s -> %s", a, b));
        });
        return new ResponseEntity<Object>(qparams,HttpStatus.OK);

    }

//    @GetMapping(path = {"/webhook"})
//    public ResponseEntity<Object> userpost(@RequestParam(required=false) Map<String,String> qparams) {
//        qparams.forEach((a, b) -> {
//            System.out.println(String.format("%s -> %s", a, b));
//        });
//
//        return new ResponseEntity<Object>(qparams,HttpStatus.OK);


//    public ResponseEntity<String> userget(@RequestParam String ) {
//        String res=null;
////        String mode="hub.mode";
////        String challange="hub.challenge";
////        String token="hub.verify_token";
//        if(secret.equals(token)){
////            if(mode=="subscribe" && token==secret){
////                challange="condection";
//                 res="suess";
//                return ResponseEntity.status(HttpStatus.OK).body(res);
//            }else{
//                res="fail";
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(res);
//
//            }


    }

//        try {
//            FileWriter myWriter = new FileWriter("C:\\Users\\91824\\Desktop\\data.txt");
//            qparams.forEach((a,b)->{
//            myWriter.write(System.out.println(String.format("%s -> %s", a, b));
//            }
//            );
//
//            myWriter.close();
//            if (myWriter.createNewFile()) {
//                System.out.println("File created: " + myWriter.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");



//    }





//


