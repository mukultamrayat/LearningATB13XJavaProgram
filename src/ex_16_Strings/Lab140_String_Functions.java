package ex_16_Strings;

public class Lab140_String_Functions {
    public static void main(String[] args) {
        String str1 = "Mukul";
        System.out.println(str1.length()); // 12345 = 5
        System.out.println(str1.charAt(2)); // Start with 0 so 0 - M , 1-U , 2-K
        System.out.println(str1.concat("Tamrayat")); // MukulTamrayat
        System.out.println(str1.contains("uk")); // True
        System.out.println(str1.contains("Ra")); // False
        String str2 = "Mukul";
        System.out.println(str1.equals(str2)); // True
        String str3 = new String("mukul");
        System.out.println(str1.equalsIgnoreCase(str3)); // True
        System.out.println(str1.indexOf("u")); // 1
        System.out.println(str1.lastIndexOf("l")); // 4
        System.out.println(str1.replace("u", "T")); // MTKUL
        System.out.println(str1.toLowerCase()); // mukul
        System.out.println(str1.toUpperCase()); // MUKUL
        System.out.println(str1.startsWith("M")); // true
        System.out.println(str1.endsWith("l")); // true
        System.out.println(str1.endsWith("R")); // false
        String str4 = " Hello";
        System.out.println(str4.trim());
        System.out.println(str4.substring(2)); //ello
        System.out.println(str4.substring(3,5)); //ll
        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);





    }
}