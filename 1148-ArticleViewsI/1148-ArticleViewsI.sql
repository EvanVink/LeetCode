-- Last updated: 9/23/2026, 9:24:25 AM
# Write your MySQL query statement below
SELECT author_id AS id FROM Views
WHERE author_id = viewer_id
GROUP BY author_id
ORDER BY author_id ASC;