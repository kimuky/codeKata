SELECT date_format(START_DATE, "%c") MONTH, car_id CAR_ID, count(1) RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE date_format(START_DATE, "%y%m") >= "2208" and date_format(START_DATE, "%y%m") <= "2210" and 
car_id in
(
SELECT car_id
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE date_format(START_DATE, "%y%m") >= "2208" and date_format(START_DATE, "%y%m") <= "2210" 
group by 1
having count(1) >=5
) 

group by 1,2
order by date_format(START_DATE, "%y%m") asc, 2 desc

#  2= 5, 1, 1
# SELECT car_id, date_format(START_DATE, "%y%m"), count(1) c
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
# where date_format(START_DATE, "%y%m") >= "2208" and date_format(START_DATE, "%y%m") <= "2210"
# group by 1,2
# having c >=5

# select * from CAR_RENTAL_COMPANY_RENTAL_HISTORY where car_id = 15