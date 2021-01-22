// import React from 'react'
// import {View,Button,TextInput,Text} from 'react-native'

// class Print extends React.Component {
//     render() {
//         const {arr}=this.props.arr;
//         return(
//             <View>
         
//          const list = () => {
//     return array.map((element) => {
//       return (
//         <View >
//           {Element.name}
//         </View>
//       );
//     });
//   };
//             <Text>{list()}</Text>
//             </View>
//         )
//     } 
//   }

//   export default Print;


import React from 'react';
import {View, Text,Button} from 'react-native';

const Print = (props) => {

    
//   const array = [
//     {
//       key: '1',
//       title: 'example title 1',
//       subtitle: 'example subtitle 1',
//     },
//     {
//       key: '2',
//       title: 'example title 2',
//       subtitle: 'example subtitle 2',
//     },
//     {
//       key: '3',
//       title: 'example title 3',
//       subtitle: 'example subtitle 3',
//     },
//   ];

  const list = () => {
    return props.arr.map((element) => {
      return (
        <View >
          <Text>Name: {element.name}</Text>
          <Text>Description: {element.name}</Text>
          {/* <Button title="submit" onPress={()=>(this.props.handleDelete(element.id))}>delete</Button> */}
          <Button title="delete" onPress={()=>(props.handleDelete(element.id))} />
        </View>
      );
    });
  };

  return <View>{list()}</View>;
};

export default Print;