// pdf 14 - 16 ARRAYS

/*Q1 - Q6: Declaring different types of arrays
const studentNames = {};
const stdNames = [];
const stringArray = ['Jake', 'Ali', 'talha'];
const numbersArray = [0, 2, 4, 6, 8];
const booleanArray = [true, false, true];
const mixedArray = ['jake', 'mash', 'Jam', 20, 26, 23];*/

/* Q8: Display student scores and percentages
function displayStudentScores(names, obtainedMarks, totalMarks = 500) {
    names.forEach((name, index) => {
        const percentage = (obtainedMarks[index] / totalMarks) * 100;
        document.write(<br>Score of ${name} is ${obtainedMarks[index]}. Percentage: ${percentage.toFixed(2)}%);
    });
}
displayStudentScores(['Jhon', 'Dao', 'Jam'], [400, 350, 150]);
document.write('<br><br>');*/

/* Q9: Color manipulations
let colors = ['Red', 'Green', 'Blue'];

function displayColors(colorArray) {
    document.write(colorArray.join('<br>') + '<br><br>');
}

function modifyColors() {
    displayColors(colors);
    colors.unshift(prompt('Enter the color to add in the beginning'));
    displayColors(colors);
    colors.push(prompt("Enter color to add at the end"));
    displayColors(colors);
    colors.unshift(prompt("Enter first color"), prompt("Enter second color"));
    displayColors(colors);
    colors.shift();
    displayColors(colors);
    colors.pop();
    displayColors(colors);
    colors.splice(+prompt("Enter index to add color"), 0, prompt("Enter color"));
    displayColors(colors);
    colors.splice(+prompt("Enter index to delete color"), prompt("Enter number of colors to delete"));
    displayColors(colors);
}
modifyColors();*/

/* Q10: Display student scores before and after sorting
function displayScores(scores) {
    document.write(<h3>Scores of students: ${scores.join(', ')}</h3>);
    document.write(<h3>Ordered scores of students: ${scores.sort((a, b) => a - b).join(', ')}</h3><br><br>);
}
displayScores([320, 230, 480, 120]);

// Q11: Cities and selected cities display
function displayCities() {
    const cities = ['Karachi', 'Lahore', 'Quetta', 'Islamabad', 'Peshawar'];
    const selectedCities = cities.slice(0, 3);
    document.write(<h3>Cities list:<br>${cities.join(', ')}</h3>);
    document.write(<h3>Selected cities list:<br>${selectedCities.join(', ')}</h3><br><br>);
}
displayCities();*/

/* Q12: Array to String conversion
function arrayToString(array) {
    document.write(<h3>Array:<br>${array.join(', ')}</h3>);
    document.write(<h3>String:<br>${array.join(' ')}</h3><br><br>);
}
arrayToString(['This', 'is', 'my', 'cat']);*/

/* Q13 & Q14: Display devices in FIFO and LIFO order
const peripherals = ['Keyboard', 'Mouse', 'Printer', 'Monitor'];

function displayDevicesFIFO(devices) {
    document.write("<h3>Devices:<br>" + devices.join(", ") + "</h3>");
    devices.forEach(device => document.write("<h3>OUT:<br>" + device + "</h3>"));
    document.write("<br><br>");
}

function displayDevicesLIFO(devices) {
    document.write("<h3>Devices in reverse order:<br>" + devices.reverse().join(", ") + "</h3>");
    devices.forEach(device => document.write("<h3>OUT:<br>" + device + "</h3>"));
    document.write("<br><br>");
}

displayDevicesFIFO(peripherals);
displayDevicesLIFO([...peripherals]);

// CHAPTER 17 - 20 Array and loop

/* Q1 - Q2: Declaring multidimensional arrays
const multidimension = [[], [], []];
const multidimension2 = [
    [0, 1, 2, 3],
    [1, 0, 1, 2],
    [2, 1, 0, 1],
];*/

/* Q3: Display numbers from 1 to 10
function displayCounting(limit) {
    document.write(Array.from({ length: limit }, (_, i) => i + 1).join('<br>') + '<br><br>');
}
displayCounting(10);*/

/* Q4: Multiplication table display
function multiplicationTable(num, length) {
    document.write(Multiplication table of: ${num}<br>Length: ${length}<br>);
    for (let i = 1; i <= length; i++) {
        document.write(${num} X ${i} = ${num * i}<br>);
    }
    document.write('<br><br>');
}
multiplicationTable(+prompt("Enter number for multiplication table"), +prompt("Enter length of multiplication table"));*/

/*Q5: Display fruits with indexes
function displayFruitsWithIndexes(fruits) {
    fruits.forEach((fruit, index) => {
        document.write(${fruit}<br>);
        document.write(Element at index ${index} is ${fruit}<br>);
    });
}
displayFruitsWithIndexes(["apple", "banana", "mango", "orange", "strawberry"]);*/

/* Q6: Display counting types
function displayCountingTypes() {
    document.write(<h3>Counting:<br>${Array.from({ length: 10 }, (_, i) => i + 1).join(', ')}</h3>);
    document.write(<h3>Reverse:<br>${Array.from({ length: 10 }, (_, i) => 10 - i).join(', ')}</h3>);
    document.write(<h3>Even:<br>${Array.from({ length: 10 }, (_, i) => 2 * (i + 1)).join(', ')}</h3>);
    document.write(<h3>Odd:<br>${Array.from({ length: 10 }, (_, i) => 2 * i + 1).join(', ')}</h3>);
    document.write(`<h3>Series:<br>${Array.from({ length: 10 }, (_, i) => ${2 * (i + 1)}K).join(', ')}</h3><br><br>`);
}
displayCountingTypes();*/

/* Q7: Bakery item search
function bakerySearch() {
    const bakeryItems = ["cake", "apple pie", "cookie", "chips", "patties"];
    const order = prompt("Welcome to ABC bakery. What do you want to order sir/ma'am?");
    const foundItem = bakeryItems.find(item => item.toLowerCase() === order.toLowerCase());
    document.write(foundItem ? ${foundItem} is available in our bakery. : "We are sorry. The item is not available in our bakery.");
}
bakerySearch();*/

/* Q8: Find the largest value in an array
function displayLargestValue(array) {
    document.write("Largest value is: " + Math.max(...array) + "<br><br>");
}
displayLargestValue([24, 53, 78, 91, 12]);
*/
/* Q9
const A = [24, 53, 78, 91, 12];

function findSmallestNumber(arr) {
    let smallest = arr[0]; // Start with the first element

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i]; // Update smallest if a smaller number is found
        }
    }

    return smallest;
}

const smallestNumber = findSmallestNumber(A);
console.log(`The smallest number in the array is: ${smallestNumber}`);*/
/* q1010. 
for (let i = 1; i <= 100; i++) {
    if (i % 5 === 0) {
        console.log(i);
    }
}
*/

