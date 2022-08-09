# movieReviewDemo

![image](https://user-images.githubusercontent.com/36991763/183589118-2b8001ff-cdf9-4ef9-9d19-22def69a585d.png)


# 요구사항 분석
- 사용자는 영화에 대한 리뷰 페이지를 한 페이지당 10개 씩 볼 수 있다.
- 사용자는 영화 리뷰 데이터를 볼 수 있다.
- 사용자는 영화 리뷰 페이지에 저장 된 이미지를 볼 수 있다.
- 사용자는 영화 리뷰 페이지에 저장 된 리뷰들을 볼 수 있다.
- 사용자는 해당 영화에 대한 리뷰 갯수, 평균 평점, 등록 날짜를 볼 수 있다.
- 사용자는 특정 영화에 대해 리뷰를 남길 수 있고 수정, 삭제할 수 있다.
- 사용자는 자신이 원하는 영화를 등록할 수 있다. 영화에 대한 사진 또한 등록할 수 있다.
- 사용자는 썸네일을 클릭했을 때 원본 크기의 이미지를 볼 수 있다.

# API 규격서
- Movie

|URL|METHOD|파라미터|설명|
|---|------|------|-----|
|/movie/register|GET||영화 등록 페이지 연결|
|/movie/register|POST|MovieDTO|영화 정보 등록 및 list 페이지 리다이렉트|
|/movie/list|GET|pageRequestDTO|페이지 별 영화 정보 페이지 출력|
|/movie/read|GET|mno(영화 번호)|영화 번호에 맞는 영화 조회 페이지 출력|
|/movie/modify|GET|mno(영화 번호)|영화 번호에 맞는 영화 수정 페이지 출력|

- Review

|URL|METHOD|파라미터|설명|
|---|------|------|-----|
|/reviews/{mno}/all|GET|mno|해당 영화에 할당 된 모든 리뷰를 가져옴|
|/reviews/{mno}|POST|movieReviewDTO|해당 영화에 새로운 리뷰 작성|
|/reviews/{mno}/{reviewnum}|PUT|reviewnum, ReviewDTO|기존에 작성 된 리뷰 수정|
|/reviews/{mno}/{reviewnum}|DELETE|reviewnum|기존에 작성 된 리뷰 삭제|
- Upload

|URL|METHOD|파라미터|설명|
|---|------|------|-----|
|/uploadAjax|POST|uploadFiles|영화 정보 등록 중 등록 한 이미지들 저장|
|/display|GET|fileName, size|파일 이름에 할당 된 이미지 출력|
|/removeFile|POST|fileName|파일 이름에 할당 된 이미지 삭제|

# 기술 스택
- Java
  - Spring Boot
    - JPA
    - Thymeleaf
- DB
  - MariaDB
- View
  - Javascript
    - Ajax
    - Jquery

# 엔티티 관계도
![image](https://user-images.githubusercontent.com/36991763/183589563-cafb6d70-1501-4de7-9986-3d205a12f321.png)  
- member, review : 일대다 관계
- movie, review : 일대다 관계
- movie, movie_image : 일대다 관계

# Git flow model
![image](https://user-images.githubusercontent.com/36991763/183589776-5c289af6-1f45-495c-b881-3b4379d5775c.png)
- master : 최종 릴리즈 버전
- dev : 개발기 테스트
- feature : 기능 추가 브랜치

# 구현 기능
## 1. 메인화면
![image](https://user-images.githubusercontent.com/36991763/183590048-b0a041ce-a7df-4096-843a-634dfcf42411.png)  
- 한 페이지 당 최대 10개의 영화 정보를 확인 할 수 있다. 

## 2. 영화 등록 기능
![image](https://user-images.githubusercontent.com/36991763/183590124-82a5d8e6-2e33-417b-8e4d-33a07b3a437c.png)  
- 영화에 대한 이미지를 여러 장 등록 할 수 있다.

## 3. 영화 조회 기능
![image](https://user-images.githubusercontent.com/36991763/183590284-0b9b001f-7d46-4c67-b420-87886a737772.png)  
- 영화에 대한 정보(리뷰 갯수, 평점, 썸네일 사진) 조회 및 썸네일 원본 조회가 가능하다.

## 4. 영화 리뷰 조회 기능
![image](https://user-images.githubusercontent.com/36991763/183590374-019b434a-9979-4200-a6b2-2158613e21a3.png)  
- 리뷰 등록자, 등록 날짜, 내용, 점수 등을 확인 할 수 있다.

## 5. 영화 리뷰 등록 기능
![image](https://user-images.githubusercontent.com/36991763/183590482-d4c26f02-870f-42f0-a9f7-cbb76a70cb9b.png)
- 특정 영화에 대한 새로운 리뷰를 등록 할 수 있다.

## 6. 영화 리뷰 수정 및 삭제 기능
![image](https://user-images.githubusercontent.com/36991763/183590522-e835c40b-5745-4149-a58d-748f6194679f.png)
- 특정 영화에 등록 된 리뷰를 수정 및 삭제 할 수 있다.
