package opgave2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DictionaryApp {
    public static void main(String[] args) {
        UrbanDictionary ud = new UrbanDictionary();
        ud.put("Made", "Awesome");
        ud.put("Steffen", "Soed");
        ud.put("Patrick", "prutter");
        ud.put("Douglas", "grumps");
        System.out.println(ud.size());

        System.out.println(ud.toString());

        System.out.println( ud.remove("Made"));
        System.out.println(ud.toString());
        System.out.println(ud.size());
    }
}
