-- 코드를 입력하세요
SELECT year(os.sales_date), month(os.sales_date), ui.gender, count(distinct ui.user_id)
FROM user_info ui inner join online_sale os on ui.user_id = os.user_id
where ui.gender is not null
group by 1, 2,3