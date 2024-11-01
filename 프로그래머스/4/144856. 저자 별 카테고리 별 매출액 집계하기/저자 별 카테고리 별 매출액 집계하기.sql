SELECT b.author_id, a.author_name, b.category, sum(b.price * bs.sales)
FROM book b inner join book_sales bs on b.book_id = bs.book_id
inner join author a on b.author_id = a.author_id
WHERE date_format(bs.SALES_DATE,"%y%m") = "2201"
group by 1,3
order by 1,3 desc