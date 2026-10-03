# Write your MySQL query statement below
SELECT v.customer_id,count(customer_id) as count_no_trans
FROM Visits v
LEFT JOIN Transactions t
using (visit_id)
where t.transaction_id IS NULL
GROUP BY v.customer_id
;