// Default state Object
const state= { items: ["Meeting at 9.00 AM"]};

// Reducers

function reducer(intialState=state, action){
    switch(action.type){
        case "GET":
            return intialState;
        case "ADD":
            intialState.items.push(action.payload);
            return intialState;
        case "REMOVE":
            intialState.items.splice(intialState.items.indexOf(action.payload),1);
            return intialState;
        case "REMOVEALL":
                intialState.items.splice(0,intialState.items.length);
                return intialState;
    }
}

// Create Store
const store=Redux.createStore(reducer, state, window.__REDUX_DEVTOOLS_EXTENSION_ && window.__REDUX_DEVTOOLS_EXTENSION_());

const todolist=document.getElementById("todolist");

// Subscribe the actions

store.subscribe(()=>{
    const result=store.getState();
    todolist.innerHTML="";
    result.items.map(item=>{
        const li=document.createElement("li");
        li.className="list-group-item";
        li.innerHTML=`${item} <i class="fa-sharp fa-solid fa-xmark fa-lg float-end text-danger" onclick="RemoveItem()"></i>`;
        todolist.appendChild(li);
    });
});

// Trigger Action
store.dispatch({type: "GET"});

function AddItem() {
    const item=document.getElementById('txtItem').value;
    store.dispatch({type: "ADD", payload: item});
}
function RemoveItem(item){
    store.dispatch({type: "REMOVE", payload: item});
}
function RemoveAllItem(item){
    store.dispatch({type: "REMOVEALL"});
}