import './TopImage.css';
import React from 'react'

function TopImage(props) {
    const product=props.data;
    return(
        <div >
           <img src={product.image} className="top-image"/>
        </div>
    );
}
export default TopImage;