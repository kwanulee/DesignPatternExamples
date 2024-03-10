package adapter.ClassAdapterExample

class MyApp // vender 멤버변수 초기화
    (// Vender 객체 인스턴스
    var vender: Vender
) {
    fun run() {
        vender.request() // vender의 request() 호출
    }
}
