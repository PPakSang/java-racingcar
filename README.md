# 자동차 경주 게임

## 기능 목록
- 자동차
  1. 자동차 이름, 위치 정보를 가짐
  2. 자동차 이름 부여
  3. 입력 받은 값에 따라 위치 증가
  4. 정렬 기준 정의

- 자동차들
  1. 자동차 목록을 가짐
  2. 입력된 리스트 사이즈만큼 생성
  3. 리스트의 이름으로 자동차 생성
  4. 자동차들 위치 증가

- 이동
  1. 0~9 랜덤값 발생
  2. 4미만인 경우 0 리턴
  3. 4이상인 경우 1 리턴

- 결과 출력
  1. 자동차 위치 표현은 '-'로 표시
  2. 자동차들의 이름과 위치 출력

- 레이싱
  1. 시도 횟수만큼 자동차들 이동
  2. 횟수마다 모든 자동차 이동 및 상태 출력
  3. 우승자 반환

- 우승자
  1. 우승자 목록을 가짐
  2. 제일 많이 이동한 자동차 탐색
  3. 우승자들 반환

- 시스템 멘션
  1. 안내 메시지 정리
  2. 메시지 출력
  3. 문자 받아서 합친 후 출력

- 레이싱 게임
  1. 사용자 입력 받음
  2. 레이싱 진행 및 출력
  3. 우승자 출력

- 유틸
  1. 널 체크
  2. 숫자가 아닐 시 체크
  3. 양수가 아닐 시 체크
  4. 허용하지 않는 입력값일 시 알림

- Split 유틸
  1. list 받아서 문자로 반환
  2. 문자 받아서 list 로 반환
  3. 널 체킹

- 사용자 입력
  - 자동차 개수, 시도 횟수
    1. 양수가 입력될 때까지 반복
    2. 자동차 개수, 시도 횟수 입력 받음
    3. 양수 반환
  - 자동차 이름
    1. 5자 초과 불가
    2. 자동차 이름 쉼표(,) 기준 구분
    3. 중복불가
    4. 리스트 반환


## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)