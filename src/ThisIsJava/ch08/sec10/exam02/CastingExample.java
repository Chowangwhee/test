package ThisIsJava.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle=new Bus();

        //인터페이스를 통해서 호출
        vehicle.run();
        //vehicle.checkFare();  (x)

        Bus bus=(Bus) vehicle;
        bus.run();
        bus.checkFare();

        //실행 결과
        //버스가 달립니다.
        //버스가 답립니다.
        //승차요금을 체크합니다.
    }
}
