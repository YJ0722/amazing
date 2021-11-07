# amazing
어마무시

git 명령어
-로컬-
브랜치 이동) git checkout "branch_name"
브랜치 생성 후 이동) git checkout -b "branch_name"
    -> 현재 위치한 브랜치를 로컬의 "branch_name"으로 복사하여 생성한다

리모트의 변경사항 가져오기) git pull
리모트의 변경사항 fast-foward로 가져오기) git pull --rebase origin main

--rebase를 수행하면 merge commit이 발생하지 않아서 깃 로그가 깔끔해진다

로컬의 변경사항 리모트로 업로드) git push
rebase 수행시) git push -f

깃 작업 워크플로

1. 새로운 브랜치를 생성한다
    git checkout -b new_branch

2. 작업 내용을 커밋한다

3. 매인 브랜치의 변경사항을 확인한다

    3-1. 매인 브랜치의 변경 내용이 있다면 rebase를 수행한다
        git pull --rebase origin main

    3-2. 충돌이 발생했다면 해결한 후 git rebase --continue 를 입력한다

3. 원격 브랜치에 업로드
    git push -f origin new_branch

4. main 브랜치로 이동
    git checkout main

5. merge 수행
    git merge --no-ff origin/new_branch

6. 작업이 완료된 브랜치는 삭제한다
    로컬) git branch -d new_branch
    리모트) git push origin --delete new_branch
