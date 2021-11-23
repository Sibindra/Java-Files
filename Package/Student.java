package com.testpackage;

class Student {
    private String name,roll;

    Student(String name,String roll){
        this.name=name;
        this.roll=roll;
    }

    public String toString(){
        String info="Name: "+this.name+"\n"+"Roll: "+this.roll;
        return info;
    }
}