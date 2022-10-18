// - DOM - Document Object Model
// - It is an interface to access my documents and modify content of a webpage.

// document.getElementById("div1").innerHTML="Welcome to DOM Manipulation using JS";

// var CountryList=['India','Japan','China','Napal','Bhutan'];

// CountryList.map(item=>{
//     var li=document.createElement("li");
//     li.innerHTML=item;
//     document.getElementById('countries').appendChild(li);
// })

var Products= [
    {
        id:1,
        name:'Laptop',
        brand:'Apple',
        price:120000
    },
    {
        id:2,
        name:'Tablet',
        brand:'Samsung',
        price:16000
    },
    {
        id:3,
        name:'Camera',
        brand:'Nikon',
        price:24000
    },
    {
        id:4,
        name:'Mobile',
        brand:'One Plus',
        price:54000
    },
    {
        id:5,
        name:'Pendrive',
        brand:'Kingston',
        price:2000
    }

]

Products.map(item=>{
    var row=document.createElement('tr');
    var cell1=document.createElement('td');
    var cell2=document.createElement('td');
    var cell3=document.createElement('td');
    var cell4=document.createElement('td');

    cell1.innerHTML=item.id;
    cell2.innerHTML=item.name;
    cell3.innerHTML=item.brand;
    cell4.innerHTML=item.price;

    row.appendChild(cell1);
    row.appendChild(cell2);
    row.appendChild(cell3);
    row.appendChild(cell4);

    document.getElementById('tableBody').appendChild(row);
})

