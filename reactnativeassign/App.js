import React from "react";
import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from '@react-navigation/native';

import Dashboard from "./components/src/components/Dashboard"
import Login from "./components/src/components/Login"
import todo from "./components/src/components/todo"
import addtodo from "./components/src/components/addtodo"


const Stack = createStackNavigator();

function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Login" component={Login} />
        <Stack.Screen name="Dashboard" component={Dashboard} />
        <Stack.Screen name="todo" component={todo} />
        <Stack.Screen name="addtodo" component={addtodo} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}

export default App;