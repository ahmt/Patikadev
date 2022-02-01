let counter = 0;

let liItem;
let inputText = document.querySelector('#task');

let ul = document.querySelector('#list');

const newElement = () =>{
    counter++
    
    localStorage.setItem(counter , inputText.value );
   
    
    liItem = document.createElement("li","span")
    let btnDelete = document.createElement("span")
    btnDelete.innerHTML = "Sil"
    
    liItem.textContent = localStorage.getItem(counter);
    ul.append(liItem, btnDelete);
    


}

const resetToDo = () =>{
    localStorage.clear();
    while  (ul.firstChild) {
    ul.removeChild(ul.lastChild) }
}