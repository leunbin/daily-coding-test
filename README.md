# Daily Coding Test

Java 백엔드 코딩 테스트 대비를 위한 매일 2문제 학습 기록입니다.

## 학습 규칙

- 매일 2문제를 시도합니다.
- 최소 성공 기준은 **1문제 풀이 및 커밋**입니다.
- 코드를 작성하기 전에 접근법과 시간·공간 복잡도를 먼저 정리합니다.
- 30분 이상 막히면 힌트를 확인하되, 정답을 본 문제도 직접 다시 구현합니다.
- 주제는 아래 순서로 순환합니다.

```text
BFS/DFS → 백트래킹 → 힙 → 그리디 → 이진 탐색 → DP
```

## 디렉터리 구조

```text
solutions/
└── YYYY-MM-DD/
    ├── problem1/
    │   ├── README.md
    │   └── Main.java
    └── problem2/
        ├── README.md
        └── Main.java
```

## 문제 풀이 순서

1. 문제와 제약 조건을 읽습니다.
2. `README.md`에 접근법과 복잡도를 먼저 작성합니다.
3. `Main.java`로 풀이합니다.
4. 예제와 경계값을 확인합니다.
5. 틀린 이유와 다음에 기억할 점을 기록합니다.
6. 커밋합니다.

## 커밋 메시지 예시

```text
solve: 2026-10-28 BFS shortest path
review: 2026-10-28 heap implementation pitfalls
```

## 자동 검사

`solutions` 아래의 모든 Java 파일은 push 및 pull request 시 GitHub Actions에서 Java 21로 컴파일됩니다.
