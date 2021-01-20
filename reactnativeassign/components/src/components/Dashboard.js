import React, { useState, useEffect } from "react";
import { Text, TextInput, View, StyleSheet, Button, AsyncStorage } from "react-native";
import {v4 as uuid4} from 'uuid' 

import Print from './Print'


import todo from './todo'



class DashBoard extends React.Component{

    //const {navigation} =this.props;
    
    constructor(){
      super();
      this.state={
        arr:[],
        name:'',
        id: uuid4(),
        description:''
      }
    }

    handleDelete = id => {
      const filteredItems = this.state.arr.filter(item => item.id !== id);
      this.setState({
        arr: filteredItems
      });
    };

    submit=()=>{

      console.log("HI"); 
      const newItem = {
        name: this.state.name,
        description: this.state.description,
        id:this.state.id
      };

      const updatedItems = [...this.state.arr, newItem];
      this.setState({
        arr: updatedItems,
        name: "",
        description:"",
        id: uuid4(),
      },()=>{
        console.log(this.state.arr);
      }
      );

      //this.move();
    }

 

     move=()=>{
          const {navigation} =this.props;
          //console.log(navigation);
          //console.log("hi");
          
          
          navigation.navigate("todo",{arr:this.state.arr} ); 
        }

      render(){
        return (
        

        <View>
        <Button title="View Notes" onPress={this.move} />
      
        
        <TextInput placeholder="Enter title" onChangeText={(text)=>{ 
          this.setState({name:text}) 
        }} style={{borderWidth:2,borderColor:'skyblue',margin:20}} />

        <TextInput placeholder="Enter Description" onChangeText={(text)=>{
          this.setState({description:text})
        }} style={{borderWidth:2,borderColor:'skyblue',margin:20}} />
        
        

        <Button title="submit" onPress={this.submit}/>
        <Print arr={this.state.arr} handleDelete={this.handleDelete} />
        
        <todo arr={this.state.arr}/>
     

        </View>
        
    )
      }


      
}





export default DashBoard;