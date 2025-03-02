// pdf ch-35_38
 
/*/Qno1------------------------------
function dateTime(){
    document.write(new Date());
}
dateTime();*/

/*/Qno2
function firstastName(firstName, lastName){
    document.write("Hello, " + firstName + " " + lastName);
}
firstastName("Ahsan", "Raza");*/

/*/Q3
function sum(a,b){
    var sum=a+b;
    return sum;
}
document.write("Sum " + sum(3, 7));*/

/*/Q4
function calculator(){
    var opt=prompt("Enter your operation ");
    var n1=prompt("enter numbe 1");
    var n2=prompt("enter number 2");
    var result;
    switch(opt){
        case `+`:
            result=n1+n2;
            break;

            case `-`:
            result=n1-n2;
            break;

            case `*`:
            result=n1*n2;
            break;
            case `/`:
                result=n1/n2;
                break;

            default:
                alert("invalid opt");
        
        

    }
}*/

/*Qno5
function square(num){
    return num * num;
}
document.write("Square " + square(4));*/

/*/Qno6
function fact(num){
    if (num === 0) return 1;
    else
     return num * fact(num - 1);
}
document.write("Factorial " + fact(5));*/

/*/Qno7
function count(start, end){
    var start=prompt("enter start no");
    var end=prompt("enter end no");
    

    for (let i = start; i <= end; i++) {
        document.write(i + " ");
    }
}
count(1, 10);*/

/*/Qno8
function hypotenuse(base, perpendicular){
    function square(num){
        return num * num;
    }
    let hypotenuse = Math.sqrt(square(base) + square(perpendicular));
    document.write("Hypotenuse: " + hypotenuse);
}
hypotenuse(3, 4);*/

/*/Qno9
function areaRectangle(w, h){
    document.write(w * h); 
}
document.write("Area: ");
areaRectangle(9, 6);*/

/*/Qno10
function palindrome(str){
    let reversedStr = '';
    for (let i = str.length - 1; i >= 0; i--){
        reversedStr += str[i];
    }
    
    if (str === reversedStr) 
        document.write("Is palindrome: true");
    else 
        document.write("Is palindrome: false");
}
palindrome("madam");*/

/*/ qno 11
funtion upercase(){
    var inputString="hello";
    var result=toUpperCaseString(inputString);
    document.write(result);
}*/

/*/Q13
function countOcc(str, letter) {
    document.write(str.split(letter).length - 1 + "<br><br>");
}
countOcc('Ali', 'a');*/

// pdf chapters38_42

 /*/Qno1
function power(a, b){
    document.write("Result: " + Math.pow(a, b));
}
power(4, 5);*/

/*/Qno2
function LeapYear(year){
    if ((year == 2012 || 2016 || 2020){
        document.write(year + " is a leap year");
    } else{
        document.write(year + " is not a leap year");
    }
}
LeapYear(2024);*/

/*/Q3
function areaOfTriangle(a, b, c){
    document.write("Area of Triangle: " + Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c)));
}
areaOfTriangle(5, 7, 12);*/


/*/Q4
function averageCal(marks){
    var average = (marks[0] + marks[1] + marks[2]) / 3;
    document.write("Average: " + average + "<br>");
}
function PercentageCal(marks){
    var percentage = ((marks[0]+marks[1]+marks[2]) / 300) * 100;
    document.write("Percentage: " + percentage + "%<br>");
}
function mainFunction(marks){
    averageCal(marks);
    PercentageCal(marks);
}
mainFunction([34, 50, 75]);*/

/*/Qno5
function indexOf(string, char){
    var index = -1;
    for (var i = 0; i < string.length; i++){
        if (string[i] === char) {
            index = i;
            break;
        }
    }
    document.write(index+"<br>");
}
indexOf("Hasnain faraz", "S");*/

/*/Qno6
function vowelsDel(sentence){
    var vow = sentence.replace(/[aeiou]/gi, "");
    document.write(vow + "<br>");
}
vowelsDel("This is a test sentence.");*/

/*/Qno7
function count(text){
    var count1 = 0;
    var vowels = "aeiouAEIOU";

    for (var i = 0; i < text.length - 1; i++){
        var occ = text[i] + text[i + 1];
        if (vowels.includes(text[i]) && vowels.includes(text[i + 1])){
            switch (occ.toLowerCase()){
                case "aa":
                case "ae":
                case "ai":
                case "ao":
                case "au":
                case "ea":
                case "ee":
                case "ei":
                case "eo":
                case "eu":
                case "ia":
                case "ie":
                case "ii":
                case "io":
                case "iu":
                case "oa":
                case "oe":
                case "oi":
                case "oo":
                case "ou":
                case "ua":
                case "ue":
                case "ui":
                case "uo":
                case "uu":
                    count1++;
                    break;
            }
        }
    }
    document.write("Number of occurrences: " + count1 + "<br>");
}
count("Please read this application and give me gratuity");*/

/*/Qno8
function meters(distance){
    var meters = distance * 1000;
    document.write(meters + " meters<br>");
}

function feet(distance){
    var feet = distance * 3280.84;
    document.write(feet + " feet<br>");
}

function inches(distance){
    var inches = distance * 39370.1;
    document.write(inches + " inches<br>");
}

function centimeters(distance){
    var centimeters = distance * 100000;
    document.write(centimeters + " cm<br>");
}

var distanceKm = 23;
meters(distanceKm);
feet(distanceKm);
inches(distanceKm);
centimeters(distanceKm);*/

/*/Qno9
function overtime(hours){
    if (hours > 40) {
        document.write("Overtime Pay Rs " + (hours - 40) * 12 + "<br>");
    } else {
        document.write("No overtime pay <br>");
    }
}
overtime(45);*/

/*/Qno10
function notes(amount){
    document.write("100: " + (amount / 100 | 0) + "<br>");
    document.write("50: " + ((amount % 100) / 50 | 0) + "<br>");
    document.write("10: " + ((amount % 50) / 10 | 0) + "<br>");
}
notes(370);

*/

// pdf objects

/*/Qno1
var itemsArray = [
    {name:"juice", price: 50, quantity: 3},
    {name:"cookie", price: 30, quantity: 9},
    {name:"shirt", price: 880, quantity: 1},
    {name:"pen", price: 100, quantity: 2}
];

var totalCost = 0;
for (var i=0; i<itemsArray.length; i++) {
    document.write(itemsArray[i].name + "Total: " + (itemsArray[i].price * itemsArray[i].quantity) + "<br>");
    totalCost += itemsArray[i].price * itemsArray[i].quantity;
}
document.write("All Items Total: " + totalCost);*/

/*/Qno2
var user = {
    name: "Hasnain Faraz",
    email: "hasnain342@gmail.com",
    password: "87654",
    age: 20,
    gender: "male",
    city: "Badin",
    country: "Pakistan"
};
document.write("Age exist: " + user.age + "<br>");
document.write("Country exist: " + user.country + "<br>");
document.write("FirstName exist: " + (user.firstName || "Not found")+"<br>");
document.write("LastName exist: " + (user.lastName || "Not found")+"<br>");*/

