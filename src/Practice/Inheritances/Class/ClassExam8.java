package Practice.Inheritances.Class;

class Score{
    int sum=0;
    void show(int [][]n){
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                sum+=n[1][j];
            }
        }
        System.out.println(sum/12.0);
    }
}

public class ClassExam8 {
    public static void main(String[] args) {

        int [][]grade={{90,100,80},{70,95,87},{80,90,70},{90,100,100}};

        Score s=new Score();
        s.show(grade);
    }
}