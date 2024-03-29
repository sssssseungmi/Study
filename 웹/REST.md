## REST API

##### REST란

-  Representational State Transfer
-  분산 네트워크 프로그래밍 아키텍처 스타일

##### REST가 필요한 이유

- 애플리케이션 분리 및 통합
- 다양한 클라이언트의 등장

##### REST의 구성

- 자원(Resource) - URI
- 행위(Verb) - HTTP METHOD
- 표현(Representations)

##### REST의 특성

- 유니폼 인터페이스(Uniform)
  - URI로 지정한 리소스에 대한 조작 통일, 한정적인 인터페이스로 수행하는 아키텍처 스타일
- 무상태성(Stateless)
  - 상태정보를 따로 저장하거나 관리하지 않음
  - 세션정보나 쿠키정보를 별도로 저장하고 관리하지 않기 떄문에 들어오는 요청만 처리하면 됨
  - 때문에 자유도가 높아지고 불필요한 정보를 서버가 관리하지 않기 때문에 구현이 단순해짐
- 캐시 가능(Cacheable)
  - HTTP 기존 웹 표준을 그대로 사용하기 때문에 웹에서 사용하는 기존 인프라를 그대로 활용 가능
  - Last-Modified 태그나 E-Tag를 이용하면 캐싱 구현 가능
- 자체 표현 구조(Self-descriptiveness)
  - REST API 메시지만 보고도 쉽게 이해할 수 있는 자체 표현 구조
- 클라이언트와 서버가 독립적으로 구분
- 계층형 구조
  - 다중 계층으로 구성될 수 있음
  - 보안, 로드 밸런싱, 암호화 계층을 추가해 유연성을 둘 수 있음
  - PROXY, Gateway같은 네트워크 기반의 중간매체도 사용할 수 있음

##### REST API 디자인 가이드

- URI는 정보의 자원을 표현해야한다

  - URI는 정보의 자원을 표현해야한다.

    > GET /members/delete/1

    ​	잘못된 표현이다. delete같은 행위에 대한 표현이 들어가면 안됨

- 자원에 대한 행위는 HTTP Method(GET, POST, PUT, DELETE)로 표현한다.

  -  위의 잘못된 표현을 수정하면

    > DELETE /members/1

- Example

  > GET /members/show/1		(X)
  >
  > GET / members/1				  (O)

  > GET /members/insert/2 	   (X)
  >
  > POST /members/2				 (O)

- URI 설계 시 주의할 점

  - 슬래시 구분자(/)는 계층 관계를 나타내는 데 사용

    > /houses/apartments
    >
    > /animals/mammals/whales

  - URI 마지막문자로 슬래시(/)를 포함하지 않는다.

  - 하이픈(-)은 URI 가독성을 높이는데 사용할 수 있다.

  - 밑줄(_)은 URI에 사용하지 않는다.

  - URI경로에는 소문자가 적합하다.

    - 대문자는 피해야 한다. 대소문자에 따라 다른 리소스로 인식하게 되기 때문

  - 파일확장자는 URI에 포함시키지 않는다.

- 리소서 간의 관계를 표현하는 방법

  - 리소스 간에는 연관 관계가 있을 수 있다.

    > /리소스명/리소스 ID/관계가 있는 다른 리소스명
    >
    > GET : /users/{userid}/devices (일반적으로 소유 'has'의 관계를 표현할 때)

  - 관계명이 복잡하다면 서브 리소스에 명시적으로 표현,

    > ex) 사용자가 '좋아하는' 디바이스 목록
    >
    > GET : /users/{userid}/likes/devices (관계명이 애매하거나 구체적 표현이 필요할 때)

##### HTTP METHOD의 알맞은 역할

| METHOD | 역할                                                         |
| ------ | ------------------------------------------------------------ |
| POST   | POST를 통해 해당 URI에 요청하면 리소스 생성                  |
| GET    | GET을 통해 해당 리소스를 조회, 리소스를 조회하고 해당 도큐먼트에 대한 자세한 정보를 가져옴 |
| PUT    | PUT을 통해 해당 리소스를 수정                                |
| DELETE | DELETE를 통해 리소스를 삭제                                  |

##### HTTP 응답 상태 코드

| 상태코드 |                                                              |
| -------- | ------------------------------------------------------------ |
| 200      | 클라이언트의 요청을 정상적으로 수행함                        |
| 201      | 클라이언트가 어떠한 리소스 생성을 요청, 해당 리소스가 성공적으로 생성됨(POST를 통한 리소스 생성 작업 시) |

| 상태코드 |                                                              |
| -------- | ------------------------------------------------------------ |
| 400      | 클라이언트의 요청이 부적절할 경우 사용                       |
| 401      | 클라이언트가 인증되지 않은 상태에서 보호된 리소스를 요청했을 때 사용 |
|          | (로그인하지 않은 유저가 로그인 했을 때, 요청 가능한 리소스를 요청했을 때) |
| 403      | 유저 인증상태와 관계없이 응답하고싶지 않은 리소스를 클라이언트가 요청했을 때 사용 |
|          | (403보다는 400이나 404를 사용할 것을 권고, 403 자체가 리소스가 존재한다는 뜻) |
| 405      | 클라이언트가 요청한 리소스에서는 사용 불가능한 Method를 이용했을  경우 사용 |

| 상태코드 |                                                            |
| -------- | ---------------------------------------------------------- |
| 301      | 클라이언트가 요청한 리소스에 대한 URI가 변경되었을 때 사용 |
|          | (응답 시 Location header에 변경된 URI를 적어줘야 함)       |
| 500      | 서버에 문제가 있을 경우 사용하는 응답 코드                 |

