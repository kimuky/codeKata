-- 코드를 입력하세요
SELECT gu.user_id,gu.nickname, concat(gu.city, " ", gu.street_address1, " ", gu.street_address2),
concat(left(gu.tlno, 3),'-',substring(tlno,4,4),'-',substring(tlno, 8, 4))
FROM used_goods_board gb INNER JOIN used_goods_user gu on gb.writer_id = gu.user_id
GROUP BY gb.writer_id
having count(1) >= 3
ORDER BY 1 DESC