package com.exlab.common;

import java.util.HashMap;
import java.util.Map;

public class DataForApi {
    /** {
     "name": "aFm",
     "email": "dev@krafttechexlab.com",
     "password": "123467",
     "about": "About Me",
     "terms": "10"
     }
*/
    public static Map<String,Object> registerUserBody(String name,String email, String password,String about,String terms){

        Map<String,Object> requestMap=new HashMap<>();
        requestMap.put("name",name);
        requestMap.put("email",email);
        requestMap.put("password",password);
        requestMap.put("about",about);
        requestMap.put("terms",terms);
        return requestMap;
       }

       public static Map<String,Object> saveProfileBody(String name,String password, String admin,String about, String terms,String job, String company,String website,String location,String skills){
           Map<String,Object> profileBody=new HashMap<>();
           profileBody.put("name",name);
           profileBody.put("password",password);
           profileBody.put("admin",admin);
           profileBody.put("about",about);
           profileBody.put("terms",terms);
           profileBody.put("job",job);
           profileBody.put("company",company);
           profileBody.put("website",website);
           profileBody.put("location",location);
           profileBody.put("skills",skills);
           return profileBody;

       }
    public static Map<String,Object> experienceBody(String job,String company,String location,String fromdate, String todate,
                                                    String current,String description){
        Map<String, Object> experienceBody = new HashMap<>();
        experienceBody.put("job", job);
        experienceBody.put("company", company);
        experienceBody.put("location", location);
        experienceBody.put("fromdate", fromdate);
        experienceBody.put("todate", todate);
        experienceBody.put("current", current);
        experienceBody.put("description", description);
        return experienceBody;
    }


}
