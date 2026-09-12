import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Example e = new Example();
        String s = e.reverse("abc", new ArrayList<>());        
        System.out.println(s);        
    }

    public String reverse(String str, List<String> list) {
        //str 부분에 null이 들어올 경우를 대비하기 위한 코드.
        if (str == null) {
        return null;
    }


        if(list == null){
            list = new ArrayList<>();
        }

        //문자열 길이의 값은 음수일 수 없다.
        if (str.length() == 0) {  
            StringBuffer sb = new StringBuffer();
            for (String s : list) {
                sb.append(s);
            }
            return sb.toString();         
            
        }
        list.add(str.substring(str.length()-1));
        return reverse(str.substring(0, str.length()-1), list);            
    }
}
