package com.learn.stream.api.methodref;

public class SampleTestSum {
    public static void main(String[] args) {
        //SampleTestSum sampleTestSum = new SampleTestSum();
      Isum isum =  SampleTestSum::addition;  /*(a,b)->{
          return a+b;
      }  ;*/
        System.out.println(isum.sum(new SampleTestSum(),12,12));
    }

    public  int addition(int a, int b){
        return a+b;
    }
}
