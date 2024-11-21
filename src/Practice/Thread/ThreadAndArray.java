package Practice.Thread;
class ShareForArray{
    synchronized void pr(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
class ArrayA extends Thread{
    ShareForArray s;
    String []word;
    ArrayA(ShareForArray s,String []word){
        this.s=s;
        this.word=word;
    }
    @Override
    public void run(){
        for(int i=0;i< word.length;i++){
            s.pr(word[i]);
        }
    }
}
public class ThreadAndArray {
    public static void main(String[] args) {

        ShareForArray s=new ShareForArray();
        String eng[]={"java","study","db","spring","cloud"};
        String kor[]={"자바","공부","디비","스프링","클라우드"};

        ArrayA t1=new ArrayA(s,eng);
        Thread t2=new ArrayA(s,kor);   //업캐스팅

        t1.start();
        t2.start();

    }
}
