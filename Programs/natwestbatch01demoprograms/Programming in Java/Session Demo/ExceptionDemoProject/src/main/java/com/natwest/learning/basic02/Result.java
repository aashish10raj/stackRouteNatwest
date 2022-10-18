package com.natwest.learning.basic02;

class ResultImpl{
    public static void main(String[] args) {
        Result r1=new Result("Gosling",99);
        Result r2=new Result("Bill Gates",33);
        Result r3=new Result("Azeem Premji",102);

        try{
            r1.verify();
            r2.verify();
            r3.verify();
        }catch (MarksException e){
            e.printStackTrace();
        }


    }
}

public class Result {
    String name;
    int marks;

    public Result(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void verify() throws MarksException{
        if(marks>=0 && marks <35){
            System.out.println("Name : "+name+" : "+"Marks : "+marks+" : "+"Status : Failed");
        }else{
            if(marks>=35 && marks <=100)
                System.out.println("Name : "+name+" : "+"Marks : "+marks+" : "+"Status : Passed");
            else
                throw (new MarksException());
        }
    }
}
