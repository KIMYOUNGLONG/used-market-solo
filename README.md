# 🛒 Used Market Solo - 중고거래 플랫폼 (Spring Boot + PostgreSQL)

> Spring Boot 기반으로 개발된 **개인 중고거래 웹 애플리케이션**입니다.  
> 로그인, 상품 등록/수정/삭제, 댓글, 좋아요, 관리자 기능, OAuth2 로그인 등을 포함하며,  
> 수업에서 배운 기술을 바탕으로 하나하나 직접 구현해낸 **실전형 프로젝트**입니다.

---

## ✅ 주요 기능

- 회원가입 / 로그인 (세션 기반)
- 상품 등록 / 목록 / 상세 / 수정 / 삭제
- 댓글 작성 / 삭제
- 좋아요 기능 (토글 방식)
- 관리자 기능 (상품/댓글 관리)
- 검색 기능 (제목 기준)
- 카테고리 필터링
- OAuth2 로그인 (Google)

---

## 🧱 기술 스택

- **Language**: Java 17  
- **Framework**: Spring Boot, Spring MVC, Spring Data JPA  
- **Database**: PostgreSQL (개발 중에는 H2 사용 가능)  
- **Template/View**: JSP + JSTL  
- **Build Tool**: Gradle  
- **협업 도구**: GitHub, Notion, Figma  

---

## 📂 프로젝트 구조

```
used-market-solo/
├── controller/       # 웹 요청 처리
├── service/          # 비즈니스 로직
├── repository/       # JPA 기반 DB 처리
├── entity/           # DB 테이블 매핑 클래스
├── config/           # 시큐리티 및 앱 설정
├── resources/
│   ├── static/       # CSS, JS 등 정적 파일
│   ├── templates/    # JSP 파일 위치
│   └── application.properties
└── build.gradle
```

---

## 🏃 실행 방법

```bash
git clone https://github.com/KIMYOUNGLONG/used-market-solo
cd used-market-solo
./gradlew bootRun
```

> PostgreSQL 설정은 `application.properties`에서 환경에 맞게 수정해 주세요.

---

## 📘 프로젝트 문서

- 🎨 [Figma 디자인 보기](https://www.figma.com/design/kSMua8TOVGIIPbNH1jie1Q/...)
- 🧱 [ERD 설계](https://www.erdcloud.com/...)  
- 📘 [Notion 작업 보드](https://near-castanet-08c.notion.site/...)

---

## 👨‍💻 개발자 정보

| 이름 | GitHub | 역할 |
|------|--------|------|
| 김영롱 | [@KIMYOUNGLONG](https://github.com/KIMYOUNGLONG) | 백엔드 개발 / 프로젝트 설계 및 구현 |

---

## 📌 프로젝트 목표

- 실제로 작동 가능한 웹 애플리케이션을 완성해보는 것
- 배운 기술을 직접 적용하여 문제를 해결하며 성장하는 것
- 기본기에 충실한 구조와 흐름을 바탕으로, 필요한 기능을 모두 담아내는 것

---

## ✨ 향후 개발 계획

- 이미지 업로드 기능 추가 (상품 사진 등록)
- 마이페이지: 내가 등록한 상품 / 내가 찜한 상품 목록
- 관리자 페이지 기능 세분화
- 게시글 신고 / 숨기기 기능 추가
- Docker 환경 구성 및 배포 자동화

---

> ✅ 이 프로젝트는 직접 구현을 통해 성장하기 위한 목적에서 시작되었으며,  
> 지금도 계속 발전 중입니다. 완성도와 실용성을 함께 고려하여 설계하였습니다.
