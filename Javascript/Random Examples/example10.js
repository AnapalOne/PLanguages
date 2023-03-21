a = 2;
b = 3;
x = 3;
y = 5;

getDistance(a, b, x, y);

function getDistance(x1, x2, y1, y2) {
	dist = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
	console.log(dist);
}

console.log("---------------------------");

var fun = "I had FUN";

for (var i = 6; i < fun.length; i++) {
	console.log(fun[i]);
}

console.log("---------------------------");

var funny = "Named.";

function solveProblem (varib) {
	name = varib.toUpperCase();

	for (var i = 0; i < name.length; i++) {
		if (name[i] == 'A' || name[i] == 'E' || name[i] == 'I' || name[i] == 'O' || name[i] == 'U') {
			name = name.replace(name[i], "_");
		}
	}

	console.log(name);
}

solveProblem(funny);
