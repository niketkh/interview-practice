/*
	Given a “2 x n” board and tiles of size “2 x 1”, 
	count the number of ways to tile the given board using the 2 x 1 tiles. 
	A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.

	count(n)
	-> If we place first tile vertically, the problem reduces to “count(n-1)”
	-> If we place first tile horizontally, we have to place second tile also horizontally. So the problem reduces to “count(n-2)”
	
	count(n) = n for n = 1 or n = 2
	count(n) = count(n-1) + count(n-2)
*/