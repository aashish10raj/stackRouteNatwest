// HTTP Methods:
// post() : Create 
// get() : Retrieve 
// put() : Update 
// delete(): Delete 

const AddContact=()=>{
    fetch('http://localhost:8080/Contact',{
        method:'POST',
        headers:{
            'Content-Type':'application/json'
        },
        body:JSON.stringify({
            firstname: document.getElementById('fname').value,
            lastname: document.getElementById('lname').value,
            email: document.getElementById('email').value,
            phone: document.getElementById('phone').value,
            city: document.getElementById('city').value,
        })
    });
}

// const GetContacts=()=>{
// fetch('http://localhost:8080/Contact')
// .then(res=>res.json())
// .then(data=>console.log(data));
// }
// GetContacts();

const GetContacts=()=>{
    fetch('http://localhost:8080/Contact')
    .then(res=>res.json())
    .then(data=>{
        let card='';
        data.map(item=>{
            card +=` 
            <div class="col-md-3">
            <div class="card">
            <div class="card-body">
            <i class="glyphicon glyphicon-pencil" onclick="UpdateContact(${item.id})"></i>
            <i class="fas fa-times float-end fa-lg text-danger" onclick="DeleteContact(${item.id})"></i>

            <h5 class="card-title">${item.firstname} ${item.lastname}</h5>
            <p class="card-text">${item.email}</p>
            <p class="card-text">${item.phone}</p>
            <p class="card-text">${item.city}</p>
            </div>
            </div>
            </div>`;
        });
        document.getElementById('contactList').innerHTML=card;
    });
    }

    const DeleteContact=(id)=>{
        //console.log(id);
        fetch(`http://localhost:8080/Contact/${id}`,{
            method:'Delete'

        });
    }

    const UpdateContact=(id)=>{
        fetch(`http://localhost:8080/contact/${id}`,{
            method: 'PUT',
            headers:{
                'Content-Type':'application/json'
            },
            body:JSON.stringify({
                firstname: 'test',
                lastname: 'testing',
                email: 't@t.com',
                phone: '0987654321',
                city: 'Dehradoon',
            })
        });
    }
 GetContacts();