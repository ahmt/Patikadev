let counter = 0;
let active = true;
const list = document.getElementById(list)
const newElement = () =>{
    counter++
    let inputText = document.querySelector('#task');
    localStorage.setItem(counter, inputText.value);
    console.log(inputText.value)
    const listItems = document.createElement('li')
    listItems.innerHTML = `${localStorage.getItem(counter)}`
    document.body.appendChild(list)

}
