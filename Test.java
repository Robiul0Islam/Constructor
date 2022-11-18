public class Test {
    public int a,b,result;
    public Test(int robi,int sadat){
        this.a=robi;
        this.b=sadat;
    }
    public void addition(){
         result=a+b;
         System.out.println(result);
    }
    public static void main(String[] args) {
        Test m=new Test(10, 20);
        Test n=new Test(25, 10);
        n.addition();
    }
}
