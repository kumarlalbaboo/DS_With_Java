package Interview.Practice.Collection;

import java.util.ArrayList;

public class CustomArrayListBehaveSet extends ArrayList {

    public boolean add(Object element){
        if(this.contains(element)){
            return true;
        } else {
            return super.add(element);
        }
    }

    public static void main(String[] args) {
        CustomArrayListBehaveSet set = new CustomArrayListBehaveSet();
        set.add(10);
        set.add(20);
        System.out.println(set);
        set.add(10);
        set.add(30);
        System.out.println(set);

    }

}
