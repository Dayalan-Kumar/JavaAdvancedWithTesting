package com.java.advanced.textblocks;
// textblocks - feature introduced in java15
public class TextBlocks {

    public static String multilineString(){
        var multiLine = "This is a\n"+
                "        multiline string\n"+
                "new lines inside";
        return multiLine;
    }

    public static String multilineStringV2(){
        var multiLine = """
                This is a
                 multiline string
                new lines inside
              """;
        return multiLine;
    }

    public static String multilineStringWithFormat(String name){
        var multiLine = """
                hello, %s!
                This is a
                 multiline string
                new lines inside
              """.formatted(name);
        return multiLine;
    }

    public static String sql(){
        var multiLine = """
               select * from employee
               where first_name='daya'
               and last_name='kumar'
              """;
        return multiLine;
    }

    public static String json(){
        var multiLine = """
              {
              "order_id" : 123456,
              "status" : "DELIVERED",
              "final_charge":99.99
              }
              """;
        return multiLine;
    }

    public static void main(String[] args) {
        System.out.println("multiline String ="+multilineString());
        System.out.println("multiline String V2 ="+multilineStringV2());
        System.out.println("multiline String V2 ="+multilineStringWithFormat("Daya"));
        System.out.println("sql ="+sql());
        System.out.println("json ="+json());
    }
}
