package Practice.Inheritances.Class;
class Book{
    String title;
    String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    Book(String title){
        this(title,"작가 미상");
    }
    Book(){
        System.out.println("생성자 호출!!");
    }

}
public class ClassExam2 {
    public static void main(String[] args) {
        Book b1 = new Book("멋진 신세계", "올더스 헉슬리");
        Book b2 = new Book("더 해빙");
        Book b3 = new Book();

        System.out.print(b1);
        System.out.println(b2);
    }
}
