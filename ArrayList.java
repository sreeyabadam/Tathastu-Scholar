import java.util.ArrayList;
import java.util.ListIterator;
 
class ArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        colors.add("Green");
 
        ListIterator<String> listIterator
            = colors.listIterator();
        System.out.println("List Before remove() :- "+ colors);
        for (String it : colors) {
            listIterator.next();
            if (it == "Blue")
                break;
        }
        listIterator.remove();
        System.out.println("List After remove():- "+ colors);
    }
}
