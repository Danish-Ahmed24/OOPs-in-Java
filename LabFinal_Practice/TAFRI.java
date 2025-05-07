package LabFinal_Practice;


class AgeGreaterThan18 extends Exception{
    public AgeGreaterThan18(String m)
    {
        super(m);
    }
    public AgeGreaterThan18(){}
}


public class TAFRI {
    public static void main(String[] args) {
        int age = 30;
        try{
            if(age>18)
            {
                throw new AgeGreaterThan18("Age should be greater then 18");
            }
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
    }
}













/*
hi i am danish
hi i am danish
hi i am danish///
hi i am danish
bye i am danish
hi i am danish
hi i am danish
hi i am danish
admin.txt

--------------
2 files
1st -> the one to be updated
2nd -> blank file

blank.txt file------>
hi i am danish
hi i am danish
hi i am danish
hi i am danish
hi i am danish
hi i am danish
hi i am danish
hi i am danish

admin.txt -> delete
blank.txt -> rename admin.txt


 */


























