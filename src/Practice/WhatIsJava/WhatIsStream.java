package Practice.WhatIsJava;

public class WhatIsStream {
    public static void main(String[] args) {

        //바이트 스트림
        //1) 입력 스트림 --> ~~InputStream
        //2) 출력 스트림 --> ~~OutputStream

        //문자 스트림
        //1) 입력 스트림 --> ~~Reader
        //2) 출력 스트림 --> ~~Writer

        //-----------------------------------

        //1. 파일 생성(출력)
        //OutputStream(바이트단위 파일 생성)
        //Writer(문자단위 파일 생성)

        //주인공(혼자서 파일 생성 가능)
        //장식(혼자서 파일 생성 불가능)
        //->Constructor 의 매개변수를 보고
        // 매개 변수 안에 InputStream, OutputStream, Reader, Writer가 보이면 장식
        // 없으면 주인공

        //2. 파일에 값 저장
        //write 메소드는 매개값 int(4byte)에서 끝 1byte 만 출력한다.

        //3. 파일 읽어들임(입력)
        //InputStream(바이트단위로 읽어들임)
        //Reader(문자단위로 읽어들임)

        //4. 스트림 닫기(close)

        //바이트 스트림에서 입출력할 데이터가 문자라면 문자 스트림으로 변환해서 사용하는 것이 좋다.
        //Buffered~(~InputStream) : 메모리 버퍼를 제공하여 프로그램의 실행 성능을 향상시키는 보조 스트림
        //문자 입력 스트림(Reader)에 성능 향상 보조 스트림(Buffered~~)을 연결하면
        // 행 단위로 문자를 읽는 매우 편리한 readline()메소드를 사용 가능하다.

    }
}
