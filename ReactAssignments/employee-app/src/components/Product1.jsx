import React from 'react'
import  './Product1.css'


function Product1(props) {
  const products=props.data;
  return (
    <div className='productdiv'>  
            {products.map(product=>
              <div className='product'><img className='productImage' src={product.image}/></div>)}
    </div>
  )
}

export default Product1