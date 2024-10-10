public class EfficientJavaTest {
    public static void main(String[]args){
        for(int num=100;num>=1;num--){
            System.out.println(num+(num%4==0?" even quatro":num%2==0?" even":""));
        }
    }
}