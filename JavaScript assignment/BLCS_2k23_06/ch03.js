/*  Qno 1
var age=20;
alert(`Iam ${age} year old`);*/

// Qno 2 
// Check if the visit count exists in localStorage
let visitCount = localStorage.getItem('visitCount');

// If it doesn't exist, initialize it to 0
if (!visitCount) {
    visitCount = 0;
}

// Increment the visit count
visitCount++;

// Store the updated count back in localStorage
localStorage.setItem('visitCount', visitCount);

// Display the visit count on the webpage
document.getElementById('visitCount').innerText = You have visited this site ${visitCount} time${visitCount !== 1 ? 's' : ''}.;

// If it doesn't exist, initialize it to 0
//if (!visitCount) {
  //*  visitCount = 0;
//}

// Increment the visit count
//visitCount++;

// Store the updated count back in localStorage
//localStorage.setItem('visitCount', visitCount);

// Display the visit count on the webpage
//document.getElementById('visitCount').innerText = You have visited this site ${visitCount} time${visitCount !== 1 ? 's' : ''}.;

// Qno 3 
/*let birthyear=2004;
document.write(`My birth year is ${birthyear} <br>`);
document.write("Data type of my declared variables is number");*/

/*Qno 4 
var visitorname=prompt("Enter your name");
var quantity=prompt("Enter Quantity of produt");
var producttitle=prompt("Enter product name");
document.write(`${visitorname} orderd ${quantity} ${producttitle}(s) on XYZ Clothing store`);*/
