import React, { Component } from "react";


export default function TodoItem(props) {
  return (
    <div>
      <li className="list-group-item text-capitalize d-flex justify-content-between my-2">
        <h6>{props.title}</h6>
        <h6>{props.time}</h6>
        <div className="todo-icon">
         
          <span className="mx-2 text-danger" onClick={props.handleDelete}>
            <i className="fas fa-trash" />
          </span>
        </div>
      </li>
    </div>
  );
}
