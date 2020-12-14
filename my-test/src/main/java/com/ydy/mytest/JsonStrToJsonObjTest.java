package com.ydy.mytest;


/**
 *@Author yangduyu
 *@Date 2020/11/18
 *@Description json字符串转json对象
 */
public class JsonStrToJsonObjTest {


    public static void main(String[] args) {
        String jsonStr = "\"appNme\": \"\",\n" +
                "        \"tbrSex\": \"\",\n" +
                "        \"tbrNature\": \"\",\n" +
                "        \"tbrBirth\": \"\",\n" +
                "        \"tbrIdType\": \"\",\n" +
                "        \"certfCde\": \"\",\n" +
                "        \"tbrAddr\": \"\",\n" +
                "        \"tbrPostCode\": \"\",\n" +
                "        \"tbrTel\": \"\",\n" +
                "        \"mobile\": \"\",\n" +
                "        \"emailCode\": \"\",\n" +
                "        \"tbrRelation\": \"\",\n" +
                "        \"tbrProvince\": \"\",\n" +
                "        \"tbrCity\": \"\",\n" +
                "        \"tbrCountry\": \"\",\n" +
                "        \"tbrIdDate\": \"\",\n" +
                "        \"tbrIdStartDate\": \"\",\n" +
                "        \"tbrIdEndDate\": \"\",\n" +
                "        \"tbrCountryProve\": \"\",\n" +
                "        \"forPerson\": \"\""
                ;
        String desc = "投保人名称,\n" +
                "投保人性别,\n" +
                "投保人性质,\n" +
                "投保人出生日期,\n" +
                "投保人证件类型,\n" +
                "身份证号码,\n" +
                "投保人住址,\n" +
                "投保人邮编,\n" +
                "投保人联系电话,\n" +
                "手机号,\n" +
                "投保人邮箱,\n" +
                "投保人与被保险人关系,\n" +
                "投保人省份,\n" +
                "投保人市,\n" +
                "投保人区县,\n" +
                "客户证件有效期,\n" +
                "客户证件有效期起期,\n" +
                "客户证件有效期止期,\n" +
                "投保人国籍,\n" +
                "为谁投保,"
                ;

        jsonStr2JsonObj(jsonStr,desc,false);
    }


    private static void jsonStr2JsonObj(String jsonStr, String desc, boolean bHasValue ){
        jsonStr = jsonStr.replaceAll("\"", "");
        String[] split = jsonStr.split(",");
        String[] descArr = desc.replaceAll("\n","").split(",");
        StringBuilder builder = new StringBuilder();

        int i =0;
        for (String s : split) {
            s = s.trim();
            int index = s.indexOf(":");
            String value = s.substring(index+1).trim();
            String appStr = s.substring(0, index+1) + " '"
                     + "', // "+descArr[i]+" "+ (bHasValue?value:"")+"\n";
            builder.append(appStr);
            i++;
        }
        System.out.println(builder.toString());
    }
}
