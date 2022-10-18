// Asynchronous Programming
// Synchronous - One at a time
// Asynchronous - Parallel Execution.

// setTimeOut()

// setTimeout(()=>{
//     console.log('Task Completed');
// },2000);

// console.log("Next Task ! Started");

// const items=['item1','item2','item3'];

// const GetItems=()=>{
//     setTimeout(()=>{
//         items.map(x=>console.log(x));
//     },2000);
// }

// const AddItem=(item)=>{
//     setTimeout(()=>{
//         items.push(item);
//     },3000)
// }
// AddItem('item4');
// GetItems();

// Promise
// Syntax of Promise

// const promise=new Promise((resolve, reject)=>{
//     let isError=true;
//     if(!isError){
//         resolve('Task Completed');
//     }else{
//         reject('Error Occured');
//     }
// });
// promise
// .then(x=>console.log(x))
// .catch(err=>console.log(err));

// const items=['item1','item2','item3'];

// const GetItems=()=>{
//     setTimeout(()=>{
//         items.map(x=>console.log(x));
//     },2000);
// }

// const AddItem=(item)=>{
//     return new Promise((resolve, reject)=>{
//     setTimeout(()=>{
//       //  items.push(item);
//           let isError=false;
//         if(!isError){
//             resolve(items.push(item));
//         }else{
//             reject("Error Occured");
//         }
//     },3000)
// });
// }
// AddItem('item4')
// .then(x=>{
//     GetItems();
// })
// .catch(err=>console.log(err));

// Async Await

const items=['item1','item2','item3'];

const GetItems=()=>{
    setTimeout(()=>{
        items.map(x=>console.log(x));
    },2000);
}

const AddItem=(item)=>{
    return new Promise((resolve, reject)=>{
    setTimeout(()=>{
      //  items.push(item);
          let isError=false;
        if(!isError){
            resolve(items.push(item));
        }else{
            reject("Error Occured");
        }
    },3000)
});
}
const Runtask= async()=>{
    await AddItem('item4');
    GetItems();
}
Runtask();

