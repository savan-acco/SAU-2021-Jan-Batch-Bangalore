import React from 'react'
import {View,Button,TextInput,Text} from 'react-native'

import Print from './components/Print'
import Home from './components/Home'
import uuid from "uuid";

//import { createStackNavigator } from '@react-navigation/stack';
//import { NavigationContainer } from '@react-navigation/native';
//import {createStackNavigator} from 'react-navigation'
 import {createAppContainer} from 'react-navigation'; 
 import {createStackNavigator} from 'react-navigation-stack';

const RootStack=createStackNavigator(
  {
    Home:Home
  }
)

class App extends React.Component{

    constructor()
    {
      super();
      this.state={
        arr:[],
        name:'',
        id: uuid(),
        description:''
      }
    }

    handleDelete = id => {
      const filteredItems = this.state.arr.filter(item => item.id !== id);
      this.setState({
        arr: filteredItems
      });
    };

    submit()
    {
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
        id: uuid(),
      },()=>{
        console.log(this.state.arr);
      }
      );


    }

    render()
    {
      return (
        <View>

        <RootStack/>

        <TextInput placeholder="Enter name" onChangeText={(text)=>{
          this.setState({name:text})
        }} style={{borderWidth:2,borderColor:'skyblue',margin:20}} />

        <TextInput placeholder="Enter Description" onChangeText={(text)=>{
          this.setState({description:text})
        }} style={{borderWidth:2,borderColor:'skyblue',margin:20}} />
        
        <Button title="submit" onPress={()=>(this.submit())}/>

        {/* <Text>Hi</Text> */}
        <Print arr={this.state.arr} handleDelete={this.handleDelete} />

        </View>
      )
    }

}

export default App;















// import { StatusBar } from 'expo-status-bar';
// import React from 'react';
// import { StyleSheet, Text, View } from 'react-native';

// export default function App() {
//   return (
//     <View style={styles.container}>
//       <Text>Open up App.js to start working on your app!</Text>
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: '#fff',
//     alignItems: 'center',
//     justifyContent: 'center',
//   },
// });
