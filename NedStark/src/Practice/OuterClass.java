package Practice;

public class OuterClass {
    private int numnb= 23;

    public void doStuff(){
        System.out.println("Doing stuff!!");
    }
    public class InnerClass{
        public void sayStuff(){
            System.out.println("Inner class saying stuff!!");
        }

    }
    public static class StaticClass{
        String variable ="Static class";
        public void printStaticClass(){
            System.out.println(variable);

            class John{
                public void nested(){
                    System.out.println("nested inner");
                }
            }
            John john = new John();
            john.nested();

        }
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inner = out.new InnerClass();
        OuterClass.StaticClass sta = new OuterClass.StaticClass();

        sta.printStaticClass();
        inner.sayStuff();
        out.doStuff();
    }

//
//    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
//
//    Pattern pattern = Pattern.compile(regex);
//
//for(String email : emails){
//        Matcher matcher = pattern.matcher(email);
//        System.out.println(email +" : "+ matcher.matches());
//    }
}
