class MyEmployee{
    private int age;
    private String name;
     public String getname(){
        return name;
     }
     public void setname(String n){
        name=n;
     }
     public int getage(){
        return age;
     }
     public void setage(int a){
        age=a;
     }
}
class oops2{
    public static void main(String[] args) {
        MyEmployee akhil=new MyEmployee();
        akhil.setage(21);
        System.out.println(akhil.getage());
        akhil.setname("akhilreddykalva");
        System.out.println(akhil.getname());
    }
}