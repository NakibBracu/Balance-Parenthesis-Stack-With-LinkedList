import java.util.Scanner;
public class tester{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean equationtype = parenthesischeck(str);
    if(equationtype==true){
    System.out.println("balanced");
    }
    else{
    System.out.println("Not balanced!!!");
    }
    }
    static boolean parenthesischeck(String str){
        listStack a1 = new listStack();    
    for(int i=0;i<str.length();i++){
      char x = str.charAt(i);
        if(x=='('||x=='['|| x=='{'||x==')'||x=='}'||x==']'||x=='<'||x=='>'){
            if(x=='('||x=='['|| x=='{'||x=='<'){
                a1.push(x);
                continue;
            }
            if(a1.isEmpty()){
                return false;
            }
            switch(x){
                case ')':
                    char p = a1.pop();
                    if(p == '{' || p == '['||p =='<')
                        return false;
                    break;
                case '}':
                    p = a1.pop();
                    if (p == '(' || p == '['||p=='<')
                        return false;
                    break;
                case ']':
                    p = a1.pop();
                    if (p == '(' || p == '{'||p=='<')
                        return false;
                    break;
                case '>':
                    p = a1.pop();
                    if (p == '(' || p == '{'||p=='[')
                        return false;
                    break;
            }
      }else{
      continue;
      }
      }
       return (a1.isEmpty());
    }

}