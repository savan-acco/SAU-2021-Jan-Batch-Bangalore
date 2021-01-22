import React, { Component } from "react";
import TodoInput from "./components/TodoInput";
import TodoList from "./components/TodoList";

import "bootstrap/dist/css/bootstrap.min.css";
import uuid from "uuid";
class App extends Component {
  state = {
    items: [],
    id: uuid(),
    item: "",
    time:""
  };
  handleChange = e => {
    this.setState({
      item: e.target.value
    }
    );
  };

  handleChangeTime = e => {
    this.setState({
      time: e.target.value
    }
    );
  };

  handleSubmit = e => {
    e.preventDefault();

    const newItem = {
      id: this.state.id,
      title: this.state.item,
      time:this.state.time
    };

    const updatedItems = [...this.state.items, newItem];
    updatedItems.sort((a, b) => {
       return b.time - a.time;
     })
    
    this.setState({
      items: updatedItems,
      item: "",
      time:"",
      id: uuid(),
    });
  };

  handleDelete = id => {
    const filteredItems = this.state.items.filter(item => item.id !== id);
    this.setState({
      items: filteredItems
    });
  };

  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-10 mx-auto col-md-8 mt-4">
            <h3 className="text-capitalize text-center">TODO</h3>
            <h2>      Sorted According to Higher Time priority</h2>
            <TodoInput
              item={this.state.item}
              time={this.state.time}
              handleChange={this.handleChange}
              handleSubmit={this.handleSubmit}
              handleChangeTime={this.handleChangeTime}
           
            />
            <TodoList
              items={this.state.items}
              clearList={this.clearList}
              handleDelete={this.handleDelete}
            />
          </div>
        </div>
      </div>
    );
  }
}

export default App;
