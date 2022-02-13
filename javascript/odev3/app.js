const menu = [
  {
    id: 1,
    title: "Tteokbokki",
    category: "Korea",
    price: 10.99,
    img:
      "https://twoplaidaprons.com/wp-content/uploads/2020/09/tteokbokki-top-down-view-of-tteokbokki-in-a-bowl-500x500.jpg",
    desc: `Spicy rice cakes, serving with fish cake.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "https://www.savingdessert.com/wp-content/uploads/2019/02/Dan-Dan-Noodles-10.jpg",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Yangzhou Fried Rice",
    category: "China",
    price: 12.99,
    img:
      "https://salu-salo.com/wp-content/uploads/2013/02/Yangzhou-Fried-Rice1.jpg",
    desc: `Yangzhou style fried rice, serving with bean and pickles `,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Doroyaki",
    category: "Japan",
    price: 3.99,
    img:
      "https://www.justonecookbook.com/wp-content/uploads/2011/10/Dorayaki-New-500x400.jpg",
    desc: `Red bean paste dessert, serving with honey.`,
  },
];
const buttonArea = document.querySelector('#a1');
const ekle = document.querySelector('#a2')
const allItem = () =>{
  menu.forEach(element => {
    console.log(element.category)
    myCard(element);
  });

}
const myCard = (e) =>{
  console.log(e)
  ekle.classList.add("d-flex")
  const cardDiv = document.createElement("div");
  cardDiv.classList.add("col-5", "mx-auto" , "d-flex", "mb-4");

  const leftSdie = document.createElement("div");
  leftSdie.classList.add("col-4");

  const image = document.createElement("img")
  image.src = e.img;
  image.style.border="3px solid black" 
  image.style.borderRadius = "10px"
  image.style.height = "150px";
  image.style.width = "150px"
  leftSdie.appendChild(image);


  const rightSide = document.createElement("div");
  rightSide.classList.add("col", "d-flex" , "flex-column");

  const rightSideTop = document.createElement("div");
   rightSideTop.classList.add("d-flex", "w-100" ,"justify-content-between", "col-3")
   rightSideTop.style.borderBottom = "2px solid black"
  

  const foodName = document.createElement("span")
  foodName.innerText = e.title;
  
  const foodPrice = document.createElement("span")
  foodPrice.innerText = e.price;
  rightSideTop.appendChild(foodName);
  rightSideTop.appendChild(foodPrice);

  const rightSideBottom = document.createElement("div")
  rightSideBottom.classList.add("col", "mt-4")
  const desc = document.createElement("p");
  desc.innerText = e.desc;
  rightSideBottom.appendChild(desc);
  rightSide.appendChild(rightSideTop)
  rightSide.appendChild(rightSideBottom);

  cardDiv.appendChild(leftSdie);
  cardDiv.appendChild(rightSide); 
  ekle.appendChild(cardDiv);
  ekle.classList.add("flex-wrap")

}
allItem();

const filtered = (e) =>{
  ekle.innerHTML =  '';
  const text =e.target.innerText;
  const filterMenu = menu.filter(e => e.category == text)
  if(text == "All"){
    menu.forEach(element => {
        myCard(element)
    });
  }
  filterMenu.forEach(element => {
    
      myCard(element)
    
  });
  
}

const addButtons = () =>{

const myMenuDiv = document.createElement("div");
myMenuDiv.classList.add("d-flex", "w-50","mx-auto", "align-items-center" ,"justify-content-center");

const btnAll = document.createElement("button");
btnAll.classList.add("btnAll", "mr-2")
btnAll.innerText = "All";
btnAll.addEventListener("click", filtered) 

const btnKorea = document.createElement("button");
btnKorea.classList.add("btnKorea", "mr-2")
btnKorea.innerText = "Korea";
btnKorea.addEventListener("click" , filtered)

const btnJapan = document.createElement("button");
btnJapan.classList.add("btnJapan", "mr-2")
btnJapan.innerText = "Japan";
btnJapan.addEventListener("click", filtered)

const btnChina = document.createElement("button");
btnChina.innerText = "China";
btnChina.classList.add("btnChina");
btnChina.addEventListener("click", filtered)




myMenuDiv.appendChild(btnAll);
myMenuDiv.appendChild(btnKorea);
myMenuDiv.appendChild(btnJapan);
myMenuDiv.appendChild(btnChina);
buttonArea.appendChild(myMenuDiv)

}
addButtons();


