
import './Concert.css';
function Concert(props) {
  return (
      <div className='concert'>
        <img src={props.image} className="image-props"/>
        <h2>{props.heading}</h2>
        <div >{props.description}</div>
      </div>
  );
}

export default Concert;
