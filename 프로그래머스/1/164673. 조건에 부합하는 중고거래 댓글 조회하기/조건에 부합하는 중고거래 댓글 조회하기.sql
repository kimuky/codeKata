-- 코드를 입력하세요
SELECT gb.title, gb.board_id, gr.reply_id, gr.writer_id, gr.contents, date_format(gr.created_date,"%Y-%m-%d")
FROM used_goods_board gb inner join used_goods_reply gr on gb.board_id = gr.board_id
where date_format(gb.created_date, "%y%m") = "2210"
order by 6, 1