public final class cat extends aniaml{

    public cat(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public cat(){
        System.out.println("I am a cat!");
    }


    @Override
    protected void eatig() {
        System.out.println("jessi喜欢吃鱼");

    }

    protected void sleeping() {
        System.out.println("jessi晚上不睡觉");
        super.sleeping();
    }



}
