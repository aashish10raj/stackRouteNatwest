import {createStore} from "redux";
import reducer from "./reducer";

export const initialState= {
    todoList: [
        {
            id: 1,
            item: "Meeting at 9.00 AM"
        },
        {
            id: 2,
            item: "Pay Electricity Bill"
        }
    ],
    todoItem: {}
}
const store=createStore(reducer, initialState);
export default store;