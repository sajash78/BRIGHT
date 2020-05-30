package Inheritance;

public class MainBank {
    public void mainBranch(){
        System.out.println("THIS IS MAIN BANK");
    }}
    class  Hsbc extends MainBank{
        public void branch(){
            System.out.println("THIS IS HSBC");
        }}
    class Lloyds extends MainBank{
        public void subBranch() {
            System.out.println("this is lloyd bank");
        };

    public static void main (String[] args){
        Lloyds obj = new Lloyds();
        obj.mainBranch();
        obj.subBranch();
    }}
