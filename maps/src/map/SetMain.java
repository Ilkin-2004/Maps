package map;

import java.util.HashSet;

public class SetMain {
    public static void main(String[] args) {
        HashSet<String > set=new HashSet<>();// set ailwsi unique-di eyni m'lumatlar silinir
        for (int i=0;i<3;i++){
            set.add("ilkin");
        }
        System.out.println(set);
    }

}
