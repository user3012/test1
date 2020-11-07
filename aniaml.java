public class aniaml {

       protected String name;
       protected String sex;
       protected int age;

       protected void eatig() {
           System.out.println("我可以吃很多东西");

       }

       protected void sleeping() {
           System.out.println("我爱睡觉");
       }

       protected int getAge() {
           return age;
       }

        protected void setAge(int age) {
        this.age = age;
        }

        protected String getName(){
             return name;
        }


        protected void  setName(String name){
             this.name = name;
        }

         protected String getSex() {
         return sex;
         }

         protected void setSex(String sex) {
         this.sex = sex;
         }
}
