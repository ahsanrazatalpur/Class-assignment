
//                 BLCS/2k23/06


//      ASSSIGNEMENT N#2 Theory of programing language

//pdf #1

 /*Qno 1
alert("Hello World");*/

/*Qno 2
alert("Error! Please enter a valid password.");*/

/*Qno 3
alert("Welcome to JS land... \n Happy Coding") */

 /*Qno 4
alert("Welcome to JS land...");
alert("Happy Coding!");*/

/* Qno 5 
alert("Hello! I can run JS through my web browsers console")*/

/* Qno 6
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>math expression</title>
    <link rel="stylesheet" href="ch05.css">
    
</head>
<body>
 <h3>CHAPTER # 5 MATH EXPRESSION </h3> 
 <script>alert("hello world");</script>

</body>
</html>

/* Qno 7
(a) Head
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>math expression</title>
    <link rel="stylesheet" href="ch05.css">
    <script src="ch05.js"></script>
</head>
<body>
 <h3>CHAPTER # 5 MATH EXPRESSION </h3> 
</body>
</html>

(b) Body(before html page)
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>math expression</title>
    <link rel="stylesheet" href="ch05.css">
    
</head>
<body>
    <script src="ch05.js"></script>
 <h3>CHAPTER # 5 MATH EXPRESSION </h3> 
</body>
</html>

(c) Body (inside html page)
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>math expression</title>
    <link rel="stylesheet" href="ch05.css">
    
</head>
<body>
    <script src="ch05.js"></script>
 <h3>CHAPTER # 5 MATH EXPRESSION </h3> 

</body>
</html>

(d) body(after html page)
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>math expression</title>
    <link rel="stylesheet" href="ch05.css">
    
</head>
<body>
    <script src="ch05.js"></script>
 <h3>CHAPTER # 5 MATH EXPRESSION </h3> 

</body>
</html>

  pdf #3

/*  Qno 1
var age=20;
alert(`Iam ${age} year old`);*/


/*Qno 2 
// Check if the visit count exists in localStorage
/*let visitCount = localStorage.getItem('visitCount');*/

// If it doesn't exist, initialize it to 0
/*if (!visitCount) {
    visitCount = 0;

localStorage.setItem('visitCount', visitCount);
document.getElementById('visitCount').innerText = You have visited this site ${visitCount} time${visitCount !== 1 ? 's' : ''};*/

// Qno 3 
/*let birthyear=2004;
document.write(`My birth year is ${birthyear} <br>`);
document.write("Data type of my declared variables is number");*/

/*Qno 4 
var visitorname=prompt("Enter your name");
var quantity=prompt("Enter Quantity of produt");
var producttitle=prompt("Enter product name");
document.write(`${visitorname} orderd ${quantity} ${producttitle}(s) on XYZ Clothing store`);*/

 //pdf #4

/* Qno 1 
var name,fname,caste; */

/* Qno 2 
// Legal Variables
var name="Ahsan";
var name1="Ali";
var na_me="Raza";
var $name="Ayaz";
var $my_Name="Zain";

// Illegal Variables
var 1name="Ahsan";
var my Name="raza";
var -$js="ali";
var my\name="zain";
var !name="talpur"; */

// Qno 3 
/*document.write("Rules of naming JS variables<br>");
document.write("Variables names can only contain _____ ,_______or________ \n For example  $my_1stVariable<br>");
document.write("Variables must begin with a _______ , _______ or ________. For example $name,_name or name<br>");
document.write("Variables names are case________<br>");
document.write("Variables name should not be JS<br>");*/

//pdf #5

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

/*
function generateTable() {
    const number = parseInt(prompt("Enter a number:")); // Prompt user for input
    const tableContainer = document.createElement('div'); // Create a container for the table

    // Clear previous table
    document.body.appendChild(tableContainer);

    if (isNaN(number)) {
        tableContainer.innerHTML = 'Please enter a valid number.';
        return;
    }

    // Create a table
    let table = '<table style="width: 50%; border-collapse: collapse; margin: 20px 0;">';
    table += '<tr><th style="border: 1px solid #000; padding: 10px;">Multiplier</th>';
    table += '<th style="border: 1px solid #000; padding: 10px;">Result</th></tr>';
    
    for (let i = 1; i <= 10; i++) {
        const result = number * i;
        table += <tr><td style="border: 1px solid #000; padding: 10px;">${number} x ${i}</td>;
        table += <td style="border: 1px solid #000; padding: 10px;">${result}</td></tr>;
    }
    
    table += '</table>';

    // Display the table in the container
    tableContainer.innerHTML = table;
}

// Call the function to execute it
generateTable();
*/
/*
// Step a: Store a Celsius temperature into a variable
let celsius = 25; // Example Celsius temperature

// Step b: Convert Celsius to Fahrenheit
let fahrenheitFromCelsius = (celsius * 9/5) + 32;
console.log(${celsius}°C is ${fahrenheitFromCelsius.toFixed(2)}°F);

// Step c: Store a Fahrenheit temperature into a variable
let fahrenheit = 77; // Example Fahrenheit temperature

// Step d: Convert Fahrenheit to Celsius
let celsiusFromFahrenheit = (fahrenheit - 32) * 5/9;
console.log(${fahrenheit}°F is ${celsiusFromFahrenheit.toFixed(2)}°C);
*/


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

//pdf #6

/* QNO 1
var a=10;
console.log("The value of a is :10")
++a;
console.log(`The Value of ++a is ${a}`);
console.log(`Now the Value of a is ${a}`);

a++;
console.log(`The Value of a++ is ${a}`);
console.log(`Now the Value of a is ${a}`);

--a;
console.log(`The Value of --a is ${a}`);
console.log(`Now the Value of a is ${a}`);

a--;
console.log(`The Value of a-- is ${a}`);
console.log(`Now the Value of a is ${a}`);*/

/* Qno 2
var a = 2;
var b = 1;

var result = --a - --b + ++b + b--;

console.log("a:", a);         // Output: a: 1
console.log("b:", b);         // Output: b: 0
console.log("result:", result); // Output: result: 3
*/
/*Qno 3
var name=prompt("Your name ?");
document.write(`Hello ${name}`);*/

/* Qno 5
function generateTable() {
    // Prompt the user for a number, defaulting to 5 if no input is provided
    let number = prompt("Enter a number (or leave blank for 5):");
    number = number ? parseInt(number) : 5; // Default to 5 if empty

    // Clear previous table (if you're integrating this into an HTML page)
    const tableContainer = document.getElementById('tableContainer');
    tableContainer.innerHTML = '';

    // Validate the number
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

// Call the function to generate the table on page load
generateTable();*/

//qno 6
/*var sub1=prompt("Enter subject 1 name");
var sub2=prompt("Enter subject 2 name");
var sub3=prompt("Enter subject 3 name");
marks=100;
var sub1mark=prompt("Enter obtained marks in sub 1");
var sub2mark=prompt("Enter obtained marks in sub 2");
var sub3mark=prompt("Enter obtained marks in sub 3");
var totalmarks=marks+marks+marks;
var totalobtained=sub1mark+sub2mark+sub3mark;
percentage1=sub1mark/100*100;
percentage2=sub2mark/100*100;
percentage3=sub3mark/100*100;
totalpercentage=percentage1+percentage2+percentage3

document.write("Subject   Total marks   Obt marks   Percentage");
document.write(`${sub1} ${marks} ${sub1mark}${percentage1}`);
document.write(`${sub2} ${marks} ${sub2mark} ${percentage2}`);
document.write(`${sub3} ${marks} ${sub3mark} ${percentage3}`);
document.write(`  ${totalmarks} ${totalobtained} ${totalpercentage}`);*/
