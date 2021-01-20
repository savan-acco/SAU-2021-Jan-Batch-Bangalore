import React, { useState, useEffect } from "react";
import { Text, TextInput, View, StyleSheet, Button, AsyncStorage } from "react-native";

import Print from './Print'


const todo = (props) => {

  const list = () => {
    return this.props.arr.map((element) => {
      return (
        <View >
          <Text>Name: {element.name}</Text>
          <Text>Description: {element.name}</Text>
         
        </View>
      );
    });


      // return (
      //   <View><Text>HI</Text>
      //   </View>
      // )

  };

  return <View>{list()}</View>;
};

export default todo;



     