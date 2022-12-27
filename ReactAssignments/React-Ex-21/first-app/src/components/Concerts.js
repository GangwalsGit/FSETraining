import Concert from './Concert';
import './Concerts.css';
//import './Expenses.css';

function Concerts(props) {
  return (
<div className="concerts">
      <Concert
        image={props.items[0].image}
        heading={props.items[0].heading}
        description={props.items[0].description}
      />
      <Concert
        image={props.items[1].image}
        heading={props.items[1].heading}
        description={props.items[1].description}
      />
      <Concert
        image={props.items[2].image}
        heading={props.items[2].heading}
        description={props.items[2].description}
      />
      <Concert
        image={props.items[3].image}
        heading={props.items[3].heading}
        description={props.items[3].description}
      />
      </div>
  );
}

export default Concerts;
