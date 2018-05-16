import java.util.*;
import java.util.regex.Pattern;

public class Test {

    private final static int MAX_UPLOAD_LINE = 2;
    public static void main(String args[]) {
        String str = "1232.3";
        System.out.println(isNumeric(str));
        System.out.println(isInteger(str));
        System.out.println(isDouble(str));
        testSet();
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }


    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static boolean isDouble(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static void testSet() {
        Set<String> set = new HashSet<>();
        set.add("1");
      /*  set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");*/

        List<String> list = new ArrayList<>(set);
        int len = list.size();

        if (len > MAX_UPLOAD_LINE) {
            int subLen = len/MAX_UPLOAD_LINE;
            if (len % MAX_UPLOAD_LINE != 0) {
                subLen += subLen;
            }
            Set<String> subSet;
            int start = 0;
            for (int i = 1; i < subLen; i++) {
                int size = MAX_UPLOAD_LINE*i;
                if (size > len){
                    size = len;
                }
                subSet = new HashSet<>(list.subList(start,size));
                System.out.println(subSet);
                start = size;
            }
        }
    }
}
