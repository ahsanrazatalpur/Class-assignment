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

//* Qno 2

/*/Qno 3
var name=prompt("Your name ?");
document.write(`Hello ${name}`);*/

//qno 6
var sub1=prompt("Enter subject 1 name");
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
document.write(`  ${totalmarks} ${totalobtained} ${totalpercentage}`);





