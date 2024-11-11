package Practice.For;

public class ForExam5 {
    public static void main(String[] args) {

        int z=0;

        for (int i=0;i<5;i++){
            for (int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l=3;l==z;l--){
            for (int m=1;m<5;m++) {
                System.out.print(m);
            }
            for (int n=0;n<l+1;n++) {
                System.out.print(n);
            }
            System.out.println();
        }

    }
}