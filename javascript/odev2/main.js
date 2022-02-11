let counter = 0;

let liItem;
let inputText = document.querySelector('#task');

let ul = document.querySelector('#list');

const newElement = () =>{
    counter++
    
    localStorage.setItem(counter , inputText.value );
   
    
    liItem = document.createElement("li")
    let btnDelete = document.createElement("span")
    
    
    liItem.textContent = localStorage.getItem(counter);
    ul.append(liItem);
    btnDelete.insertAdjacentElement('afterbegin', liItem);


}

const resetToDo = () =>{
    localStorage.clear();
    while  (ul.firstChild) {
    ul.removeChild(ul.lastChild);

};
