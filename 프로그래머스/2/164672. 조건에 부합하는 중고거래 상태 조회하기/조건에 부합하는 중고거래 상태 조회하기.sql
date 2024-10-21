SELECT board_id, writer_id, title, price, 
case when status = 'done' then '거래완료'
when status = 'reserved' then '예약중'
else '판매중' end 'status'
FROM used_goods_board WHERE date_format(created_date, '%y%m%d') = '221005'
order by board_id desc