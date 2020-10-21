package com.ydy.easypoi;

import java.util.ArrayList;
import java.util.List;

public class MockUtil {

    public static String[] channel(){
        String[] channel = {"A—综合渠道","B—车商渠道","C—银保渠道","D—代理渠道","E—经纪重客渠道"
                        ,"F—电商渠道","G—三农渠道","H—互动渠道"};
        return channel;
    }

    public static String[] bsns(){
        String[] bsns = {"A0108—直销（门店）","B0101—兼业代理（车商）","B0107—经纪业务（车商保）"
                        ,"C0101—兼业代理（银保）","E0302—个人代理","F0101—电话呼出","F0102—电话呼入"
                        ,"F0103—电销（辅助）","F0201—网销（直销）","F0202—网销（合作）","F0203—网销（辅助）"
                        ,"F0301—移动（直销）","F0302—移动（辅助）","G0101—直销（员工）","G0102—专业代理"
                        ,"G0103—兼业代理（其他）","G0104—经纪业务"};
        return bsns;
    }

    public static List<List<String>> getList(){

        List<List<String>> sList = new ArrayList<>();

        for (String channel : channel()){
            String first = channel.substring(0,1);
            List<String> tList = new ArrayList<>();
            for (String bsns : bsns()){
                if (bsns.startsWith(first)){
                    tList.add(bsns);
                }
            }
            sList.add(tList);
        }
        return sList;
    }

    public static void main(String[] args) {
        getList();
    }
}
