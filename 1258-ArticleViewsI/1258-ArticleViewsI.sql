-- Last updated: 4/3/2026, 9:39:23 PM
# Write your MySQL query statement below
SELECT author_id AS id FROM Views
WHERE author_id = viewer_id
GROUP BY author_id
ORDER BY author_id ASC;