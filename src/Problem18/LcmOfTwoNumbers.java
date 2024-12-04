package Problem18;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        int a=20;
        int b=30;

        int lCM= lcmOfTwoNumbers(a,b);
        System.out.println(lCM);
    }
    public static int lcmOfTwoNumbers(int a,int b){

        int lcm=(a*b)/gCD(a,b);
        return lcm;
    }
    public static int gCD(int a,int b){
        if(b==0){
            return a;
        }
        return gCD(b,a%b);

    }
}
