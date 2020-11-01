public class level0 {
    public static void main(String[] args) {
        int i=0;
          while (i<100){
            i = i + 1;
            if (i == 50)
             continue;
             System.out.println(i);
          }

          do {
             i = i + 1;
             if (i == 50)
              continue;
              System.out.println(i);
          }while (i<100);

          for (i=0;i<100;i++){
                i = i + 1;
                if (i == 50)
                  continue;
               System.out.println(i);
          }
    }
}
