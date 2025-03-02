/*Qno 1 
var n1, n2, nr = 0;
n1 = Number(prompt('Enter number 1'));
n2 = Number(prompt('Enter number 2'));
nr = n1 + n2;
document.write(`The sum is ${nr}`);*/


/* Qno 2 
var n1, n2, nr = 0;
n1 = Number(prompt('Enter number 1'));
n2 = Number(prompt('Enter number 2'));
nr = n1 - n2;
document.write(`The Substraction is ${nr}`);
*/

/*var n1, n2, nr = 0;
n1 = Number(prompt('Enter number 1'));
n2 = Number(prompt('Enter number 2'));
nr = n1 / n2;
document.write(`The Division is ${nr}`);*/

/*var n1, n2, nr = 0;
n1 = Number(prompt('Enter number 1'));
n2 = Number(prompt('Enter number 2'));
nr = n1 % n2;
document.write(`The Modulud is ${nr}`);*/

/* Qno 3 
var number;
alert("Value after varible declaration is Undefined");
number=10;
console.log(`Initial Value is ${number}`);
number++;
console.log(`Value after Increament is ${number}`);
number+7;
console.log(`value after addition is ${number}`);
number--;
console.log(`Value after Decreament is ${number}`);
number/3;
console.log(`The reminder is ${number}`);*/

/*QNo 4
var ticketcost="600";
var totaltikect=ticketcost*5;
alert(`Total cost of buy 5 ticket to a movie is ${totaltikect}PKR `)*/

/*/Qno 5
//function multiplicationTable(number, limit) {
    console.log(`Multiplication Table for ${number}:`);
    for (let i = 1; i <= limit; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
}

// Example usage:
const number = prompt("Enter a number for the multiplication table:");
const limit = prompt("Enter the limit for the table (e.g., 10):");

multiplicationTable(Number(number), Number(limit));*/


//* Qno 6 

/* Qno 7
var priceitem1=prompt("Enter the price of item 1");
var priceitem2=prompt("Enter the price of item 2 ");
var quantityitem1=prompt("Enter quantity of item 1 ");
var quantityitem2=prompt("Enter quantity of item 2 ");
var shipingcharges=prompt("Enter Charges of shiping ");
var totalcost=priceitem1+priceitem2+shipingcharges;
console.log(`Price of item 1 is ${priceitem1}`);
console.log(`quantity of item 1 is ${quantityitem1}`);
console.log(`Price of item 2 is ${priceitem2}`);
console.log(`quantity of item 2 is ${quantityitem2}`);
console.log(`Shipping charges ${shipingcharges}`);

console.log(`total cost of your order is ${totalcost}`); */

/* qno 8
var totalmarks=prompt("Enter your total marks");
var obtainedmarks=prompt("Enter your obtained marks");
var percentage=obtainedmarks/totalmarks*totalmarks;
console.log(`Total Marks : ${totalmarks}`);
console.log(`Obtained Marks : ${obtainedmarks}`);
console.log(`percentage: ${percentage}`);*/

/*  Qno 9
var Us_Dollar=104.80;
var Saudi_riyal=28;
var Pk_Rs=10*Us_Dollar+25*Saudi_riyal;
alert(`Total currency in PKR :${Pk_Rs}`)*/

/* qno 10
var number=10;
var finalnumber=(number+5)*10/2;
alert(`The final nuber is ${finalnumber}`);*/

/* Qno 11
var currentyear=prompt("enter current year");
var birthyear=prompt("enter your birth year");
var currentage=currentyear-birthyear;
console.log(`Current Year ${currentyear}`);
console.log(`Birth Year ${birthyear} `);
console.log(`Your Age ${currentage}`);*/

/*Qno 12
var raduis=prompt("Enter raduis");
var circumference=2*3.142*raduis;
var area=3.142*raduis*raduis;
console.log(`Raduis of circle: ${raduis}`);
console.log(`The circumference is: ${circumference}`);
console.log(`The area is: ${area}`);*/

/*Qno 13
var favsnack="Burger";
var currentage="20";
var maxage="60";
var snackperday="2";
var leftage=maxage-currentage;
var totalamount=leftage*365*snackperday
document.write(`Favourite snack: ${favsnack}`);
document.write(`Current Age: ${currentage}`);
document.write(`Estimated Max Age: ${maxage}`);
document.write(`Amount Of snack Per day: ${snackperday}`);
document.write(`You will need: ${totalamount} ${favsnack} to last until the ripe old of ${maxage}`);*/

function generateTable() {
    const number = parseInt(document.getElementById('numberInput').value);
    const tableContainer = document.getElementById('tableContainer');

    // Clear previous table
    tableContainer.innerHTML = '';

    if (isNaN(number)) {
        tableContainer.innerHTML = 'Please enter a valid number.';
        return;
    }

    // Create a table
    let table = '<table><tr><th>Multiplier</th><th>Result</th></tr>';
    
    for (let i = 1; i <= 10; i++) {
        const result = number * i;
        table += <tr><td>${number} x ${i}</td><td>${result}</td></tr>;
    }
    
    table += '</table>';

    // Display the table in the container
    tableContainer.innerHTML = table;
}

















