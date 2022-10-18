package com.rbs.basic;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("StackRoute ");
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
        sbf.reverse();
        sbf.append(" Training");
        System.out.println(sbf);
        sbf.insert(11,"Java FSD");
        System.out.println(sbf);
        sbf.replace(11,19,"NatWest FSD");
        System.out.println(sbf);
        sbf.delete(11,19);
        System.out.println(sbf);
    }
}
