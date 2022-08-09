# movieReviewDemo
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
