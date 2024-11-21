package Practice.ArrayList;
import java.util.ArrayList;

class XY{
    private int x;
    private int y;

    public XY(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return x+","+y;
    }
}
public class ArrayListOverrideExam {
    public static void main(String[] args) {

        ArrayList<XY> li=new ArrayList<XY>();
        li.add(new XY(3,2));
        li.add(new XY(4,2));
        li.add(new XY(5,2));

        li.remove(1);

        for(int i=0;i< li.size();i++){
            XY xy=li.get(i);
            System.out.println(xy);
        }

    }
}
