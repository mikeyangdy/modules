package com.ydy.leetCode;


public class Test925 {

    public static void main(String[] args) {
        // T F T T
        System.out.println(new Test925().isLongPressedName("alex", "aaleex"));
        System.out.println(new Test925().isLongPressedName("alex", "aaleelx"));
        System.out.println(new Test925().isLongPressedName("saeed", "ssaaedd"));
        System.out.println(new Test925().isLongPressedName("leelee", "lleeelee"));
        System.out.println(new Test925().isLongPressedName("laiden", "laiden"));
    }

//    public boolean isLongPressedName(String name, String typed) {
//
//        int n = 0;
//        for (int t =0;t<typed.length();t++){
//            if (typed.charAt(t) == name.charAt(n)){
//
//            }
//        }
//    }

    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;
        while (j < typed.length() && i < name.length()) {
            if (typed.charAt(j) == name.charAt(i)){
                j++;i++;
            }else if (j<(typed.length()-1) && typed.charAt(j+1) == typed.charAt(j)){
                j++;
            }else {
                return false;
            }
        }
        return i == name.length();
    }
}
