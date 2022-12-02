# swich case문을 다형성을 이용해서 리팩토링 해보기

> switch case 문은 기본적으로 짧게 만드는 것이 어렵다. switch 문은 기본적으로 N가지의 일을 처리하기 때문이다. 각 switch문을 저차원 클래스에 숨기고, 다형성(polymorphism)을
> 이용하자.
> 각 switch 문을 추상 팩토리(abstract factory)에 숨기고, 팩토리는 switch문을 사용해서 적절한 파생 클래스와 인스턴스를 생성한다. 이후 다형성으로 실제 파생 클래스의 함수가 실행된다.
>
> [클린 코드 - 함수 파트 내용 중 발췌](https://github.com/cyw320712/clean-code-java/blob/master/src/3.%20function.md#Switch)

## 개선 방법

> 음, 디자인 패턴에서 추상 팩토리를 의미하는 것인지, 아니면 단순히 abstract 로 선언된 팩토리를 의미하는지 모르겠다. 내 생각에는 후자의 경우가 적절해 보인다
>
> [예전에 정리한 추상 팩토리 vs 팩토리 메서드](https://github.com/le2sky/design-patterns/issues/4)

- switch 문을 추상 팩토리에 숨겨 놓는다.

- 팩토리는 switch 문을 사용해 적절한 Employee 파생 클래스의 인스턴스를 생성한다.

- calculatePay, isPayday, deliverPay 등과 같은 함수는 다형성으로 인해 실제 파생 클래스의 함수가 실행된다.

## P.S

단편적인 예제 코드를 직접 상상해서 부풀려 작성했기 때문에, 애매한 부분이 있다. 이 부분은 감안해야할 것 같다.
일단, switch case를 다형성을 사용해서 리팩토링하는 것에 초점을 뒀다.
