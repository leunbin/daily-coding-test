# 문제 제목
정렬 - 배치 작업 실행 순서

## 문제 이해
작업 id, 우선순위, 실행 시간
1. 우선순위 우선
2. 우선순위 같으면 실행 시간 짧은 거 먼저
3. 우선순위, 실행 시간 동일하면 id 작은거 먼저

## 접근법

n : 작업 갯수
queue: 작업 순서 큐

job {id, pri, time}

Collections.sort(queue, (a,b) -> 
    if(a.pri == b.pri && a.time == b.time)
        return a.id - b.id
    if(a.pri == b.pri)
        return a.time - b.time
    return a.pri - b.pri
)

for(i: 0 ~ n)
    sout(queue.pop(id))

## 복잡도

- 시간 복잡도: O(N log N)
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
