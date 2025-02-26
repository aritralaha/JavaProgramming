package NaveenPrograms;

public class SingletonClass {

   private static SingletonClass instance = null;
   public String str;
    private SingletonClass(){
    str = "Aritra Laha";
    }

        private static SingletonClass getInstance() {
            if (instance == null) {
                instance = new SingletonClass();
            }
            return instance;

        }

    public static void main(String[] args){
        SingletonClass x = getInstance();
        SingletonClass y = getInstance();
        SingletonClass z = getInstance();
        x.str = x.str.toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);



    }

}
