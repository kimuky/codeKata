-- 코드를 입력하세요

SELECT fh.flavor flavor
FROM first_half fh join (select flavor, sum(total_order) july_sum from july group by 1) j 
on fh.flavor = j.flavor
order by j.july_sum + fh.total_order desc limit 3
