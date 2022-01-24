
let myNames = prompt("Lütfen İsminizi Giriniz")
let zaman =  new Date().toLocaleString();





document.getElementById("myName").innerHTML = myNames;
document.getElementById("myClock").innerHTML = zaman;