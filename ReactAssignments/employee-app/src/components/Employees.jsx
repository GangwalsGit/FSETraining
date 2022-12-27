import React from 'react'
import  './Employees.css'
import Employee from './Employee';
import logo from '../logo.svg'

function Employees(props) {
    const emps= props.data;
  return (
    <div className='employeediv'>
        <h1>All Employees Data</h1>
        <hr/>
        <table>
            <tr><th>ID</th><th>Name</th><th>Dept</th><th>Desg</th><th>Sal</th></tr>
            {emps.map(emp=><Employee src={emp}></Employee>)}           
        </table>
    </div>
  )
}

export default Employees