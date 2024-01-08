import java.util.*;
public class flames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name or your crush boy Name: ");
        String boyName=sc.nextLine();
        System.out.print("Enter your Name or your crush girl Name: ");
        String girlName=sc.nextLine();
        String b=boyName.toLowerCase().replaceAll("\\s","");
        String g=girlName.toLowerCase().replaceAll("\\s","");
        StringBuilder boy=new StringBuilder();
        boy.append(b);
        StringBuilder girl=new StringBuilder();
        girl.append(g);
        for (int i = 0; i < boy.length(); i++) {
            for (int j = 0; j < girl.length(); j++) {
                if(boy.charAt(i)==girl.charAt(j)){
                    boy.deleteCharAt(i);
                    girl.deleteCharAt(j);
                    if(i==0){
                        i=-1;
                    }
                    else{
                        i--;
                    }
                    break;
                }
            }
        }
        int len=boy.length()+girl.length();
        System.out.println(boy);
        System.out.println(girl);
        ArrayList<Character> list= new ArrayList<>();
      //  list.add(0,'0');
        list.add(0,'f');
        list.add(1,'l');
        list.add(2,'a');
        list.add(3,'m');
        list.add(4,'e');
        list.add(5,'s');
        while(list.size()>1){
            for (int i = 0; i < list.size(); i++) {
                int index=(len % list.size());
                if(index==0){
                    list.remove(list.size()-1);
                    break;
                }
                else{
                    list.remove(index-1);
                    break;
                }
            }
        }
        System.out.println();
        if(list.get(0)=='f'){
            System.out.println(boyName+" and "+girlName+" are FRIENDS");
        }
        else if(list.get(0)=='l'){
            System.out.println(boyName+" and "+girlName+" are LOVERS");
        }
        else if(list.get(0)=='a'){
            System.out.println(boyName+" and "+girlName+" are AFFECTION");
        }
        else if(list.get(0)=='m'){
            System.out.println(boyName+" and "+girlName+" are get MARRIAGE");
        }
        else if(list.get(0)=='e'){
            System.out.println(boyName+" and "+girlName+" are now ENEMIES");
        }
        else if(list.get(0)=='s'){
            System.out.println(boyName+" and "+girlName+" are SISTERS");
        }
    }
}
