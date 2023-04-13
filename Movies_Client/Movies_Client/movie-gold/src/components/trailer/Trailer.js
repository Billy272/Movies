import { useParams } from 'react-router-dom';
import ReactPlayer from 'react-player';
import './Trailer.css';

const Trailer = () => {

    const { id } = useParams();
    let key = params.ytTrailerId;

    return(
        <div className="react-player-container">
            {(key!=null)?<ReactPlayer controls="true" playing={true} url={`https://www.youtube.com/`} />}
        </div>
    )
}
export default Trailer