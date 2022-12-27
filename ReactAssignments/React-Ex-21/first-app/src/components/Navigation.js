import './Navigation.css';
import TopImage from './TopImage'
import Concerts from './Concerts';
import {CardsData} from '../service/CardsData'


function Navigation() {

    const img=
        {
           image: "./images/concert.jpg" 
        };

    return (   
        <div className="container">
        <nav class="navbar">
            <img src='./images/guitar.jpg' className="image"/>
            <p>SoundAMP</p>
        </nav>
        <TopImage data={img} />
        <Concerts items={CardsData}/>
        </div>
    );
}

export default Navigation;