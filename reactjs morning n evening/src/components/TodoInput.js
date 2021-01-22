import React, { Component } from "react";

export default class TodoInput extends Component {
  render() {
    const { item, handleChange, handleSubmit,time,handleChangeTime } = this.props;
    return (
      <div className="card card-body my-3">
        <form onSubmit={handleSubmit}>
          <div className="input-group">
            <div className="input-group-prepend">
              <div className="input-group-text bg-primary text-white">
                <i className="fas fa-book" />
              </div>
            </div>
            <input
              type="text"
              className="form-control text-capitalize"
              placeholder="add a todo "
              value={item}
              onChange={handleChange}
            />
             <input
              type="text"
              className="form-control text-capitalize"
              placeholder="add todo's required time "
              value={time}
              onChange={handleChangeTime}
            /> 
          </div>
           <button
            type="submit"
            className="btn btn-block btn-success mt-3"
            onSubmit={handleSubmit}
            >
            Submit
          </button> 
        </form>
      </div>
    );
  }
}
