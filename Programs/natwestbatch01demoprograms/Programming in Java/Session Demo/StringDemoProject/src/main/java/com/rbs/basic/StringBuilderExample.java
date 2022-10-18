package com.rbs.basic;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("StackRoute ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.append(" Training");
        System.out.println(sb);
        sb.insert(11,"Java FSD");
        System.out.println(sb);
        sb.replace(11,19,"NatWest FSD");
        System.out.println(sb);
        sb.delete(11,19);
        System.out.println(sb);
    }

}
