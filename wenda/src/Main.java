import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        demoOperation();
//        demoString();
//        demoControlFlow();
//        demoList();
//        demoMapTable();
//        demoSet();
//        demoException();
//        demoOO();
        demoFunction();
    }

    private static void demoFunction() {
        Random random = new Random();

//        random.setSeed(1);
        print(1, random.nextInt(1000));
        print(2, random.nextFloat());

        List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        Collections.shuffle(array);
        print(3, array);

        Date date = new Date();
        print(4, date);
        print(5, date.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(6, df.format(date));

        print(7, UUID.randomUUID());
        print(8, Math.log(10));
        print(9, Math.min(3, 10));
        print(10, Math.max(111, 10));
        print(11, Math.ceil(2.2));
        print(12, Math.floor(2.2));
    }

    public static void demoOO() {
        Animal a = new Animal("Jim", 1);
        a.say();
        Animal human = new Human("Lei", 11, "China");
        human.say();
    }

    private static void demoException() {
        try {
            int k = 2;
//            k = k / 0;
            if (k == 2) {
                throw new Exception("我故意的");
            }
        } catch (Exception e) {
            print(2, e.getMessage());
        } finally {
            print(3, "finally");
        }
    }

    private static void demoSet() {
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 3; i++) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.remove(String.valueOf(1));
        print(2, strSet);
        print(3, strSet.contains(String.valueOf(1)));
        print(4, strSet.isEmpty());
        print(5, strSet.size());

        strSet.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(6, strSet);
        for (String value : strSet) {
            print(7, value);
        }
    }


    /**
     * 打印内容
     *
     * @param index  索引
     * @param object 对象
     */
    public static void print(int index, Object object) {
        System.out.println(String.format("{%d}, %s", index, object));
    }

    public static void demoOperation() {
        print(1, 5 + 2);
        print(2, 5 - 2);
        print(3, 5 * 2);
        print(4, 5 / 2);
        print(5, 5 % 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 | 2);
        print(9, 5 ^ 2);
        print(10, 5 == 2);
        print(11, 5 != 2);
        print(12, 5.0 / 2);
        print(13, 5 / 2.0);

        int a = 11;
        double b = 2.2f;
        a += 2;
        print(14, a);
    }

    public static void demoString() {
        String str = "hello world";
        print(1, str.indexOf('x'));
        print(2, str.charAt(1));
        print(3, str.codePointAt(1));
        print(4, str.compareToIgnoreCase("HELLO worlD"));
        print(5, str.compareTo("hello uorld"));
        print(6, str.compareTo("hello xorld"));
        print(7, str.contains("hello"));
        print(8, str.concat("!!!"));
        print(9, str.toUpperCase());
        print(10, str.endsWith("world"));
        print(11, str.startsWith("hello"));
        print(12, str.replace('o', 'e'));
        print(13, str.replaceAll("o|l", "a"));
        print(14, str.replaceAll("hello", "hi"));
        print(15, str + str);

        StringBuilder sb = new StringBuilder();
        sb.append("x ");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        print(16, sb.toString());
    }

    private static void demoMapTable() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 4; ++i) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + "|" + entry.getValue());
        }

        print(3, map.values());
        print(4, map.keySet());
        print(5, map.get("3"));
        print(6, map.containsKey("A"));
        map.replace("3", "27");
        print(7, map.get("3"));
    }

    private static void demoList() {
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0; i < 4; ++i) {
            strList.add(String.valueOf(i * i));
        }
        print(1, strList);

        List<String> strListB = new ArrayList<String>();
        for (int i = 0; i < 4; ++i) {
            strList.add(String.valueOf(i));
        }

        strList.addAll(strListB);
        print(2, strList);
        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1));
        print(4, strList);

        print(5, strList.get(1));

        Collections.reverse(strList);
        print(6, strList);

        Collections.sort(strList);
        print(7, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8, strList);

        for (String obj : strList) {
            print(9, obj);
        }
        for (int i = 0; i < strList.size(); ++i) {
            print(10, strList.get(i));
        }

        int[] array = new int[]{1, 2, 3, 4, 5};
        print(11, array[1]);
    }

    private static void demoControlFlow() {
        int a = 4;
        int target = a == 2 ? 1 : 3;
        print(1, target);
        if (a == 2) {
            target = 1;
        } else if (a == 3) {
            target = 3;
        } else {
            target = 4;
        }
        print(2, target);

        String grade = "B";
        switch (grade) {
            case "A":
                print(3, ">80");
                break;
            case "B":
                print(4, "60-80");
                break;
            case "C":
                print(5, "<60");
                break;
            default:
                print(6, "为止");
                break;
        }

        for (int i = 0; i < 4; ++i) {
            if (i == 0) {
                continue;
            }
            print(7, i);
            if (i == 2) {
                break;
            }
        }
        int score = 60;
        while (score < 100) {
            print(8, score);
            score += 20;
        }
    }
}
