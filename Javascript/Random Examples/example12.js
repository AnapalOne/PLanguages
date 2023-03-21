function getSum (a) {
	sum = 0;

	for (var i = 0; i <= a; i++) {
		sum += i;
	}
	return sum;
}

x = getSum(4);
console.log(x)