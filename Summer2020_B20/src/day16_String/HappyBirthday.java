package day16_String;

    import java.util.*;
    public class HappyBirthday {
        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            Set<String> set = new TreeSet<String>();
            Map<String, String> map = new TreeMap<String, String>();
            String s = "HappyBirthday";
            int length = s.length();
            for (int i = 0; i < length; i++) {
                String c = s.charAt(i) + "";
                String o = s.charAt(length - i) + "";
                list.add(c);
                set.add(c);
                map.put(c, o);
            }
            System.out.println(list + "\n" + set + "\n" + map);
        }
    }

