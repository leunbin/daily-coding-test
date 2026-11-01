# 문제 제목
스택·큐·덱 - 긴급 요청 처리 대기

## 문제 이해

NORMAL id : 대기열 맨 뒤에 추가
URGENT id: 대기열 맨 앞에 추가
PROCESS : 대기열 맨 앞 요청 처리 후 처리한 요청 ID / 비어있으면 -1

## 접근법

q : process 개수
Deque<Integer> processes

for(i: 0 ~ q)
    switch(type)
        NORMAL : processes.back(id)
        URGENT : processes.front(id)
        PROCESS : sout(processes.get)

## 복잡도

- 시간 복잡도: O(N)
- 공간 복잡도: O(N)

## 구현

`Main.java`에 풀이를 작성합니다.

## 테스트

- [ ] 예제 입력
- [ ] 최소 입력
- [ ] 최대 입력 또는 오버플로
- [ ] 중복·도달 불가 등 문제별 경계값

## 회고

- 막힌 부분:
- 틀린 이유:
- 흔한 구현 실수:
- 다시 풀 때 기억할 점:
