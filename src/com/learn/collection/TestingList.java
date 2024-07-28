package com.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();  //  <> this is called diamond operator
        strList.add("Prashant");
        strList.add("Jain");
        strList.add(1,"Pradeep");
        strList.set(0,"Mujib");
        if ( strList.contains("Jain") ){
            System.out.println("Jain exit");
            System.out.println(strList.lastIndexOf("Jain"));
        }else{
            System.out.println("Jain not exit");
        }
      for(int i =0; i<strList.size();i++){
          System.out.print(strList.get(i));
      }
      for(String str : strList){
          System.out.println(str);
      }
    }
}
