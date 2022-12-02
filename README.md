# swich case문을 다형성을 이용해서 리팩토링 해보기

> switch case 문은 기본적으로 짧게 만드는 것이 어렵다. switch 문은 기본적으로 N가지의 일을 처리하기 때문이다. 각 switch문을 저차원 클래스에 숨기고, 다형성(polymorphism)을
> 이용하자.
> 각 switch 문을 추상 팩토리(abstract factory)에 숨기고, 팩토리는 switch문을 사용해서 적절한 파생 클래스와 인스턴스를 생성한다. 이후 다형성으로 실제 파생 클래스의 함수가 실행된다.
> 
> [클린 코드 - 함수 파트 내용 중 발췌](https://github.com/cyw320712/clean-code-java/blob/master/src/3.%20function.md#Switch)



