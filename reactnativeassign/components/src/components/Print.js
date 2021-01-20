import React from 'react';
import {View, Text,Button} from 'react-native';

const Print = (props) => {

  const list = () => {
    return props.arr.map((element) => {
      return (
        <View >
          <Text>Title: {element.name}</Text>
          <Text>Description: {element.description}</Text>
          {/* <Button title="submit" onPress={()=>(this.props.handleDelete(element.id))}>delete</Button> */}
          <Button title="delete" onPress={()=>(props.handleDelete(element.id))} />
        </View>
      );
    });
  };

  return <View>{list()}</View>;
};

export default Print;