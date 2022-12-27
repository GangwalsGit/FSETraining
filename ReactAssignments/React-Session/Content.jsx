import React from 'react'
import "./Content.css"
function Content() {
  return (
    <div className='content'>
    <div className='card card-1'>
        content1
        <div className='card-small card-small-1'>Div1</div>
        <div className='card-small card-small-2'>Div2</div>
    </div>
    <div  className='card card-2'>
        content2
    </div>
    <div  className='card card-3'>
        content3
    </div>
    </div>
  )
}

export default Content