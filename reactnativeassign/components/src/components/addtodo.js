import React, { useState, useEffect } from "react";
import { Text, TextInput, View, StyleSheet, Button, AsyncStorage } from "react-native";
import {v4 as uuid4} from 'uuid' 

import Print from './Print'
import todo from './todo'



class addtodo extends React.Component{

    

     move=()=>{
          const {navigation} =this.props;
     
          
          navigation.navigate("Dashboard" );
        }

      render(){
        return (
        
        <View>
        <Button title="click here to add notes" onPress={this.move} />
       
        </View>
        
    )
      }


      
      
}





export default addtodo;