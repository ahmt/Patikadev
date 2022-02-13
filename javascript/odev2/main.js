
var name;
let myCheckBox;
let inputText = document.querySelector('#task');
let ul = document.querySelector('#list');
let todos;

let btn_delete;


const startC = () =>{ 
    
        
    todos = JSON.parse(localStorage.getItem("name"))
    if(todos != null){
    todos.forEach(e => {
    myItems(e);
    });
}
}
    
   

const addControl = () =>{
     todos = JSON.parse(localStorage.getItem("name"))
   
   todos.push({
    "name" : inputText.value,
    "isactive" : true 
} );

   localStorage.setItem("name",JSON.stringify(todos))
   
   while  (ul.firstChild) {
    ul.removeChild(ul.lastChild);}
    todos.forEach(e => {
      
      myItems(e);
    
     
  }); 
}
const newElement = () =>{
   
 
    addControl(); 
   

}
const deleteItem = (e) => {
    console.log(e)
    const todo = e.target.parentElement.parentElement;
    const text = todo.firstChild.textContent;
    console.log(text)
    let todos = JSON.parse(localStorage.getItem("name"));
    todos = todos.filter(td => td.name != text);
    console.log(todos)
    localStorage.setItem("name", JSON.stringify(todos));
 
    todo.remove();
}
const checked = (e) =>{
    const todo = e.target.parentElement.parentElement;
    const text = todo.firstChild.textContent;
    console.log(text)
    let todos = JSON.parse(localStorage.getItem("name"));
    todos.forEach(element => {
        console.log(element.name)
        console.log(e.target.checked)
        if(text == element.name){
            element.isactive = !e.target.checked;
        }
    });
    localStorage.setItem("name" ,JSON.stringify(todos))
    console.log(todo)
    /*
    console.log(e.target)
    if ( e.checked == true){
        e.checked = false;
        
    }else {
        e.checked = true;
    }
    */
    
    
       
}
const myItems = (e) =>{
    const myDiv = document.createElement("li");
    myDiv.classList = "myDiv"
    const myLi = document.createElement("li");
    myLi.textContent = e.name;
    
    myCheckBox = document.createElement("input")
    myCheckBox.type="checkbox";
    
    myCheckBox.checked = !e.isactive;
    myCheckBox.classList.add("itsdone");
    myCheckBox.addEventListener('click', checked)
    const myButton = document.createElement("button")
    myButton.textContent = "Sil";
    myButton.classList.add("deleteBtn")
    myButton.addEventListener("click" , deleteItem);
    const myRightSide = document.createElement("div")
    myRightSide.classList = "myDiv"
    myDiv.appendChild(myLi);
    myRightSide.appendChild(myCheckBox);
    myRightSide.appendChild(myButton);
    myDiv.appendChild(myRightSide)
    ul.appendChild(myDiv);
    console.log(e)
    btn_delete = document.querySelector('.deleteBtn');
     
     
}
startC();






const resetToDo = () =>{
    localStorage.clear();
    while  (ul.firstChild) {
    ul.removeChild(ul.lastChild);}
    localStorage.setItem("name" ,JSON.stringify([]))
};
