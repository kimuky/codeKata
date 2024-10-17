-- 코드를 입력하세요
SELECT user_id, product_id
FROM online_sale
group by 1,2
having count(1) >= 2
order by 1, 2 desc