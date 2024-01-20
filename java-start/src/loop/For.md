### For문 구조

    for (1.초기식; 2.조건식; 4.증감식) {
        // 3.코드
    }

for문은 다음 순서대로 실행
1. 초기식이 실행, 주로 반복 횟수와 관련된 변수를 선언하고 초기화 할 때 사용, 초기식은 딱 1번 사용
2. 조건식을 검증, 참이면 코드를 실행, 거짓이면 for문을 빠져나감
3. 코드를 실행
4. 코드가 종료되면 증감식을 실행, 주로 초기식에 넣은 반복 횟수와 관련된 변수의 값을 증가할 대 사용
5. 다시 2.조건식 부터 시작 (무한 반복)

for문은 복잡해 보이지만 while문을 조금 더 편하게 다룰 수 있도록 구조화 한 것

예를 들어 1부터 5까지 출력하는 for문은 다음과 같음

    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }

1. 초기식이 실행 int i = 1
2. 조건식을 검증 i <= 10
3. 조건식이 참이면 코드를 실행 System..out.println(i);
4. 코드가 종료되면 증감식을 실행 i++
5. 다시 2.조건식을 검증(무한 반복) 이후 i <= 10 조건이 거짓이 되면 for문을 빠져나감


    for (;;) {
        //코드
    }

이렇게 하면 조건이 없기 때문에 무한 반복하는 코드가 됨

for문이 없이 while문으로 모든 반복을 다룰 수 있지만, 카운터 변수가 명확하거나, 반복 횟수가 정해진 경우에는 for문을 사용하는 것이 구조적으로 더 깔끔하고, 유지보수하기 좋다.