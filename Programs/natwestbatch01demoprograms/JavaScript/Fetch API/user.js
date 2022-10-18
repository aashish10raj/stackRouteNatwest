fetch('https://jsonplaceholder.typicode.com/users')
 .then(response=>response.json())
 .then(data=>{
    data.map(item=>{
        var li=document.createElement('li');
        li.classList.add('list-group-item');
        li.innerHTML=item.name;
        document.getElementById('users').appendChild(li);
    })
 });