package ppt_programs;

class Parent{
    public void panda(){
    System.out.println("I am Parent panda");
    }
} 
class Child extends Parent{
    public  void panda(){
    System.out.println("I am child panda");
     }
    public static void main(String[] args){
     Parent p=new Child();
      p.panda();// I am child panda
      Child c=new Child();
      c.panda();// I am child panda
      }
}