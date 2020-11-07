public class doge extends aniaml {

    public doge(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public doge(){
        System.out.println("I am a dog!");
    }

    @Override
    protected void sleeping() {
        System.out.println("Bob晚上睡觉");

    }
    protected void run(){
        System.out.println("Bob跑的很快");
    }
    protected void run(char a){
        System.out.println("Bob真的跑得很快"+a);
    }
    protected int run(int a){
        System.out.println("我"+a+"岁了，我能跑很快");
         return a;
    }











}
