-- 코드를 입력하세요
SELECT ri.rest_id, ri.rest_name, ri.food_type, ri.favorites,ri.address, round(avg(rv.REVIEW_SCORE),2)
FROM rest_info ri INNER JOIN rest_review rv on ri.rest_id = rv.rest_id
where address like "서울%"
group by 1
order by 6 desc, 4 desc