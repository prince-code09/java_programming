// map ek aisa datastructure h jisme hm value ko key-pairs me store krte h
//  key unique hi ho skta h and values ek key ki kai ho skti hai & agr key ko same dubara likhenge toh overwrite kr dega
// {doubt -not imp now } Treemap is based on RBT--red black tree & rbt ek self balancing binary search hai
// HashMAp me order nhi maintain hota & LinkedHashMap me insertion order maintain rehta hai & TreeMap me sorted order hota hai
// Hashmap & linkedHashmap sirf ek null key allow krte h baki ek bhi ni
// hashtable--not imp--legacy class h ye (purane versions se)---null kch bhi allow ni & order not maintain & it is synchronized

// sbhi methods baki clas me bhi work krenge --same & mostlt HAshMap use hota hai

package dsa;
import java.util.*;
public class map1 {
    static void main(String[] args) {
        Map<String,String> mapping =new HashMap<>();
        mapping.put("in", "India");
      //  mapping.put(" in1", "India");
        mapping.put("g", "game");
        mapping.put("h", "highway");
        System.out.println(mapping);



        Map<String,String> table =new HashMap<>();
        table.put("br","brown");
        System.out.println("before putAll"+ table);
        table.putAll(mapping);                   // mapping ka saara data table me aa jayega
        System.out.println("after putAll : "+table);
        table.remove("h");    // ek aor remove hota h jisme key ke sath value hogi tbhi remove krega
        System.out.println(table);        System.out.println(table.size());
    //    table.clear();                 System.out.println(table.size());

        table.putIfAbsent("is", "India");   // agr (key) nhi h toh diya gaya data andar dalo
        System.out.println(table);

        System.out.println(table.get("in"));   // value h toh print kr dega otherwise null dega
        System.out.println(table.getOrDefault("ina","not found"));
        System.out.println(table.containsKey("in"));
        System.out.println(table.containsValue("India"));

        System.out.println(table);
        table.replace("in","indonesia");   // replace ka ek aor mwthod h old value bhi dalke...
        System.out.println(table);

        Set<String> keyset1=table.keySet();   // sbhi keys ko dikhayega
        System.out.println(keyset1);

       Collection<String>value1=table.values();  // sbhi values dega ye
        System.out.println(value1);

       Set<Map.Entry<String, String>> sbhi= table.entrySet();   // sbhi entries deta h ye
        System.out.println(sbhi);

        System.out.println("ITERATOR-------------------------------");
    for (Map.Entry<String,String> en: table.entrySet()){
        System.out.println("key : "+ en.getKey()+" \nvalue : "+en.getValue());}




    }}

