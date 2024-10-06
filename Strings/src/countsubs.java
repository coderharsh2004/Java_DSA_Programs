import java.util.Scanner;
public class countsubs {
    static int counting(String s,String sub){
        int len=s.length();String s1="";
        int k=sub.length();int ans=0;
        for(int start=0;start<=(len-k);start++){
            int end=(start+k);
            s1=s.substring(start,end);
            if(s1.equals(sub)){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter Sub-String to count");
        String sub=sc.nextLine();
        int ans=counting(s,sub);
        System.out.println("Number of Sub-Strings in the String");
        System.out.println(ans);
    }
}
