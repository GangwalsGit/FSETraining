import React from 'react'


function Employee(props) {
    const emp=props.src;
  return (   
    <tr><td>{emp.id}</td><td>{emp.name}</td><td>{emp.dept}</td><td>{emp.desg}</td><td>{emp.sal}</td></tr>
  )
}

export default Employee