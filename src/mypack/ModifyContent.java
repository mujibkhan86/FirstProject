package mypack;

public class ModifyContent {
    public static void main(String[] args) {
        String s= "NTF_IL_BNC_89049514_PruBSN - Billing & Collection";
               String ss=s.substring(s.lastIndexOf("_")+2);
        System.out.println("value is ::" + ss);
        int lastIndex = s.lastIndexOf("_");
        System.out.println(lastIndex);
        String str= s.substring(lastIndex + 1);
        //System.out.println("modify String is : " +modify);
        //String  s1=modify.
        System.out.println(str);



    }

    }



